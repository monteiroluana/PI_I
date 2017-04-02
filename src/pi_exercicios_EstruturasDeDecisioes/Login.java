/*
Escreva um programa em Java que lê o login e a senha de um usuário e valide sua
autorização de acordo com a seguinte tabela:

Login       Senha
guilherme   0f5
jair        0706
 */
package pi_exercicios_EstruturasDeDecisioes;
//@Monteiro

import javax.swing.JOptionPane;

public class Login {

    public static void main(String[] args) {

        /*Entradas Login e Senha*/
        String Login = JOptionPane.showInputDialog("Login");
        String Senha = JOptionPane.showInputDialog("Senha");

        /*Processamento*/
        if (Login.equals("guilherme") && Senha.equals("0f5")) {
            JOptionPane.showMessageDialog(null, "Bem vindo, " + Login);
        } else if (Login.equals("jair") && Senha.equals("0706")) {
            JOptionPane.showMessageDialog(null, "Bem vindo, " + Login);
        } else {
            JOptionPane.showMessageDialog(null, "Login ou Senha Inválido");
        }

        /*Forma do Prof
        boolean autorizado = (Login.equals("guilherme") && Senha.equals("0f5")) || (Login.equals("jair") && Senha.equals("0706"));
        if (autorizado) {
            JOptionPane.showMessageDialog(null, "Bem vindo, " + Login);
        } else {
            JOptionPane.showMessageDialog(null, "Login ou Senha Inválido");
        }*/

    }
}
