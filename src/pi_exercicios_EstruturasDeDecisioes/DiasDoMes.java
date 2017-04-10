/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pi_exercicios_EstruturasDeDecisioes;
//@Monteiro

import javax.swing.JOptionPane;

public class DiasDoMes {

    public static void main(String[] args) {
        int mes = Integer.parseInt(JOptionPane.showInputDialog("Mês (de 1 à 12)"));

        switch (mes) {
            case 2:
                JOptionPane.showMessageDialog(null, "28 dias");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                JOptionPane.showMessageDialog(null, "31 dias");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                JOptionPane.showMessageDialog(null, "30 dias");
                break;
            default:
                System.out.println("entrada inválida");

        }
    }
}
