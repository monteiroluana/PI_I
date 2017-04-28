/*
27/04/17
Jogo da Veha COMPLETO
 */
package Aula;
//@Monteiro

import java.util.Scanner;

public class JogoDaVelha {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String p1 = "", p2 = "", p3 = "", p4 = "", p5 = "", p6 = "", p7 = "", p8 = "", p9 = "";
        String vez = "", posicao, pAnterior = "0";
        int i = 0;

        /*1 Monstrando tabuleiro*/
        String mosTabuleiro = " 1 | 2 | 3 \n";
        mosTabuleiro += "---|---|---\n";
        mosTabuleiro += " 4 | 5 | 6 \n";
        mosTabuleiro += "---|---|---\n";
        mosTabuleiro += " 7 | 8 | 9 \n";
        System.out.println(mosTabuleiro);

        do {

            /*POSIÇÃO DA JOGADA*/
            System.out.print("Posição: ");
            posicao = console.next();

            /*Verificando se a posição é igual a 1,2,3,4,5,6,7,8,9 */
            if (!pAnterior.contains(posicao)) {
                if (posicao.equals("1") || posicao.equals("2") || posicao.equals("3") || posicao.equals("4") || posicao.equals("5") || posicao.equals("6") || posicao.equals("7") || posicao.equals("8") || posicao.equals("9")) {
                    pAnterior += posicao;
                    i++;

                    /*DE QUEM É A VEZ*/
                    vez = vez.toUpperCase();
                    if (vez.equals("X")) {
                        vez = "O";
                    } else {
                        vez = "X";
                    }
                    System.out.println("Vez do: " + vez);

                    switch (posicao) {

                        case "1":
                            p1 = vez;
                            break;
                        case "2":
                            p2 = vez;
                            break;
                        case "3":
                            p3 = vez;
                            break;
                        case "4":
                            p4 = vez;
                            break;
                        case "5":
                            p5 = vez;
                            break;
                        case "6":
                            p6 = vez;
                            break;
                        case "7":
                            p7 = vez;
                            break;
                        case "8":
                            p8 = vez;
                            break;
                        case "9":
                            p9 = vez;
                            break;

                    }

                    /*MOSTRANDO A JOGADA*/
                    String Tabuleiro = "";
                    Tabuleiro += " " + p1 + " | " + p2 + " | " + p3 + " \n";
                    Tabuleiro += "---|---|---\n";
                    Tabuleiro += " " + p4 + " | " + p5 + " | " + p6 + " \n";
                    Tabuleiro += "---|---|---\n";
                    Tabuleiro += " " + p7 + " | " + p8 + " | " + p9 + " \n";
                    System.out.println(Tabuleiro);

                    /*VERIFICANDO SE TEM UM VENCEDOR*/
                    if (!p1.isEmpty() && p1.equals(p2) && p1.equals(p3)) {
                        System.out.println(p1 + " VENCEU!");
                        break;
                    } else if (!p2.isEmpty() && p2.equals(p5) && p5.equals(p8)) {
                        System.out.println(p2 + " VENCEU!");
                        break;
                    } else if (!p3.isEmpty() && p3.equals(p6) && p6.equals(p9)) {
                        System.out.println(p3 + " VENCEU!");
                        break;

                    } else if (!p1.isEmpty() && p1.equals(p2) && p2.equals(p3)) {
                        System.out.println(p1 + " VENCEU!");
                        break;
                    } else if (!p4.isEmpty() && p4.equals(p5) && p5.equals(p6)) {
                        System.out.println(p4 + " VENCEU!");
                        break;
                    } else if (!p7.isEmpty() && p7.equals(p8) && p8.equals(p9)) {
                        System.out.println(p7 + " VENCEU!");
                        break;

                    } else if (!p1.isEmpty() && p1.equals(p5) && p5.equals(p9)) {
                        System.out.println(p1 + " VENCEU!");
                        break;
                    } else if (!p3.isEmpty() && p3.equals(p5) && p5.equals(p7)) {
                        System.out.println(p3 + " VENCEU!");
                        break;
                    }

                    /*POSIÇÕES INVÁLIDAS*/
                } else {
                    System.out.println("Posição inválida");
                }
            } else {
                System.out.println("Posição inválida");
            }

        } while (i <= 9);

    }
}
