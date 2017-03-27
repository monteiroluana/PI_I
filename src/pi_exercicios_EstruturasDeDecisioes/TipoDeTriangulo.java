/*
Escreva um algoritmo que lê três medidas e verifica se elas formam um triângulo. 
Caso positivo, o algoritmo deve identificar qual o tipo de triângulo formado: 
equilátero, isósceles ou escaleno.

A saída deve estar no seguinte formato: 
“As medidas Medida 1, Medida 2 e Medida 3 formam um triângulo Tipo do Triângulo.”

Ou, no caso de não formar um triângulo: 
“As medidas Medida 1, Medida 2 e Medida 3 não formam um triângulo.”.
 */
package pi_exercicios_EstruturasDeDecisioes;
//@Monteiro

import javax.swing.JOptionPane;

public class TipoDeTriangulo {

    public static void main(String[] args) {

        /*Entradas*/
        int Medida1 = Integer.parseInt(JOptionPane.showInputDialog("Medida 1"));
        int Medida2 = Integer.parseInt(JOptionPane.showInputDialog("Medida 2"));
        int Medida3 = Integer.parseInt(JOptionPane.showInputDialog("Medida 3"));

        /*Processamento/ Saída*/
        if (Medida1 == Medida2 && Medida2 == Medida3) {
            JOptionPane.showMessageDialog(null, "Triângulo Equilátero");
        } else if (Medida1 == Medida2 || Medida1 == Medida3) {
            JOptionPane.showMessageDialog(null, "Triângulo Isósceles");
        } else if (Medida1 != Medida2 && Medida2 != Medida3) {
            JOptionPane.showMessageDialog(null, "Triângulo Escaleno");
        }
        else{
            
        JOptionPane.showMessageDialog(null, "As medidas: "+ Medida1 +", "+ Medida2 + " e " + Medida3 + " não formam um triângulo");
        }

    }
}
