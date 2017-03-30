/*
 Escreva um programa que pergunta de quem é a vez de jogar (O ou X) e em qual posição será feita a jogada.
Após isso, ele deve imprimir um tabuleiro de jogo-da-velha preenchido com a jogada informada.
 */
package pi_exercicios_EstruturasDeDecisioes;
//@Monteiro

import javax.swing.JOptionPane;

public class JogoDaVelha {

    public static void main(String[] args) {

        /*Entrada*/
        String Vez = JOptionPane.showInputDialog("De quem é a vez de Jogar (X ou O)");
        
        /*checagem 1*/
        if (Vez.equals("x") || Vez.equals("o")) {
                
            /*Entrada*/
            int P = Integer.parseInt(JOptionPane.showInputDialog("Em qual posição será feita a jogada? 1,2,3,4,5,6,7,8,9"));
            
            /*Processamento*/
            if (P == 1) {
                String Tabuleiro = " " + Vez + " |   |   \n";
                Tabuleiro += "---|---|---\n";
                Tabuleiro += "   |   |   \n";
                Tabuleiro += "---|---|---\n";
                Tabuleiro += "   |   |   \n";
                System.out.println(Tabuleiro);
            } else if (P == 2) {
                String Tabuleiro = "   | " + Vez + " |   \n";
                Tabuleiro += "---|---|---\n";
                Tabuleiro += "   |   |   \n";
                Tabuleiro += "---|---|---\n";
                Tabuleiro += "   |   |   \n";
                System.out.println(Tabuleiro);
            } else if (P == 3) {
                String Tabuleiro = "   |   | " + Vez + " \n";
                Tabuleiro += "---|---|---\n";
                Tabuleiro += "   |   |   \n";
                Tabuleiro += "---|---|---\n";
                Tabuleiro += "   |   |   \n";
                System.out.println(Tabuleiro);
            } else if (P == 4) {
                String Tabuleiro = "   |   |   \n";
                Tabuleiro += "---|---|---\n";
                Tabuleiro += " " + Vez + " |   |   \n";
                Tabuleiro += "---|---|---\n";
                Tabuleiro += "   |   |   \n";
                System.out.println(Tabuleiro);
            } else if (P == 5) {
                String Tabuleiro = "   |   |   \n";
                Tabuleiro += "---|---|---\n";
                Tabuleiro += "   | " + Vez + " |   \n";
                Tabuleiro += "---|---|---\n";
                Tabuleiro += "   |   |   \n";
                System.out.println(Tabuleiro);
            } else if (P == 6) {
                String Tabuleiro = "   |   |   \n";
                Tabuleiro += "---|---|---\n";
                Tabuleiro += "   |   | " + Vez + " \n";
                Tabuleiro += "---|---|---\n";
                Tabuleiro += "   |   |   \n";
                System.out.println(Tabuleiro);
            } else if (P == 7) {
                String Tabuleiro = "   |   |   \n";
                Tabuleiro += "---|---|---\n";
                Tabuleiro += "   |   |   \n";
                Tabuleiro += "---|---|---\n";
                Tabuleiro += " " + Vez + " |   |   \n";
                System.out.println(Tabuleiro);
            } else if (P == 8) {
                String Tabuleiro = "   |   |   \n";
                Tabuleiro += "---|---|---\n";
                Tabuleiro += "   |   |   \n";
                Tabuleiro += "---|---|---\n";
                Tabuleiro += "   | " + Vez + " |   \n";
                System.out.println(Tabuleiro);
            } else if (P == 9) {
                String Tabuleiro = "   |   |   \n";
                Tabuleiro += "---|---|---\n";
                Tabuleiro += "   |   |   \n";
                Tabuleiro += "---|---|---\n";
                Tabuleiro += "   |   | " + Vez + " \n";
                System.out.println(Tabuleiro);
            }else{JOptionPane.showMessageDialog(null, "Posição inválida!");}
        } else {
            JOptionPane.showMessageDialog(null, "Jogador inválido!");
        }
    }

}
