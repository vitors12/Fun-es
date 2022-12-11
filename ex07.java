package Funções;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ex07 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        //entrada de dados
        double valorParcela, valorPagamento, total=0;
        int diasPendentes, k=0;
        DecimalFormat d = new DecimalFormat("R$###,###,###,###,###,##0.00");
        System.out.print("Digite o valor da parcela ");
        Scanner key = new Scanner(System.in);
        valorParcela=key.nextDouble();
        while (valorParcela!=0){
            if (valorParcela>0){
                System.out.print("Digite os dias em atraso ");
                diasPendentes=key.nextInt();
                if (diasPendentes>=0){
                    if (diasPendentes==0){
                        valorPagamento=valorParcela;
                    } else {
                        valorPagamento=(valorParcela*1.03*(1+(diasPendentes*0.001)));
                    }
                    total=total+valorPagamento;
                    k=k+1;
                    System.out.println("O valor a ser pago é "+d.format(valorPagamento));
                } else {
                    System.out.println("A quantidade de dias em atraso não pode ser negativa");
                }
            } else {
                System.out.println("O valor da parcela não pode ser negativa");
            }
            System.out.print("Digite o valor da parcela ");
            valorParcela=key.nextDouble();
        }
        key.close();
        System.out.print("Foi pago um total de "+k+" parcelas resultando "+d.format(total));
    }
}
