/*
Escreva um programa que lê um texto (uma String) e o mostra em Código Morse
(deixe um espaço entre um código e outro).
 */
package pi_exercicios_EstruturasDeRepeticao;
//@Monteiro

import java.util.Scanner;

public class CodigoMorse {

    public static void main(String[] args) {

        /*Entrada*/
        Scanner console = new Scanner(System.in);
        System.out.print("Texto: ");
        String texto = console.next();

        /*texto.length  -> pega o tamanho do texto*/
        for (int i = 0; i < texto.length(); i++) {
            
            /*texto.charAt  -> pega o caracter que está na posicao i*/
            char caracter = texto.charAt(i);

            switch (caracter) {
                case 'a':
                    System.out.print(".-  ");break;
                case 'b':
                    System.out.print("-...  ");break;
                case 'c':
                    System.out.print("-.-.  ");break;
                case 'd':
                    System.out.print("-..  ");break;
                case 'e':
                    System.out.print(".  ");break;
                case 'f':
                    System.out.print("..-.  ");break;
                case 'g':
                    System.out.print("--.  ");break;
                case 'h':
                    System.out.print("....  ");break;
                case 'i':
                    System.out.print("..  ");break;
                case 'j':
                    System.out.print(".---  ");break;
                case 'k':
                    System.out.print("-.-  ");break;
                case 'l':
                    System.out.print(".-..  ");break;
                case 'm':
                    System.out.print("--  ");break;
                case 'n':
                    System.out.print("-.  ");break;
                case 'o':
                    System.out.print("---  ");break;
                case 'p':
                    System.out.print(".--.  ");break;
                case 'q':
                    System.out.print("--.-  ");break;
                case 'r':
                    System.out.print(".-.  ");break;
                case 's':
                    System.out.print("... ");break;
                case 't':
                    System.out.print("-  ");break;
                case 'u':
                    System.out.print("..-  ");break;
                case 'v':
                    System.out.print("...-  ");break;
                case 'x':
                    System.out.print("-..-  ");break;
                case 'w':
                    System.out.print(".--  ");break;
                case 'y':
                    System.out.print("-.--  ");break;
                case 'z':
                    System.out.print("--..  ");break;

            }

        }

    }
}
