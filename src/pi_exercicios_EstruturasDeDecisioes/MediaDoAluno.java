/*
Escreva um programa em Java que lê as notas de duas provas de um aluno e calcula sua média.
Se o aluno tiver média maior ou igual a 6,0, ele passa. Caso contrário, ele fará mais uma prova.
Nesse caso, o programa deve ler essa terceira nota e recalcular a média, substituindo a menor nota entre P1 e P2 pela nota da P3.
Indique a nova média do aluno e se ela conseguiu passar ou não.

Atenção: se o aluno fizer a P3, sua média máxima é 6,0.
 */
package pi_exercicios_EstruturasDeDecisioes;
//@Monteiro

import javax.swing.JOptionPane;

public class MediaDoAluno {

    public static void main(String[] args) {

        /*Entradas  P1 e P2*/
        double P1 = Double.parseDouble(JOptionPane.showInputDialog("P1"));
        double P2 = Double.parseDouble(JOptionPane.showInputDialog("P2"));
        double Frequencia = Double.parseDouble(JOptionPane.showInputDialog("Frequência"));

        /*Processamento*/
        double Media1 = (P1 + P2) / 2;

        /*Se a media for maior que 6 e a frequência maior que 75 o aluno passa*/
        if (Media1 >= 6 && Frequencia >= 75) {
            JOptionPane.showMessageDialog(null, "Média: " + Media1 + "\n Frequência: " + Frequencia + "\n PASSOU ");

            /*frequencia menor que 75*/
        } else if (Frequencia < 75) {
            JOptionPane.showMessageDialog(null, "Média: " + Media1 + "\n Frequência: " + Frequencia + "\n NÂO PASSOU ");

            /*Se a media for menor que 6 e a frequência maior que 75 pede uma terceira nota e troca ela pela menor nota*/
        } else {
            double P3 = Double.parseDouble(JOptionPane.showInputDialog("P3"));
            if (P1 > P2) {
                double Media2 = (P1 + P3) / 2;
                if (Media2 >= 6) {
                    JOptionPane.showMessageDialog(null, "Média: 6\n Frequência: " + Frequencia + "\n Ufa,Passou!");

                    /*Se a media continuar sendo menor que 6*/
                } else {
                    JOptionPane.showMessageDialog(null, "Nao Passou!!");
                }
                /*Se a media for menor que 6 e a frequência maior que 75 pede uma terceira nota e troca ela pela menor nota*/
            } else {
                double Media2 = (P2 + P3) / 2;
                if (Media2 >= 6) {
                    JOptionPane.showMessageDialog(null, "Média: 6\n Frequência: " + Frequencia + "\n Ufa,Passou!");

                    /*Se a media continuar sendo menor que 6*/
                } else {
                    JOptionPane.showMessageDialog(null, "Não Passou!");
                }
            }
        }

    }

}
