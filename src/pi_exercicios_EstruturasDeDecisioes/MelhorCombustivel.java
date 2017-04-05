/*
Escreva um algoritmo que lê quantos km/l seu carro faz com gasolina e com álcool.
Além disso, o algoritmo também deve ler o preço do litro da gasolina e do álcool.
Ao final, o algoritmo deve mostrar qual a melhor opção de combustível para abastecer.
 */
package pi_exercicios_EstruturasDeDecisioes;
//@Monteiro

import javax.swing.JOptionPane;

public class MelhorCombustivel {

    public static void main(String[] args) {

        /*Entradas*/
        double KmlAlcool = Double.parseDouble(JOptionPane.showInputDialog("Km/l com Álcool"));
        double CustAlcool = Double.parseDouble(JOptionPane.showInputDialog("Valor do Álcool"));
        double KmlGasolina = Double.parseDouble(JOptionPane.showInputDialog("Km/l com Gasolina"));
        double CustGasolina = Double.parseDouble(JOptionPane.showInputDialog("Valor da Gasolina"));
        double alcool = KmlAlcool * CustAlcool;
        double gasolina = KmlGasolina * CustGasolina;

        if (alcool < gasolina) {
            JOptionPane.showMessageDialog(null, "melhor opção para abastercer: Álcool");
        } else {
            JOptionPane.showMessageDialog(null, "melhor opção para abastercer: Gasolina");
        }
        /*Processamento*/
    }
}
