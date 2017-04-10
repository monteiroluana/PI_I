/*
Escreva um algoritmo que lê dois números e qual a operação matemática desejada: 
soma, subtração, multiplicação ou divisão. 
Após isso, ele deve calcular e mostrar o resultado dessa operação.
 */
package pi_exercicios_EstruturasDeDecisioes;
//@Monteiro

import java.util.Scanner;

public class CalculadoraComSwitch {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("1º número: ");
        double n1 = console.nextDouble();
        System.out.print("Operacao (+  -  *  /):  ");
        String operacao = console.next();
        System.out.print("2º número:");
        double n2 = console.nextDouble();

        double resultado;
        switch (operacao) {
            case "+":
                resultado = n1 + n2;
                System.out.println(resultado);
                break;
            case "-":
                resultado = n1 - n2;
                System.out.println(resultado);
                break;
            case "*":
                resultado = n1 * n2;
                System.out.println(resultado);
                break;
            case "/":
                resultado = n1 / n2;
                System.out.println(resultado);
                break;
            
        }

    }

}
