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

        /*1 Monstrando tabuleiro*/
        String mosTabuleiro = " 1 | 2 | 3 \n";
        mosTabuleiro += "---|---|---\n";
        mosTabuleiro += " 4 | 5 | 6 \n";
        mosTabuleiro += "---|---|---\n";
        mosTabuleiro += " 7 | 8 | 9 \n";
        System.out.println(mosTabuleiro);

        /*Posições*/
        String p1 = "", p2 = "", p3 = "", p4 = "", p5 = "", p6 = "", p7 = "", p8 = "", p9 = "";
        String vez = "", posicao, pAnterior = "";

        for (int i = 0; i < 9; i++) {
            /*Pedindo e vez e Validando 
            System.out.print("De quem é a vez X ou O : ");
            vez = console.next();
            if (vez.equals(vezAnterior)) {
            }*/


 /*DE QUEM È A VEZ*/
            vez = vez.toUpperCase();
            if (vez.equals("X")) {
                vez = "O";
            } else {
                vez = "X";
            }
            System.out.println("Vez do: " + vez);

            /*Pedindo a Posição da jogada*/
            System.out.print("Posição: ");
            posicao = console.next();

             if (pAnterior.contains(posicao)) {

                System.out.println("Contem");
            } else {
                System.out.println("não contem");
            }
            
            
            

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
            String Tabuleiro = " " + p1 + " | " + p2 + " | " + p3 + " \n";
            Tabuleiro += "---|---|---\n";
            Tabuleiro += " " + p4 + " | " + p5 + " | " + p6 + " \n";
            Tabuleiro += "---|---|---\n";
            Tabuleiro += " " + p7 + " | " + p8 + " | " + p9 + " \n";
            System.out.println(Tabuleiro);

            pAnterior += posicao;
            System.out.println(pAnterior);
            
           
        }
    }
}
