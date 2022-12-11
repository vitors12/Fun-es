package Funções;

import java.util.Scanner;

public class ex08 {
    public static void main(String[] args) {
        String a;
        System.out.print("Digite um numero inteiro ");
        Scanner key = new Scanner(System.in);
        a=key.next();
        if(a.matches("^[0-9]*$")){
            System.out.print(a.length());
        } else if(a.matches("^[0-9]*[.]?[0-9]*$")){
            System.out.print("Este não é um número inteiro");
        } else {
            System.out.print("Este não é um número inteiro");
        }
    } 
    
    { 
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Digite um número: ");
    String numero = sc.nextLine();
    System.out.println("A quantidade de dígitos informadas no número foi " + numero.length());
            sc.close();
        }
        }
    }

    

