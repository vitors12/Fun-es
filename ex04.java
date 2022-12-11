package Funções;

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        double j;
        System.out.print("Digite um numero ");
        Scanner key = new Scanner(System.in);
        j=key.nextDouble();
        key.close();
        if (j>0) {
            System.out.print("P");
        } else {
            System.out.print("N");
        }
    }
}
