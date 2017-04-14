/*
Escreva um programa que lê um número e mostra a soma dos seus dígitos, 
cada um múltiplicado por um peso, da seguinte forma:

Se o número tem 4 dígitos, o primeiro dígito deve ser multiplicado por 4, o segundo por 3, o terceiro por 2 e assim por diante.
Se o número tem 10 dígitos, o primeiro dígito deve ser multiplicado por 10, o segundo por 9, o terceiro por 8 e assim por diante.

Exemplos:

Número: 123
Resultado: 10
Explicação: 1x3 + 2x2 + 3x1 = 10

Número: 2017
Resultado: 17
Explicação: 2x4 + 0x3 + 1x2 + 7x1= 17
 */
package pi_exercicios_EstruturasDeRepeticao;
//@Monteiro

import java.util.Scanner;

public class SomaDosDigitosII {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("Insira um número: ");
        int numero = console.nextInt();

        int resto = 0, soma = 0, i = 1;
        while (numero > 0) {
            resto = numero % 10;
            numero = (numero - resto) / 10;
            soma = soma + (resto * i);
            i++;

        }
        System.out.println("Resultado: " + soma);
    }
}