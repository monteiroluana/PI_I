/*
27/04/17
Jogo da Velha 
 */
package Aula;
//@Monteiro

import java.util.Random;
import java.util.Scanner;

;

public class JogoDaVelha {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Random rng = new Random();

        /*Variaveis ALL*/
        String p1 = "", p2 = "", p3 = "", p4 = "", p5 = "", p6 = "", p7 = "", p8 = "", p9 = "";
        String vez = "", posicao, pAnterior = "0";

        int opcaoDeJogo = 0;

        /*1 Monstrando tabuleiro*/
        String mosTabuleiro = "POSIÇÕES\n";
        mosTabuleiro += " 1 | 2 | 3 \n";
        mosTabuleiro += "---|---|---\n";
        mosTabuleiro += " 4 | 5 | 6 \n";
        mosTabuleiro += "---|---|---\n";
        mosTabuleiro += " 7 | 8 | 9 \n";
        System.out.println(mosTabuleiro);

        while (opcaoDeJogo != 1 && opcaoDeJogo != 2) {
            /*Escolhendo a tipo de jogo, se contra outro jogador ou contra o computador*/
            System.out.print("\nOPÇÕES DE JOGO\n(1) p1 vs p2\n(2) p1 vs com\nJogar com: ");
            opcaoDeJogo = console.nextInt();
        }
        /*DOIS JOGADORES*/
        if (opcaoDeJogo == 1) {

            int i = 0;
            do {
                /*POSIÇÃO DA JOGADA*/
                System.out.print("\nPosição da Jogada: ");
                posicao = console.next();

                /*VALIDANDO POSIÇÃO 
                
                pAnterior é uma String que está guardando as posicões que já foram jogadas
                
                (!pAnterior.contains(posicao))
                verificando se na variável pAnterior possui um caracter igual a variável posicao
                 */
                if (!pAnterior.contains(posicao)) {
                    if (posicao.equals("1") || posicao.equals("2") || posicao.equals("3") || posicao.equals("4") || posicao.equals("5") || posicao.equals("6") || posicao.equals("7") || posicao.equals("8") || posicao.equals("9")) {
                        pAnterior += posicao;
                        i++;

                        /*DE QUEM É A VEZ*/
                        if (vez.equals("X")) {
                            vez = "O";
                        } else {
                            vez = "X";
                        }
                        System.out.println("(" + vez + ") jogou na posição " + posicao);

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

                        /*VERIFICANDO SE TEM UM VENCEDOR
                        
                        (!p1.isEmpty())
                        está verificando se a variável não está vazia
                        OBS: se eu deixar sem fazer essa verificação, o código vai mostrar um
                        vencedor quando as variáveis estiverem vazias.
                         */
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
                        } else if (!p1.isEmpty() && !p2.isEmpty() && !p3.isEmpty() && !p4.isEmpty() && !p5.isEmpty() && !p6.isEmpty() && !p7.isEmpty() && !p8.isEmpty() && !p9.isEmpty()) {
                            System.out.println("EMPATE!");
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

            /*CONTRA O COMPUTADOR*/
        } else if (opcaoDeJogo == 2) {

            int computador, i = 0, pdj = 1;
            do {
                /*VALIDANDO POSIÇÃO */
                if (pdj % 2 != 0) {
                    System.out.print("\nPosição da Jogada: ");
                    posicao = console.next();

                } else {
                    computador = rng.nextInt(9) + 1;
                    posicao = Integer.toString(computador);

//                    System.out.println("Computador: " + posicao);
                }

                if (!pAnterior.contains(posicao)) {
                    if (posicao.equals("1") || posicao.equals("2") || posicao.equals("3") || posicao.equals("4") || posicao.equals("5") || posicao.equals("6") || posicao.equals("7") || posicao.equals("8") || posicao.equals("9")) {
                        pAnterior += posicao;
                        i++;
                        pdj++;

                        /*DE QUEM É A VEZ*/
                        if (vez.equals("X")) {
                            vez = "O";
                        } else {
                            vez = "X";
                        }
                        System.out.println("(" + vez + ") jogou na posição " + posicao);

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
                        } else if (!p1.isEmpty() && !p2.isEmpty() && !p3.isEmpty() && !p4.isEmpty() && !p5.isEmpty() && !p6.isEmpty() && !p7.isEmpty() && !p8.isEmpty() && !p9.isEmpty()) {
                            System.out.println("EMPATE!");
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
}
