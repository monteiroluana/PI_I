/*
Escreva um programa que jogue o jogo do par ou ímpar com você
 */
package pi_exercicios_EstruturasDeDecisioes;
//@Moteiro

import java.util.Random;
import javax.swing.JOptionPane;

public class ImparPar {

    public static void main(String[] args) {

        /*Entradas*/
        String usuario = JOptionPane.showInputDialog("Impar / Par");
        int numero = Integer.parseInt(JOptionPane.showInputDialog("1 ou 2"));

        /*processamento (1)*/
        Random maquina = new Random();
        int i = maquina.nextInt(2) + 1;

        /*processamento (2)*/
        String resultado = "";
        if (numero <= 2) {

            /*usuario com entrada par*/
            if (usuario.equals("par") && numero == 1 && i == 1) {
                resultado = "usuário escolheu 'par' e o nº 1\n";
                resultado += "máquina escolheu 'impar' e o nº 1\n";
                resultado += "  Você Ganhou!";
            } else if (usuario.equals("par") && numero == 2 && i == 2) {
                resultado = "usuário escolheu 'par' e o nº 2\n";
                resultado += "máquina escolheu 'impar' e o nº 2\n";
                resultado += "  Você Ganhou!";
            } else if (usuario.equals("par") && numero == 2 && i == 1) {
                resultado = "usuário escolheu 'par' e o nº 2\n";
                resultado += "máquina escolheu 'impar' e o nº 1\n";
                resultado += "  Você perdeu!";
            } else if (usuario.equals("par") && numero == 1 && i == 2) {
                resultado = "usuário escolheu 'par' e o nº 2\n";
                resultado += "máquina escolheu 'impar' e o nº 1\n";
                resultado += "  Você perdeu!";

                /*usuario com entrada impar*/
            } else if (usuario.equals("impar") && numero == 1 && i == 1) {
                resultado = "usuário escolheu 'impar' e o nº 1\n";
                resultado += "máquina escolheu 'par' e o nº 1\n";
                resultado += "  Você Perdeu!";
            } else if (usuario.equals("impar") && numero == 2 && i == 2) {
                resultado = "usuário escolheu 'impar' e o nº 2\n";
                resultado += "máquina escolheu 'par' e o nº 2\n";
                resultado += "  Você Perdeu!";
            } else if (usuario.equals("impar") && numero == 2 && i == 1) {
                resultado = "usuário escolheu 'impar' e o nº 2\n";
                resultado += "máquina escolheu 'par' e o nº 1\n";
                resultado += "  Você Ganhou!";
            } else if (usuario.equals("impar") && numero == 1 && i == 2) {
                resultado = "usuário escolheu 'impar' e o nº 1\n";
                resultado += "máquina escolheu 'par' e o nº 2\n";
                resultado += "  Você Ganhou!";
            }

            /*Saida*/
            JOptionPane.showMessageDialog(null, resultado);

        } else {
            JOptionPane.showMessageDialog(null, "Ação inválida");
        }

    }
}
