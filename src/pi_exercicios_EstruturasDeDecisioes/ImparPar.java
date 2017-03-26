/*
Escreva um programa que jogue o jogo do par ou ímpar com você
 */
package pi_exercicios_EstruturasDeDecisioes;
//@Moteiro

import java.util.Random;
import javax.swing.JOptionPane;

public class ImparPar {

    public static void main(String[] args) {

        Random rng = new Random();

        /*Entradas*/
        String usuario = JOptionPane.showInputDialog("Impar / Par");
        int numero = Integer.parseInt(JOptionPane.showInputDialog("1 ,2 ,3 ,4 ou 5"));

        /*processamento (1)*/
        int i = rng.nextInt(5) + 1;
        int soma = numero + i;

        /*processamento (2)*/
        String resultado = "";
        if (numero <= 5) {

            if (soma == 2 || soma == 4 || soma == 6 || soma == 8 || soma == 10) {
                resultado = "par";
            } else {
                resultado = "impar";
            }

        } else {
            System.out.println("Número inválido!");
        }

        /*Saida*/
        JOptionPane.showMessageDialog(null,"usuário <" + usuario + "> <" + numero + "> CONTRA máquina <" + i + "> " +" RESULTADO " + soma + " " + resultado);
       
        
    }

}
