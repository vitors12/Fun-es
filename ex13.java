package Funções;

import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {
        String linha, coluna;
        int l=0, c=0, i=0, j=0;
        Scanner sc = new Scanner(System.in);
        while (i==0) {
            System.out.print("Informe o numero de linhas de 1 a 20 ");
            linha = sc.next();
            if ((linha.matches("^[0-9]*$"))||(linha.length()<1)){
                l=Integer.parseInt(linha);
                if (l<=0){
                    l=1;
                } else if (l>=20) {
                    l=20;
                }
                i=1;
            } else {
                System.out.println("Digite um numero inteiro válido de 1 a 20");
            }
        }
        i=0;
        while (i==0) {
            System.out.print("Informe o numero de colunas de 1 a 20: ");
            coluna = sc.next();
            if ((coluna.matches("^[0-9]*$"))||(coluna.length()<1)){
                c=Integer.parseInt(coluna);
                if (c<=0){
                    c=1;
                } else if (c>=20) {
                    c=20;
                }
                i=1;
            } else {
                System.out.println("Digite um numero inteiro válido de 1 a 20");
            }
        }
        i=0;
        sc.close();
        while (i<l){
            if (i==0||i==(l-1)){
                while (j<c){
                    if (j==0||j==(c-1)){
                        System.out.print("+");
                    } else {
                        System.out.print("---");
                    }
                    j=j+1;
                }
                System.out.println("");
                j=0;
            } else {
                while (j<c){
                    if (j==0||j==(c-1)){
                        System.out.print("|");
                    } else {
                        System.out.print("   ");
                    }
                    j=j+1;
                }
                System.out.println("");
                j=0;
            }
            i=i+1;
        }
    }
}
