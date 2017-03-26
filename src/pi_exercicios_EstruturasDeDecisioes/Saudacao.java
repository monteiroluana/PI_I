/*
Saudação
Escreva um programa que lê o nome de uma pessoa e mostra a seguinte mensagem: "Olá, nome da pessoa!".

Se a pessoa não entrar com um nome, o programa deve mostrar: "Olá, mundo!".
 */
package pi_exercicios_EstruturasDeDecisioes;
//@Monteiro

import javax.swing.JOptionPane;

public class Saudacao {

    public static void main(String[] args) {

        /*Entrada*/
        String Nome;
        Nome = JOptionPane.showInputDialog("Insira Nome: "); //Caixa de dialogo/entrada

        /*Processamento/ Saida*/
        if (Nome.equals("")) {
            System.out.println("Olá, Mundo!");

        } else {
            System.out.println("Olá, " + Nome);
        }
    }
}
