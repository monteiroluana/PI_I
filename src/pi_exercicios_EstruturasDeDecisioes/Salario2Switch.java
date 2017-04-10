/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pi_exercicios_EstruturasDeDecisioes;
//@Monteiro

import javax.swing.JOptionPane;

public class Salario2Switch {

    public static void main(String[] args) {
        String funcionario = JOptionPane.showInputDialog("Nome do Funcionário");
        String Nivel = JOptionPane.showInputDialog("Nível (1, 2, 3, 4, 5)");
        int horasTrab = Integer.parseInt(JOptionPane.showInputDialog("Horas Trabalhadas"));

        double salario;
        double nv1 = 15.0;
        double nv2 = 18.0;
        double nv3 = 22.0;
        double nv4 = 27.0;
        double nv5 = 33.0;

        switch (Nivel) {
            case "1":
                salario = nv1 * horasTrab;
                JOptionPane.showMessageDialog(null, "O Funcionário " + funcionario + " trabalhou " + horasTrab + " horas, por R$" + nv1 + " e deve receber R$" + salario);
                break;
            case "2":
                salario = nv2 * horasTrab;
                JOptionPane.showMessageDialog(null, "O Funcionário " + funcionario + " trabalhou " + horasTrab + " horas, por R$" + nv2 + " e deve receber R$" + salario);
                break;
            case "3":
                salario = nv3 * horasTrab;
                JOptionPane.showMessageDialog(null, "O Funcionário " + funcionario + " trabalhou " + horasTrab + " horas, por R$" + nv3 + " e deve receber R$" + salario);
                break;
            case "4":
                salario = nv4 * horasTrab;
                JOptionPane.showMessageDialog(null, "O Funcionário " + funcionario + " trabalhou " + horasTrab + " horas, por R$" + nv4 + " e deve receber R$" + salario);
                break;
            case "5":
                salario = nv5 * horasTrab;
                JOptionPane.showMessageDialog(null, "O Funcionário " + funcionario + " trabalhou " + horasTrab + " horas, por R$" + nv5 + " e deve receber R$" + salario);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Nivel Inválido");
        }
    }
}
