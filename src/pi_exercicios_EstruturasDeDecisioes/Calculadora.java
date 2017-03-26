/*
Escreva um algoritmo que lê dois números e qual a operação matemática desejada: 
soma, subtração, multiplicação ou divisão. 
Após isso, ele deve calcular e mostrar o resultado dessa operação.
 */
package pi_exercicios_EstruturasDeDecisioes;
//@Monteiro

import javax.swing.JOptionPane;

public class Calculadora {

    public static void main(String[] args) {

        String texto = "ESCOLHA A OPERAÇÃO\n";
        texto += "(+) soma  (-) Subtração\n";
        texto += "(*) Multiplicação  (/) Divisão\n";

        /*Entradas*/
        double Num1 = Double.parseDouble(JOptionPane.showInputDialog("Insira um número"));
        String operacao = JOptionPane.showInputDialog(texto);
        double Num2 = Double.parseDouble(JOptionPane.showInputDialog("Insira um número"));

        /*Processamento/ Saida*/
        double conta;
        if (operacao.equals("+") || operacao.equals("soma")) {
            conta = Num1 + Num2;
            JOptionPane.showMessageDialog(null, Num1 + " + " + Num2 + " = " + conta);

        } else if (operacao.equals("-") || operacao.equals("subtração")) {
            conta = Num1 - Num2;
            JOptionPane.showMessageDialog(null, Num1 + " - " + Num2 + " = " + conta);

        } else if (operacao.equals("*") || operacao.equals("multiplicação")) {
            conta = Num1 * Num2;
            JOptionPane.showMessageDialog(null, Num1 + " * " + Num2 + " = " + conta);

        } else if (operacao.equals("/") || operacao.equals("divisão")) {
            conta = Num1 / Num2;
            JOptionPane.showMessageDialog(null, Num1 + " / " + Num2 + " = " + conta);

        }

    }
}
