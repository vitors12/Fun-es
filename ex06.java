package Funções;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ex06 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        String l="s";
        int u, o, f=0;
        DecimalFormat d = new DecimalFormat("00");
        Scanner key = new Scanner(System.in);
        while (f!=1) {
            System.out.print("Você almeja converter um horário na notação de 24 horas para a notação de 12 horas ? (Digite s para sim ou n para não)");
            l = key.next();
            if ((l.equalsIgnoreCase("s"))||(l.equalsIgnoreCase("n"))){
                f=1;
            }else {
                System.out.println("Digito inválido.");
                f=0;
            }
        }
        while (l.equalsIgnoreCase("s")) {
            f=0;
            System.out.print("Digite a hora: ");
            u = key.nextInt();
            if ((u < 0) || (u > 23)) {
                System.out.println("Valor incorreto para hora.");
            } else {
                System.out.print("Digite os munutos: ");
                o = key.nextInt();
                if ((o < 0) || (o > 59)) {
                    System.out.println("Valor incorreto para os minutos.");
                } else {
                    if (u>12){
                        u=u-12;
                        System.out.println("São: "+d.format(u)+":"+d.format(o)+" P.M.");
                    } else {
                        System.out.println("São: "+d.format(u)+":"+d.format(o)+" A.M.");
                    }
                    
                    }
                }
            }
        }
    }


    