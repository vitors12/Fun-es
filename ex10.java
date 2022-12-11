package Funções;

import java.util.Random;
import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        int t,d1,d2,c,t1,cd1,cd2,cont,j,j1;
        String d,jogo;
        j=0;
        j1=0;
        jogo="";
        while (j1==0) {
            Scanner sc = new Scanner(System.in);
            while (j == 0) {
                System.out.print("Você quer jogar 'CRAPS'? ");
                jogo = sc.next();
                if ((jogo.equalsIgnoreCase("s")) || (jogo.equalsIgnoreCase("sim")) || (jogo.equalsIgnoreCase("sim")) || (jogo.equalsIgnoreCase("n")) || (jogo.equalsIgnoreCase("na")) || (jogo.equalsIgnoreCase("nao")) || (jogo.equalsIgnoreCase("ñ")) || (jogo.equalsIgnoreCase("nã")) || (jogo.equalsIgnoreCase("não"))) {
                    j = 1;
                } else {
                    System.out.println("Resposta inválida.");
                }
            }
            j=0;
            if ((jogo.equalsIgnoreCase("s")) || (jogo.equalsIgnoreCase("si")) || (jogo.equalsIgnoreCase("sim"))) {
                System.out.print("Você deseja ultilizar os dados virtuais? ");
                d = sc.next();
                if ((d.equalsIgnoreCase("s")) || (d.equalsIgnoreCase("si")) || (d.equalsIgnoreCase("sim"))) {
                    sc.close();
                    Random rd = new Random();
                    d1 = rd.nextInt(1, 6);
                    d2 = rd.nextInt(1, 6);
                    t = d1 + d2;
                    cont = 1;
                    System.out.println("O valor do dado 1 é: " + d1 + "\nO valor do dado 2 é: " + d2 + "\nTotal dos dados: " + t);
                    if (t == 7 || t == 11) {
                        System.out.println("Você é um 'Natural'; você ganhou.\n");
                    } else if (t == 2 || t == 3 || t == 12) {
                        System.out.println("Você é um 'Craps'; você perdeu.\n");
                    } else {
                        System.out.println("Seu ponto é: " + t + "\nSeu objetivo é tirar novamente este valor, ates de tirar um 7.\n");
                        c = t;
                        t1 = 0;
                        while (t1 == 0) {
                            d1 = rd.nextInt(1, 7);
                            d2 = rd.nextInt(1, 7);
                            t = d1 + d2;
                            cont = cont + 1;
                            System.out.println("JOGADA " + cont + "\nO valor do dado 1 é: " + d1 + "\nO valor do dado 2 é: " + d2 + "\nTotal dos dados: " + t + "\n");
                            if (t == c || t == 7) {
                                t1 = 1;
                            }
                        }
                        if (t == 7) {
                            System.out.println("Você perdeu.\n");
                        } else {
                            System.out.println("Você ganhou.\n");
                        }
                    }
                } else if ((d.equalsIgnoreCase("n")) || (d.equalsIgnoreCase("na")) || (d.equalsIgnoreCase("nao")) || (d.equalsIgnoreCase("ñ")) || (d.equalsIgnoreCase("nã")) || (d.equalsIgnoreCase("não"))) {
                    cd1 = 0;
                    cd2 = 0;
                    d1 = 90;
                    d2 = 90;
                    while (cd1 == 0) {
                        System.out.print("Digite o valor do primeiro dado: ");
                        d1 = sc.nextInt();
                        if (d1 < 1 || d1 > 6) {
                            System.out.println("Valor do dado inválido.");
                        } else {
                            cd1 = 1;
                        }
                    }
                    while (cd2 == 0) {
                        System.out.print("Digite o valor do segundo dado: ");
                        d2 = sc.nextInt();
                        if (d2 < 1 || d2 > 6) {
                            System.out.println("Valor do dado inválido.");
                        } else {
                            cd2 = 1;
                        }
                    }
                    t = d1 + d2;
                    cont = 1;
                    System.out.println("O valor total dos dados é: " + t);
                    if (t == 7 || t == 11) {
                        System.out.println("Você é um 'Natural'; você ganhou.\n");
                    } else if (t == 2 || t == 3 || t == 12) {
                        System.out.println("Você é um 'Craps'; você perdeu.\n");
                    } else {
                        System.out.println("Seu ponto é: " + t + "\nSeu objetivo é tirar novamente este valor, ates de tirar um 7.\n");
                        c = t;
                        t1 = 0;
                        while (t1 == 0) {
                            cd1 = 0;
                            cd2 = 0;
                            while (cd1 == 0) {
                                System.out.print("Digite o valor do primeiro dado: ");
                                d1 = sc.nextInt();
                                if (d1 < 1 || d1 > 6) {
                                    System.out.println("Valor do dado inválido.");
                                } else {
                                    cd1 = 1;
                                }
                            }
                            while (cd2 == 0) {
                                System.out.print("Digite o valor do segundo dado: ");
                                d2 = sc.nextInt();
                                if (d2 < 1 || d2 > 6) {
                                    System.out.println("Valor do dado inválido.");
                                } else {
                                    cd2 = 1;
                                }
                            }
                            t = d1 + d2;
                            cont = cont + 1;
                            System.out.println("JOGADA " + cont + "\nO valor total dos dados é: " + t);
                            if (t == c || t == 7) {
                                t1 = 1;
                            }
                        }
                        if (t == 7) {
                            System.out.println("Você perdeu.\n");
                        } else {
                            System.out.println("Você ganhou.\n");
                        }
                    }
                    sc.close();
                } else {
                    System.out.println("Resposta inválida.");
                }
            } else {
                System.out.print("Jogo encerrado.");
                j1=1;
                sc.close();
            }
        }
    }
}
