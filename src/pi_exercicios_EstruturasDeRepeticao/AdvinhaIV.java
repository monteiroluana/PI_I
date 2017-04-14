/*
Escreva um algoritmo que sorteia um número entre 1 e 10 (inclusos) e depois pede 
para o usuário tentar adivinhá-lo. Caso o número lido seja igual ao sorteado, 
mostre a mensagem “Você acertou em Tentativas tentativas!”. Caso contrário, 
mostre a mensagem “Você errou! O número é Dica. Tente novamente!” e permita uma 
nova chance, mostrando uma dica se o número sorteado é maior ou menor ao lido.
 */
package pi_exercicios_EstruturasDeRepeticao;
//@Monteiro

import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class AdvinhaIV {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        /*Sorteio*/
        Random rng = new Random();
        int i = rng.nextInt(10) + 1;

        int a = 1;
        while (a <= 10) {

            int numero = Integer.parseInt(JOptionPane.showInputDialog("Insira um númer"));

            if (i == numero) {
                JOptionPane.showMessageDialog(null, "Você acertou em " + a + " tentativas");

                break;
            } else if (numero > i) {
                JOptionPane.showMessageDialog(null, "Você Errou!\nO número sorteado é menor que o lido");

            } else if (numero < i) {
                JOptionPane.showMessageDialog(null, "Você Errou!\nO número sorteado é maior que o lido");
            }

            a++;

        }

    }
}
