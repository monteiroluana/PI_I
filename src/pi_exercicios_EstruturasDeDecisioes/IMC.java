/*
Escreva um algoritmo que lê o nome, o peso (em kg) e a altura (em m) de uma 
pessoa e que mostra a seguinte mensagem: “Nome da Pessoa está com 
Índice de Massa Corporal IMC da Pessoa (Categoria do IMC)”.
 */
package pi_exercicios_EstruturasDeDecisioes;
//@Monteiro

import javax.swing.JOptionPane;

public class IMC {

    public static void main(String[] args) {

        /*Entradas*/
        String Nome = JOptionPane.showInputDialog("Nome");
        double Peso = Double.parseDouble(JOptionPane.showInputDialog("Peso"));
        double Altura = Double.parseDouble(JOptionPane.showInputDialog("Altura"));

        /*Processamento*/
        double IMC = Peso / (Altura * Altura);

        String Categoria = "";
        if (IMC < 18.5) {
            Categoria = "Abaixo do Peso";
        } else if (18.5 <= IMC && IMC < 25) {
            Categoria = "Peso Normal";
        } else if (25 <= IMC && IMC < 30) {
            Categoria = "Acima do Peso";
        } else if (IMC >= 30) {
            Categoria = "Obesidade";
        }
        
        
        /*Saida*/
        JOptionPane.showMessageDialog(null,Nome + " está com a massa corporal " + IMC +"  ("+ Categoria +")");

    }

}
