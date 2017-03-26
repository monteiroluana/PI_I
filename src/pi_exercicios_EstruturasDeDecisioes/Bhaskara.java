/*
Escreva um algoritmo que lê os coeficientes a, b e c da equação de 
2º grau ax²+bx+c = 0 e que mostra as suas raízes, quando possível.
 */
package pi_exercicios_EstruturasDeDecisioes;
//@Monteiro

import javax.swing.JOptionPane;

public class Bhaskara {

    public static void main(String[] args) {

        /* SUGESTÂO DE ENTRADAS
            A:9
            B:12
            C:4
         */
        /*Entradas*/
        double NumA = Double.parseDouble(JOptionPane.showInputDialog("Insira A"));
        double NumB = Double.parseDouble(JOptionPane.showInputDialog("Insira B"));
        double NumC = Double.parseDouble(JOptionPane.showInputDialog("Insira C"));

        /*processamento (1)*/
        double Delta = Math.sqrt(Math.pow(NumA, NumB) - (4 * (NumA * NumC)));
        double CalcPositivo = (-NumB + Delta) / (2 * NumA);
        double CalcNegativo = (-NumB - Delta) / (2 * NumA);

        /*processamento (2)*/
        if (Delta <= 0) {
            JOptionPane.showMessageDialog(null, "Impossivel Calcular");
        } else {
            JOptionPane.showMessageDialog(null, "x1 = " + CalcPositivo);
            JOptionPane.showMessageDialog(null, "x2 = " + CalcNegativo);

        }

    }

}
