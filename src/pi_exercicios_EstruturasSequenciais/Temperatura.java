/*
Escreva um algoritmo que lê o valor de uma temperatura em °F e a mostra convertida para °C.
Fórmula: C = \frac{5}{9} * (F - 32)
 */
package pi_exercicios_EstruturasSequenciais;

import java.util.Scanner;
//@Monteiro

public class Temperatura {

    public static void main(String[] args) {
        double F, C;

        Scanner console = new Scanner(System.in);

        /*Entrada*/
        System.out.println("Conversão de Temperatura");
        System.out.print("Digite a temperatura em Fahrenheit:");
        F = console.nextDouble();

        /*Processamento*/
        C = (F - 32) * (5.0 / 9.0);

        /*Saida*/
        System.out.printf("A temperatura em Celsius será: %.2f\n", C);

    }

}
