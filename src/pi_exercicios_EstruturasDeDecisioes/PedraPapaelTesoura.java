/*
Escreva um programa que jogue o jogo "Papel, Pedra, Tesoura" com você.
 */
package pi_exercicios_EstruturasDeDecisioes;
//@Monteiro

import java.util.Random;
import javax.swing.JOptionPane;

public class PedraPapaelTesoura {

    public static void main(String[] args) {

        Random rng = new Random();
        int i = rng.nextInt(3);

        /*Entrada*/
        String usuario = JOptionPane.showInputDialog("Pedra/ Papel/ Tesoura:");

        /*Processamento*/
        String computador = "";
        if (i == 1) {
            computador = "Pedra";
        } else if (i == 2) {
            computador = "Papel";
        } else if (i == 0) {
            computador = "Tesoura";
        }

        /*Saida*/
        JOptionPane.showMessageDialog(null, "Usuário " + usuario + " / Computador " + computador);
        // System.out.println("Usuário " + usuario + " / Computador " + computador);

    }
}
