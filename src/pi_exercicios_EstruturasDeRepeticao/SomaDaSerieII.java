/*
Escreva um programa que mostra a soma dos 10000 primeiros termos da seguinte série:
soma = 1/1 + 1/3 + 1/5 + 1/7 + 1/9 + ...
 */
package pi_exercicios_EstruturasDeRepeticao;
//@Monteiro

public class SomaDaSerieII {

    public static void main(String[] args) {
        double soma = 0, div;

        for (int i = 0; i <= 10000; i++) {
            if (i % 2 != 0) {

                div = 1.0 / i;

                soma = soma + div;

                System.out.printf("%.2f + ", div);

            }

        }
        System.out.println("");
        System.out.printf("Soma = %.2f ", soma);
    }
}
