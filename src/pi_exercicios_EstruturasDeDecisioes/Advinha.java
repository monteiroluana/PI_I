/*
Escreva um algoritmo que sorteia um número entre 1 e 10 (inclusos) e depois 
pede para o usuário tentar adivinhá-lo. Caso o número lido seja igual ao 
sorteado, mostre a mensagem “Você acertou!”.
Caso contrário, mostre a mensagem “Você errou!”.
 */
package pi_exercicios_EstruturasDeDecisioes;
//@Monteiro

import java.util.Random;
import javax.swing.JOptionPane;

public class Advinha {

    public static void main(String[] args) {
        Random rng = new Random();

        /*Sorteio*/
        int i = rng.nextInt(10) + 1;

        /*Entrada*/
        int usuario = Integer.parseInt(JOptionPane.showInputDialog("Tente advinhar o número de 1 à 10"));

       /*Processamento/ Saida*/
        if (usuario == i) {
            JOptionPane.showMessageDialog(null, "Você acertou!");
        } else {
            JOptionPane.showMessageDialog(null, "Você errou!");
        }

    }

}
