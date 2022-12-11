package Funções;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        int n, i=0, j=0;
        System.out.print("Qual o valor de n ? ");
        Scanner key = new Scanner(System.in);
        n=key.nextInt();
        key.close();
        while (i<(n+1)){
            while (j<i){
                System.out.print((j+1) + " ");
                j=j+1;
            }
            System.out.println();
            j=0;
            i=i+1;
        }
    }
}
