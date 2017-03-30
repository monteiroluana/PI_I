/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pi_exercicios_EstruturasDeDecisioes;
//@Monteiro

import javax.swing.JOptionPane;

public class Salario2 {

    public static void main(String[] args) {
        double Salario;
        float nv1 = 15.0f;
        float nv2 = 18.0f;
        float nv3 = 22.0f;
        float nv4 = 27.0f;
        float nv5 = 33.0f;

        /*Entradas*/
        String NomeFuncionario = JOptionPane.showInputDialog("Nome Funcionário ");
        int HorasTrabalhadas = Integer.parseInt(JOptionPane.showInputDialog("Horas Trabalhadas "));
        short Nivel = Short.parseShort(JOptionPane.showInputDialog("Nível 1, 2, 3, 4 ou 5 ?"));

        /*processamento (nivel 1)*/
        if (Nivel == 1) {
            Salario = nv1 * HorasTrabalhadas;
            JOptionPane.showMessageDialog(null, "O Funcionário " + NomeFuncionario + " trabalhou " + HorasTrabalhadas + " horas, R$" + nv1 + " por hora e deve receber R$" + Salario);
        }
        /*processamento (nivel 2)*/
        else if (Nivel == 2) {
            Salario = nv2 * HorasTrabalhadas;
            JOptionPane.showMessageDialog(null, "O Funcionário " + NomeFuncionario + " trabalhou " + HorasTrabalhadas + " horas, R$" + nv2 + " por hora e deve receber R$" + Salario);
        }
        /*processamento (nivel 3)*/
        else if (Nivel == 3) {
            Salario = nv3 * HorasTrabalhadas;
            JOptionPane.showMessageDialog(null, "O Funcionário " + NomeFuncionario + " trabalhou " + HorasTrabalhadas + " horas, R$" + nv3 + " por hora e deve receber R$" + Salario);
        }
        /*processamento (nivel 4)*/
        else if (Nivel == 4) {
            Salario = nv4 * HorasTrabalhadas;
            JOptionPane.showMessageDialog(null, "O Funcionário " + NomeFuncionario + " trabalhou " + HorasTrabalhadas + " horas, R$" + nv4 + " por hora e deve receber R$" + Salario);
        }
        /*processamento (nivel 5)*/
        else if (Nivel == 5) {
            Salario = nv5 * HorasTrabalhadas;
            JOptionPane.showMessageDialog(null, "O Funcionário " + NomeFuncionario + " trabalhou " + HorasTrabalhadas + " horas, R$" + nv5 + " por hora e deve receber R$" + Salario);
        }else {
        JOptionPane.showMessageDialog(null, "O Nivel não foi fornecido corretamente!");
        }

    }

}
