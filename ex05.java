package Funções;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        double somaImposto, taxaImposto, custo;
        DecimalFormat d = new DecimalFormat("R$###,###,###,###,###.00");
        System.out.print("Qual é a taxa do imposto de forma percentual? ");
        Scanner key = new Scanner(System.in);
        taxaImposto= key.nextDouble();
        taxaImposto=taxaImposto/100;
        System.out.print("Qual o valor do produto desconsiderando os impostos ? ");
        custo= key.nextDouble();
        key.close();
        somaImposto=custo*taxaImposto;
        System.out.print("O valor do produto com os impostos é " + d .format(somaImposto));
    }
}
