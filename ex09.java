package Funções;

import java.util.Scanner;

public class ex09 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        String w;
        char[] p;
        int k, i=0;
        System.out.print("Digite um número inteiro");
        try (Scanner sc = new Scanner(System.in)) {
            w=sc.next();
            sc.close();
        }
        if (w.matches("^[0-9]*$")){
            k=w.length();
            p=w.toCharArray();
            while (i<k){
                System.out.print(p[((k-1)-(i))]);
                i=i+1;
            }
        } else if (w.matches("^[0-9]*[.]?[0-9]*$")) {
            System.out.println(w + "não é um número inteiro");
        } else {
            System.out.print(w + "não é um número");
        }
    }
}
