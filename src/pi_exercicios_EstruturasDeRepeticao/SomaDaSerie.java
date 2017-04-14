/*
Escreva um programa que mostra a soma dos 10000 primeiros termos da seguinte série:
soma = 1 + 3 + 5 + 7 + 9 + ...
 */
package pi_exercicios_EstruturasDeRepeticao;
//@Monteiro

public class SomaDaSerie {

    public static void main(String[] args) {
        int soma = 0;
        for (int i = 0; i <= 10000; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " + ");
                soma = soma + i;
            }
        }
        System.out.println("");
        System.out.println("Soma = " + soma);
    }
}
