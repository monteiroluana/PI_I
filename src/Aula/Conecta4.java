/* Desenvolva o jogo Conecta-4 usando, também, os conceitos de tratamento de erros, funções e matrizes.
 O Conecta-4 é um jogo de tabuleiro parecido com o Jogo-da-Velha. As diferenças são:
 Joga-se em um tabuleiro de 6 linhas por 7 colunas; Ganha que faz uma linha, coluna ou diagonal de 4 peças; Não se pode jogar em qualquer linha. Escolhe-se uma coluna e sua peça é colocada nessa coluna "caindo" até a posição disponível. */package Aula;//@Monteiro

import java.util.Scanner;

public class Conecta4 {

    static String[][] tabuleiro = new String[6][7];

    public static void main(String[] args) {
        for (int linha = 0; linha < tabuleiro.length; linha++) {
            for (int coluna = 0; coluna < tabuleiro[linha].length; coluna++) {
                tabuleiro[linha][coluna] = ".";
            }
        }
        /*Mostrando o tabuleiro*/ vertabuleiro();
        String vez = "";
        int i = 0;
        do {
            /*De quem e a vez*/ if (vez.equals("X")) {
                vez = "O";
                System.out.println("Jogador 2");
            } else {
                vez = "X";
                System.out.println("Jogador 1");
            }
            boolean validPosicao = false;
            while (!validPosicao) {
                /*Ler Posicao*/ String posicao = lerPosicao();
                switch (posicao) {
                    case "a":
                        if (tabuleiro[5][0].equals(".")) {
                            tabuleiro[5][0] = vez;
                            validPosicao = true;
                        } else if (tabuleiro[4][0].equals(".")) {
                            tabuleiro[4][0] = vez;
                            validPosicao = true;
                        } else if (tabuleiro[3][0].equals(".")) {
                            tabuleiro[3][0] = vez;
                            validPosicao = true;
                        } else if (tabuleiro[2][0].equals(".")) {
                            tabuleiro[2][0] = vez;
                            validPosicao = true;
                        } else if (tabuleiro[1][0].equals(".")) {
                            tabuleiro[1][0] = vez;
                            validPosicao = true;
                        } else if (tabuleiro[0][0].equals(".")) {
                            tabuleiro[0][0] = vez;
                            validPosicao = true;
                        } else {
                            System.out.println("**jogada Inválida**");
                            validPosicao = false;
                        }
                        break;
                    case "b":
                        if (tabuleiro[5][1].equals(".")) {
                            tabuleiro[5][1] = vez;
                            validPosicao = true;
                        } else if (tabuleiro[4][1].equals(".")) {
                            tabuleiro[4][1] = vez;
                            validPosicao = true;
                        } else if (tabuleiro[3][1].equals(".")) {
                            tabuleiro[3][1] = vez;
                            validPosicao = true;
                        } else if (tabuleiro[2][1].equals(".")) {
                            tabuleiro[2][1] = vez;
                            validPosicao = true;
                        } else if (tabuleiro[1][1].equals(".")) {
                            tabuleiro[1][1] = vez;
                            validPosicao = true;
                        } else if (tabuleiro[0][1].equals(".")) {
                            tabuleiro[0][1] = vez;
                            validPosicao = true;
                        } else {
                            System.out.println("**jogada Inválida**");
                            validPosicao = false;
                        }
                        break;
                    case "c":
                        if (tabuleiro[5][2].equals(".")) {
                            tabuleiro[5][2] = vez;
                            validPosicao = true;
                        } else if (tabuleiro[4][2].equals(".")) {
                            tabuleiro[4][2] = vez;
                            validPosicao = true;
                        } else if (tabuleiro[3][2].equals(".")) {
                            tabuleiro[3][2] = vez;
                            validPosicao = true;
                        } else if (tabuleiro[2][2].equals(".")) {
                            tabuleiro[2][2] = vez;
                            validPosicao = true;
                        } else if (tabuleiro[1][2].equals(".")) {
                            tabuleiro[1][2] = vez;
                            validPosicao = true;
                        } else if (tabuleiro[0][2].equals(".")) {
                            tabuleiro[0][2] = vez;
                            validPosicao = true;
                        } else {
                            System.out.println("**jogada Inválida**");
                            validPosicao = false;
                        }
                        break;
                    case "d":
                        if (tabuleiro[5][3].equals(".")) {
                            tabuleiro[5][3] = vez;
                            validPosicao = true;
                        } else if (tabuleiro[4][3].equals(".")) {
                            tabuleiro[4][3] = vez;
                            validPosicao = true;
                        } else if (tabuleiro[3][3].equals(".")) {
                            tabuleiro[3][3] = vez;
                            validPosicao = true;
                        } else if (tabuleiro[2][3].equals(".")) {
                            tabuleiro[2][3] = vez;
                            validPosicao = true;
                        } else if (tabuleiro[1][3].equals(".")) {
                            tabuleiro[1][3] = vez;
                            validPosicao = true;
                        } else if (tabuleiro[0][3].equals(".")) {
                            tabuleiro[0][3] = vez;
                            validPosicao = true;
                        } else {
                            System.out.println("**jogada Inválida**");
                            validPosicao = false;
                        }
                        break;
                    case "e":
                        if (tabuleiro[5][4].equals(".")) {
                            tabuleiro[5][4] = vez;
                            validPosicao = true;
                        } else if (tabuleiro[4][4].equals(".")) {
                            tabuleiro[4][4] = vez;
                            validPosicao = true;
                        } else if (tabuleiro[3][4].equals(".")) {
                            tabuleiro[3][4] = vez;
                            validPosicao = true;
                        } else if (tabuleiro[2][4].equals(".")) {
                            tabuleiro[2][4] = vez;
                            validPosicao = true;
                        } else if (tabuleiro[1][4].equals(".")) {
                            tabuleiro[1][4] = vez;
                            validPosicao = true;
                        } else if (tabuleiro[0][4].equals(".")) {
                            tabuleiro[0][4] = vez;
                            validPosicao = true;
                        } else {
                            System.out.println("**jogada Inválida**");
                            validPosicao = false;
                        }
                        break;
                    case "f":
                        if (tabuleiro[5][5].equals(".")) {
                            tabuleiro[5][5] = vez;
                            validPosicao = true;
                        } else if (tabuleiro[4][5].equals(".")) {
                            tabuleiro[4][5] = vez;
                            validPosicao = true;
                        } else if (tabuleiro[3][5].equals(".")) {
                            tabuleiro[3][5] = vez;
                            validPosicao = true;
                        } else if (tabuleiro[2][5].equals(".")) {
                            tabuleiro[2][5] = vez;
                            validPosicao = true;
                        } else if (tabuleiro[1][5].equals(".")) {
                            tabuleiro[1][5] = vez;
                            validPosicao = true;
                        } else if (tabuleiro[0][5].equals(".")) {
                            tabuleiro[0][5] = vez;
                            validPosicao = true;
                        } else {
                            System.out.println("**jogada Inválida**");
                            validPosicao = false;
                        }
                        break;
                    case "g":
                        if (tabuleiro[5][6].equals(".")) {
                            tabuleiro[5][6] = vez;
                            validPosicao = true;
                        } else if (tabuleiro[4][6].equals(".")) {
                            tabuleiro[4][6] = vez;
                            validPosicao = true;
                        } else if (tabuleiro[3][6].equals(".")) {
                            tabuleiro[3][6] = vez;
                            validPosicao = true;
                        } else if (tabuleiro[2][6].equals(".")) {
                            tabuleiro[2][6] = vez;
                            validPosicao = true;
                        } else if (tabuleiro[1][6].equals(".")) {
                            tabuleiro[1][6] = vez;
                            validPosicao = true;
                        } else if (tabuleiro[0][6].equals(".")) {
                            tabuleiro[0][6] = vez;
                            validPosicao = true;
                        } else {
                            System.out.println("**jogada Inválida**");
                            validPosicao = false;
                        }
                        break;
                }
            }
            /*Mostrando o tabuleiro*/ vertabuleiro();
            /*VENCEDOR HORIZONTAL*/ if (!tabuleiro[5][0].equals(".") && tabuleiro[5][0].equals(tabuleiro[5][1]) && tabuleiro[5][0].equals(tabuleiro[5][2]) && tabuleiro[5][0].equals(tabuleiro[5][3])) {
                System.out.println("Vencedor!");
                break;
            } else if (!tabuleiro[5][1].equals(".") && tabuleiro[5][1].equals(tabuleiro[5][2]) && tabuleiro[5][1].equals(tabuleiro[5][3]) && tabuleiro[5][1].equals(tabuleiro[5][4])) {
                System.out.println("Vencedor!");
                break;
            } else if (!tabuleiro[5][2].equals(".") && tabuleiro[5][2].equals(tabuleiro[5][3]) && tabuleiro[5][2].equals(tabuleiro[5][4]) && tabuleiro[5][2].equals(tabuleiro[5][5])) {
                System.out.println("Vencedor!");
                break;
            } else if (!tabuleiro[5][3].equals(".") && tabuleiro[5][3].equals(tabuleiro[5][4]) && tabuleiro[5][3].equals(tabuleiro[5][5]) && tabuleiro[5][3].equals(tabuleiro[5][6])) {
                System.out.println("Vencedor!");
                break;
            } else if (!tabuleiro[4][0].equals(".") && tabuleiro[4][0].equals(tabuleiro[4][1]) && tabuleiro[4][0].equals(tabuleiro[4][2]) && tabuleiro[4][0].equals(tabuleiro[4][3])) {
                System.out.println("Vencedor!");
                break;
            } else if (!tabuleiro[4][1].equals(".") && tabuleiro[4][1].equals(tabuleiro[4][2]) && tabuleiro[4][1].equals(tabuleiro[4][3]) && tabuleiro[4][1].equals(tabuleiro[4][4])) {
                System.out.println("Vencedor!");
                break;
            } else if (!tabuleiro[4][2].equals(".") && tabuleiro[4][2].equals(tabuleiro[4][3]) && tabuleiro[4][2].equals(tabuleiro[4][4]) && tabuleiro[4][2].equals(tabuleiro[4][5])) {
                System.out.println("Vencedor!");
                break;
            } else if (!tabuleiro[4][3].equals(".") && tabuleiro[4][3].equals(tabuleiro[4][4]) && tabuleiro[4][3].equals(tabuleiro[4][5]) && tabuleiro[4][3].equals(tabuleiro[4][6])) {
                System.out.println("Vencedor!");
                break;
            } else if (!tabuleiro[3][0].equals(".") && tabuleiro[3][0].equals(tabuleiro[3][1]) && tabuleiro[3][0].equals(tabuleiro[3][2]) && tabuleiro[3][0].equals(tabuleiro[3][3])) {
                System.out.println("Vencedor!");
                break;
            } else if (!tabuleiro[3][1].equals(".") && tabuleiro[3][1].equals(tabuleiro[3][2]) && tabuleiro[3][1].equals(tabuleiro[3][3]) && tabuleiro[3][1].equals(tabuleiro[3][4])) {
                System.out.println("Vencedor!");
                break;
            } else if (!tabuleiro[3][2].equals(".") && tabuleiro[3][2].equals(tabuleiro[3][3]) && tabuleiro[3][2].equals(tabuleiro[3][4]) && tabuleiro[3][2].equals(tabuleiro[3][5])) {
                System.out.println("Vencedor!");
                break;
            } else if (!tabuleiro[3][3].equals(".") && tabuleiro[3][3].equals(tabuleiro[3][4]) && tabuleiro[3][3].equals(tabuleiro[3][5]) && tabuleiro[3][3].equals(tabuleiro[3][6])) {
                System.out.println("Vencedor!");
                break;
            } else if (!tabuleiro[2][0].equals(".") && tabuleiro[2][0].equals(tabuleiro[2][1]) && tabuleiro[2][0].equals(tabuleiro[2][2]) && tabuleiro[2][0].equals(tabuleiro[2][3])) {
                System.out.println("Vencedor!");
                break;
            } else if (!tabuleiro[2][1].equals(".") && tabuleiro[2][1].equals(tabuleiro[2][2]) && tabuleiro[2][1].equals(tabuleiro[2][3]) && tabuleiro[2][1].equals(tabuleiro[2][4])) {
                System.out.println("Vencedor!");
                break;
            } else if (!tabuleiro[2][2].equals(".") && tabuleiro[2][2].equals(tabuleiro[2][3]) && tabuleiro[2][2].equals(tabuleiro[2][4]) && tabuleiro[2][2].equals(tabuleiro[2][5])) {
                System.out.println("Vencedor!");
                break;
            } else if (!tabuleiro[2][3].equals(".") && tabuleiro[2][3].equals(tabuleiro[2][4]) && tabuleiro[2][3].equals(tabuleiro[2][5]) && tabuleiro[2][3].equals(tabuleiro[2][6])) {
                System.out.println("Vencedor!");
                break;
            } else if (!tabuleiro[1][0].equals(".") && tabuleiro[1][0].equals(tabuleiro[1][1]) && tabuleiro[1][0].equals(tabuleiro[1][2]) && tabuleiro[1][0].equals(tabuleiro[1][3])) {
                System.out.println("Vencedor!");
                break;
            } else if (!tabuleiro[1][1].equals(".") && tabuleiro[1][1].equals(tabuleiro[1][2]) && tabuleiro[1][1].equals(tabuleiro[1][3]) && tabuleiro[1][1].equals(tabuleiro[1][4])) {
                System.out.println("Vencedor!");
                break;
            } else if (!tabuleiro[1][2].equals(".") && tabuleiro[1][2].equals(tabuleiro[1][3]) && tabuleiro[1][2].equals(tabuleiro[1][4]) && tabuleiro[1][2].equals(tabuleiro[1][5])) {
                System.out.println("Vencedor!");
                break;
            } else if (!tabuleiro[1][3].equals(".") && tabuleiro[1][3].equals(tabuleiro[1][4]) && tabuleiro[1][3].equals(tabuleiro[1][5]) && tabuleiro[1][3].equals(tabuleiro[1][6])) {
                System.out.println("Vencedor!");
                break;
            } else if (!tabuleiro[0][0].equals(".") && tabuleiro[0][0].equals(tabuleiro[0][1]) && tabuleiro[0][0].equals(tabuleiro[0][2]) && tabuleiro[0][0].equals(tabuleiro[0][3])) {
                System.out.println("Vencedor!");
                break;
            } else if (!tabuleiro[0][1].equals(".") && tabuleiro[0][1].equals(tabuleiro[0][2]) && tabuleiro[0][1].equals(tabuleiro[0][3]) && tabuleiro[0][1].equals(tabuleiro[0][4])) {
                System.out.println("Vencedor!");
                break;
            } else if (!tabuleiro[0][2].equals(".") && tabuleiro[0][2].equals(tabuleiro[0][3]) && tabuleiro[0][2].equals(tabuleiro[0][4]) && tabuleiro[0][2].equals(tabuleiro[0][5])) {
                System.out.println("Vencedor!");
                break;
            } else if (!tabuleiro[0][3].equals(".") && tabuleiro[0][3].equals(tabuleiro[0][4]) && tabuleiro[0][3].equals(tabuleiro[0][5]) && tabuleiro[0][3].equals(tabuleiro[0][6])) {
                System.out.println("Vencedor!");
                break;
                /*VENCEDOR VERTICAL*/            } else if (!tabuleiro[5][0].equals(".") && tabuleiro[5][0].equals(tabuleiro[4][0]) && tabuleiro[5][0].equals(tabuleiro[3][0]) && tabuleiro[5][0].equals(tabuleiro[2][0])) {
                System.out.println("Vencedor!");
                break;
            } else if (!tabuleiro[4][0].equals(".") && tabuleiro[4][0].equals(tabuleiro[3][0]) && tabuleiro[4][0].equals(tabuleiro[2][0]) && tabuleiro[4][0].equals(tabuleiro[1][0])) {
                System.out.println("Vencedor!");
                break;
            } else if (!tabuleiro[3][0].equals(".") && tabuleiro[3][0].equals(tabuleiro[2][0]) && tabuleiro[3][0].equals(tabuleiro[1][0]) && tabuleiro[3][0].equals(tabuleiro[0][0])) {
                System.out.println("Vencedor!");
                break;
            } else if (!tabuleiro[5][1].equals(".") && tabuleiro[5][1].equals(tabuleiro[4][1]) && tabuleiro[5][1].equals(tabuleiro[3][1]) && tabuleiro[5][1].equals(tabuleiro[2][1])) {
                System.out.println("Vencedor!");
                break;
            } else if (!tabuleiro[4][1].equals(".") && tabuleiro[4][1].equals(tabuleiro[3][1]) && tabuleiro[4][1].equals(tabuleiro[2][1]) && tabuleiro[4][1].equals(tabuleiro[1][1])) {
                System.out.println("Vencedor!");
                break;
            } else if (!tabuleiro[3][1].equals(".") && tabuleiro[3][1].equals(tabuleiro[2][1]) && tabuleiro[3][1].equals(tabuleiro[1][1]) && tabuleiro[3][1].equals(tabuleiro[0][1])) {
                System.out.println("Vencedor!");
                break;
            } else if (!tabuleiro[5][2].equals(".") && tabuleiro[5][2].equals(tabuleiro[4][2]) && tabuleiro[5][2].equals(tabuleiro[3][2]) && tabuleiro[5][2].equals(tabuleiro[2][2])) {
                System.out.println("Vencedor!");
                break;
            } else if (!tabuleiro[4][2].equals(".") && tabuleiro[4][2].equals(tabuleiro[3][2]) && tabuleiro[4][2].equals(tabuleiro[2][2]) && tabuleiro[4][2].equals(tabuleiro[1][2])) {
                System.out.println("Vencedor!");
                break;
            } else if (!tabuleiro[3][2].equals(".") && tabuleiro[3][2].equals(tabuleiro[2][2]) && tabuleiro[3][2].equals(tabuleiro[1][2]) && tabuleiro[3][2].equals(tabuleiro[0][2])) {
                System.out.println("Vencedor!");
                break;
            } else if (!tabuleiro[5][3].equals(".") && tabuleiro[5][3].equals(tabuleiro[4][3]) && tabuleiro[5][3].equals(tabuleiro[3][3]) && tabuleiro[5][3].equals(tabuleiro[2][3])) {
                System.out.println("Vencedor!");
                break;
            } else if (!tabuleiro[4][3].equals(".") && tabuleiro[4][3].equals(tabuleiro[3][3]) && tabuleiro[4][3].equals(tabuleiro[2][3]) && tabuleiro[4][3].equals(tabuleiro[1][3])) {
                System.out.println("Vencedor!");
                break;
            } else if (!tabuleiro[3][3].equals(".") && tabuleiro[3][3].equals(tabuleiro[2][3]) && tabuleiro[3][3].equals(tabuleiro[1][3]) && tabuleiro[3][3].equals(tabuleiro[0][3])) {
                System.out.println("Vencedor!");
                break;
            } else if (!tabuleiro[5][4].equals(".") && tabuleiro[5][4].equals(tabuleiro[4][4]) && tabuleiro[5][4].equals(tabuleiro[3][4]) && tabuleiro[5][4].equals(tabuleiro[2][4])) {
                System.out.println("Vencedor!");
                break;
            } else if (!tabuleiro[4][4].equals(".") && tabuleiro[4][4].equals(tabuleiro[3][4]) && tabuleiro[4][4].equals(tabuleiro[2][4]) && tabuleiro[4][4].equals(tabuleiro[1][4])) {
                System.out.println("Vencedor!");
                break;
            } else if (!tabuleiro[3][4].equals(".") && tabuleiro[3][4].equals(tabuleiro[2][4]) && tabuleiro[3][4].equals(tabuleiro[1][4]) && tabuleiro[3][4].equals(tabuleiro[0][4])) {
                System.out.println("Vencedor!");
                break;
            } else if (!tabuleiro[5][5].equals(".") && tabuleiro[5][5].equals(tabuleiro[4][5]) && tabuleiro[5][5].equals(tabuleiro[3][5]) && tabuleiro[5][5].equals(tabuleiro[2][5])) {
                System.out.println("Vencedor!");
                break;
            } else if (!tabuleiro[4][5].equals(".") && tabuleiro[4][5].equals(tabuleiro[3][5]) && tabuleiro[4][5].equals(tabuleiro[2][5]) && tabuleiro[4][5].equals(tabuleiro[1][5])) {
                System.out.println("Vencedor!");
                break;
            } else if (!tabuleiro[3][5].equals(".") && tabuleiro[3][5].equals(tabuleiro[2][5]) && tabuleiro[3][5].equals(tabuleiro[1][5]) && tabuleiro[3][5].equals(tabuleiro[0][5])) {
                System.out.println("Vencedor!");
                break;
            } else if (!tabuleiro[5][6].equals(".") && tabuleiro[5][6].equals(tabuleiro[4][6]) && tabuleiro[5][6].equals(tabuleiro[3][6]) && tabuleiro[5][6].equals(tabuleiro[2][6])) {
                System.out.println("Vencedor!");
                break;
            } else if (!tabuleiro[4][6].equals(".") && tabuleiro[4][6].equals(tabuleiro[3][6]) && tabuleiro[4][6].equals(tabuleiro[2][6]) && tabuleiro[4][6].equals(tabuleiro[1][6])) {
                System.out.println("Vencedor!");
                break;
            } else if (!tabuleiro[3][6].equals(".") && tabuleiro[3][6].equals(tabuleiro[2][6]) && tabuleiro[3][6].equals(tabuleiro[1][6]) && tabuleiro[3][6].equals(tabuleiro[0][6])) {
                System.out.println("Vencedor!");
                break;
                /*VENCEDOR DIAGONAL*/            } else if (!tabuleiro[3][0].equals(".") && tabuleiro[3][0].equals(tabuleiro[2][1]) && tabuleiro[3][0].equals(tabuleiro[1][2]) && tabuleiro[3][0].equals(tabuleiro[0][3])) {
                System.out.println("Vencedor!");
                break;
            } else if (!tabuleiro[4][0].equals(".") && tabuleiro[4][0].equals(tabuleiro[3][1]) && tabuleiro[4][0].equals(tabuleiro[2][2]) && tabuleiro[4][0].equals(tabuleiro[1][3])) {
                System.out.println("Vencedor!");
                break;
            } else if (!tabuleiro[3][1].equals(".") && tabuleiro[3][1].equals(tabuleiro[2][2]) && tabuleiro[3][1].equals(tabuleiro[1][3]) && tabuleiro[3][1].equals(tabuleiro[0][4])) {
                System.out.println("Vencedor!");
                break;
            } else if (!tabuleiro[5][0].equals(".") && tabuleiro[5][0].equals(tabuleiro[4][1]) && tabuleiro[5][0].equals(tabuleiro[3][2]) && tabuleiro[5][0].equals(tabuleiro[2][3])) {
                System.out.println("Vencedor!");
                break;
            } else if (!tabuleiro[4][1].equals(".") && tabuleiro[4][1].equals(tabuleiro[3][2]) && tabuleiro[4][1].equals(tabuleiro[2][3]) && tabuleiro[4][1].equals(tabuleiro[1][4])) {
                System.out.println("Vencedor!");
                break;
            } else if (!tabuleiro[3][2].equals(".") && tabuleiro[3][2].equals(tabuleiro[2][3]) && tabuleiro[3][2].equals(tabuleiro[1][4]) && tabuleiro[3][2].equals(tabuleiro[0][5])) {
                System.out.println("Vencedor!");
                break;
            } else if (!tabuleiro[5][1].equals(".") && tabuleiro[5][1].equals(tabuleiro[4][2]) && tabuleiro[5][1].equals(tabuleiro[3][3]) && tabuleiro[5][1].equals(tabuleiro[2][4])) {
                System.out.println("Vencedor!");
                break;
            } else if (!tabuleiro[4][2].equals(".") && tabuleiro[4][2].equals(tabuleiro[3][3]) && tabuleiro[4][2].equals(tabuleiro[2][4]) && tabuleiro[4][2].equals(tabuleiro[1][5])) {
                System.out.println("Vencedor!");
                break;
            } else if (!tabuleiro[3][3].equals(".") && tabuleiro[3][3].equals(tabuleiro[2][4]) && tabuleiro[3][3].equals(tabuleiro[1][5]) && tabuleiro[3][3].equals(tabuleiro[0][6])) {
                System.out.println("Vencedor!");
                break;
            } else if (!tabuleiro[5][2].equals(".") && tabuleiro[5][2].equals(tabuleiro[4][3]) && tabuleiro[5][2].equals(tabuleiro[3][4]) && tabuleiro[5][2].equals(tabuleiro[2][5])) {
                System.out.println("Vencedor!");
                break;
            } else if (!tabuleiro[4][3].equals(".") && tabuleiro[4][3].equals(tabuleiro[3][4]) && tabuleiro[4][3].equals(tabuleiro[2][5]) && tabuleiro[4][3].equals(tabuleiro[1][6])) {
                System.out.println("Vencedor!");
                break;
            } else if (!tabuleiro[5][3].equals(".") && tabuleiro[5][3].equals(tabuleiro[4][4]) && tabuleiro[5][3].equals(tabuleiro[3][5]) && tabuleiro[5][3].equals(tabuleiro[2][6])) {
                System.out.println("Vencedor!");
                break;
            } else if (!tabuleiro[2][0].equals(".") && tabuleiro[2][0].equals(tabuleiro[3][1]) && tabuleiro[2][0].equals(tabuleiro[4][2]) && tabuleiro[2][0].equals(tabuleiro[5][3])) {
                System.out.println("Vencedor!");
                break;
            } else if (!tabuleiro[1][0].equals(".") && tabuleiro[1][0].equals(tabuleiro[2][1]) && tabuleiro[1][0].equals(tabuleiro[3][2]) && tabuleiro[1][0].equals(tabuleiro[4][3])) {
                System.out.println("Vencedor!");
                break;
            } else if (!tabuleiro[2][1].equals(".") && tabuleiro[2][1].equals(tabuleiro[3][2]) && tabuleiro[2][1].equals(tabuleiro[4][3]) && tabuleiro[2][1].equals(tabuleiro[5][4])) {
                System.out.println("Vencedor!");
                break;
            } else if (!tabuleiro[0][0].equals(".") && tabuleiro[0][0].equals(tabuleiro[1][1]) && tabuleiro[0][0].equals(tabuleiro[2][2]) && tabuleiro[0][0].equals(tabuleiro[3][3])) {
                System.out.println("Vencedor!");
                break;
            } else if (!tabuleiro[1][1].equals(".") && tabuleiro[1][1].equals(tabuleiro[2][2]) && tabuleiro[1][1].equals(tabuleiro[3][3]) && tabuleiro[1][1].equals(tabuleiro[4][4])) {
                System.out.println("Vencedor!");
                break;
            } else if (!tabuleiro[2][2].equals(".") && tabuleiro[2][2].equals(tabuleiro[3][3]) && tabuleiro[2][2].equals(tabuleiro[4][4]) && tabuleiro[2][2].equals(tabuleiro[5][5])) {
                System.out.println("Vencedor!");
                break;
            } else if (!tabuleiro[0][1].equals(".") && tabuleiro[0][1].equals(tabuleiro[1][2]) && tabuleiro[0][1].equals(tabuleiro[2][3]) && tabuleiro[0][1].equals(tabuleiro[3][4])) {
                System.out.println("Vencedor!");
                break;
            } else if (!tabuleiro[1][2].equals(".") && tabuleiro[1][2].equals(tabuleiro[2][3]) && tabuleiro[1][2].equals(tabuleiro[3][4]) && tabuleiro[1][2].equals(tabuleiro[4][5])) {
                System.out.println("Vencedor!");
                break;
            } else if (!tabuleiro[2][2].equals(".") && tabuleiro[2][3].equals(tabuleiro[3][4]) && tabuleiro[2][3].equals(tabuleiro[4][5]) && tabuleiro[2][3].equals(tabuleiro[5][6])) {
                System.out.println("Vencedor!");
                break;
            } else if (!tabuleiro[0][2].equals(".") && tabuleiro[0][2].equals(tabuleiro[1][3]) && tabuleiro[0][2].equals(tabuleiro[2][4]) && tabuleiro[0][2].equals(tabuleiro[3][5])) {
                System.out.println("Vencedor!");
                break;
            } else if (!tabuleiro[1][3].equals(".") && tabuleiro[1][3].equals(tabuleiro[2][4]) && tabuleiro[1][3].equals(tabuleiro[3][5]) && tabuleiro[1][3].equals(tabuleiro[4][6])) {
                System.out.println("Vencedor!");
                break;
            } else if (!tabuleiro[0][3].equals(".") && tabuleiro[0][3].equals(tabuleiro[1][4]) && tabuleiro[0][3].equals(tabuleiro[2][5]) && tabuleiro[0][3].equals(tabuleiro[3][6])) {
                System.out.println("Vencedor!");
                break;
            }
            i++;
        } while (i < 50);
    }

    /*Tabuleiro*/ static void vertabuleiro() {
        String MostrarTabuleiro = "         CONECTA.4\n";
        MostrarTabuleiro += "| " + tabuleiro[0][0] + " | " + tabuleiro[0][1] + " | " + tabuleiro[0][2] + " | " + tabuleiro[0][3] + " | " + tabuleiro[0][4] + " | " + tabuleiro[0][5] + " | " + tabuleiro[0][6] + " |\n";
        MostrarTabuleiro += "|---|---|---|---|---|---|---|\n";
        MostrarTabuleiro += "| " + tabuleiro[1][0] + " | " + tabuleiro[1][1] + " | " + tabuleiro[1][2] + " | " + tabuleiro[1][3] + " | " + tabuleiro[1][4] + " | " + tabuleiro[1][5] + " | " + tabuleiro[1][6] + " |\n";
        MostrarTabuleiro += "|---|---|---|---|---|---|---|\n";
        MostrarTabuleiro += "| " + tabuleiro[2][0] + " | " + tabuleiro[2][1] + " | " + tabuleiro[2][2] + " | " + tabuleiro[2][3] + " | " + tabuleiro[2][4] + " | " + tabuleiro[2][5] + " | " + tabuleiro[2][6] + " |\n";
        MostrarTabuleiro += "|---|---|---|---|---|---|---|\n";
        MostrarTabuleiro += "| " + tabuleiro[3][0] + " | " + tabuleiro[3][1] + " | " + tabuleiro[3][2] + " | " + tabuleiro[3][3] + " | " + tabuleiro[3][4] + " | " + tabuleiro[3][5] + " | " + tabuleiro[3][6] + " |\n";
        MostrarTabuleiro += "|---|---|---|---|---|---|---|\n";
        MostrarTabuleiro += "| " + tabuleiro[4][0] + " | " + tabuleiro[4][1] + " | " + tabuleiro[4][2] + " | " + tabuleiro[4][3] + " | " + tabuleiro[4][4] + " | " + tabuleiro[4][5] + " | " + tabuleiro[4][6] + " |\n";
        MostrarTabuleiro += "|---|---|---|---|---|---|---|\n";
        MostrarTabuleiro += "| " + tabuleiro[5][0] + " | " + tabuleiro[5][1] + " | " + tabuleiro[5][2] + " | " + tabuleiro[5][3] + " | " + tabuleiro[5][4] + " | " + tabuleiro[5][5] + " | " + tabuleiro[5][6] + " |\n";
        MostrarTabuleiro += "|---|---|---|---|---|---|---|\n";
        MostrarTabuleiro += "  A   B   C   D   E   F   G  \n";
        System.out.println(MostrarTabuleiro);
    }

    /*Posicao*/ public static String lerPosicao() {
        Scanner console = new Scanner(System.in);
        boolean ValidPosicao;
        String posicao;
        do {
            System.out.print("Posicao da jogada: ");
            posicao = console.next();
            posicao = posicao.toLowerCase();
            if (posicao.equals("a") || posicao.equals("b") || posicao.equals("c") || posicao.equals("d") || posicao.equals("e") || posicao.equals("f") || posicao.equals("g")) {
                ValidPosicao = true;
            } else {
                System.out.println("**POSICAO INVáLIDA! TENTE NOVAMENTE**");
                ValidPosicao = false;
            }
        } while (!ValidPosicao);
        return posicao;
    }
}


