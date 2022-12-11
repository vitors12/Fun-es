package Funções;

import java.util.Random;
import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
        String e, aux;
        String[] s;
        int i=0, j=0, c=0, r=0;
        System.out.print("Digite a palavra a ser embaralhada ");
        Scanner sc = new Scanner(System.in);
        e=sc.next();
        sc.close();
        e=e.toUpperCase();
        c=e.length();
        s=e.split("");
        Random rd = new Random();
        while (i<c){
            while (j<c) {
                r= rd.nextInt(2);
                if (r==0) {
                    if (j==0||j<(c-1)) {
                        aux = (s[(j)]);
                        s[j] = s[(j+1)];
                        s[(j+1)] = aux;
                    } else {
                        aux = (s[(j)]);
                        s[j] = s[(j-1)];
                        s[(j-1)] = aux;
                    }
                }
                j=j+1;
            }
            j=0;
            i=i+1;
        }
        i=0;
        while (i<c){
            System.out.print(s[i]);
            i=i+1;
        }
    }
}
