/*
30/03/17
Escreva um programa que lê um número de 1 a 12 e mostre o dobro. Valide a entrada
 */
package pi_exercicios_EstruturasDeDecisioes;
//@Monteiro 

import javax.swing.JOptionPane;

public class Validacao {

    public static void main(String[] args) {

        /*Entrada*/
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Insira um número de 1 a 12"));

        /*Processamento*/
        int dobro;
        if (numero >= 1 && numero <= 12) {
            dobro = numero * 2;
            /*saida*/
            JOptionPane.showMessageDialog(null, dobro);
        } else {
            /*saida*/
            JOptionPane.showMessageDialog(null, "Número inválido");
        }
    }
}
