/*
Escreva um programa que lê uma letra e mostra se ela é uma vogal ou consoante.

Atenção: use o comando switch
 */
package pi_exercicios_EstruturasDeDecisioes;
//@Letras

import javax.swing.JOptionPane;

public class Letras {

    public static void main(String[] args) {

        String letra = JOptionPane.showInputDialog("Insira uma letra");
        letra = letra.toLowerCase();
        System.out.println(letra);
        switch (letra) {
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
                JOptionPane.showMessageDialog(null,"A letra '"+ letra + "' é uma vogal");
                break;
            case "b":
            case "c":
            case "d":
            case "f":
            case "g":
            case "h":
            case "j":
            case "k":
            case "l":
            case "m":
            case "n":
            case "p":
            case "q":
            case "r":
            case "s":
            case "t":
            case "v":
            case "x":
            case "w":
            case "y":
            case "z": JOptionPane.showMessageDialog(null, "A letra '"+ letra + "' é uma consoante");break;
            default: JOptionPane.showMessageDialog(null, "Entrada inválida!");
                    

        }
    }
}
