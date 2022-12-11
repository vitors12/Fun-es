package Funções;

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        double w,x,y;
        Scanner key = new Scanner(System.in);
        System.out.print("Digite o primeiro argumento: ");
        w=key.nextDouble();
        System.out.print("Digite o segundo argumento: ");
        x=key.nextDouble();
        System.out.print("Digite o terceiro argumento: ");
        y=key.nextDouble();
        key.close();
        w=w+x+y;
        System.out.print("A soma dos argumentos é " + w);
    }
}
