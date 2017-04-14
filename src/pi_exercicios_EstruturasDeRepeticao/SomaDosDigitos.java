/*
Escreva um programa que lê um número e mostra a soma dos seus dígitos.

Exemplos:
Número: 123
Soma: 6

Número: 555
Soma: 15

Número: 3141592
Soma: 25
 */
package pi_exercicios_EstruturasDeRepeticao;

import java.util.Scanner;

public class SomaDosDigitos {

    public static void main(String[] args) {

        int numero, resto, soma=0;

        Scanner console = new Scanner(System.in);

        System.out.print("Número: ");
        numero = console.nextInt();
        

        while (numero > 0) {

            resto = numero % 10;
            numero = (numero - resto) / 10;
            soma = soma + resto;
            
        }

        System.out.printf("A soma dos digitos é %d \n", soma);
       
    }

}
/*
    EX: 
    numero == 23
    (23>0)
    resto = 23%10 == 3
    numero = 23-3/10 == 2  (23-3 = 20   ->  20/10 == 2)
    soma = soma + 3
    ---------------------------------------------------            
    numero == 2
    (2>0)
    resto = 2%10 == 2
    numero = 2-2/10 == 0   (2-2 = 0  ->  0/10 == 0)
    soma = 3 + 2
    ---------------------------------------------------
    numero == 0
    (0>0)

    escreva soma
    sout(5)
  */
