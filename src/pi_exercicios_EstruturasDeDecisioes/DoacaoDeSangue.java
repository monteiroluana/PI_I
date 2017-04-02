/*
Escreva um algoritmo que lê o seu tipo sanguíneo e mostra:

Para quais tipos você pode fazer uma doação de sangue
De quais tipos você pode receber uma doação de sangue
Exemplo:

Qual seu tipo sanguíneo: A-
Você pode doar para: A+, A-, AB-, AB+
Você pode receber de: A-, O-
 */
package pi_exercicios_EstruturasDeDecisioes;
//@Monteiro

import javax.swing.JOptionPane;

public class DoacaoDeSangue {

    public static void main(String[] args) {

        /*Entrada*/
        String TipoSangue = JOptionPane.showInputDialog("Tipo sanguíneo");

        /*Processamento*/
        if (TipoSangue.equalsIgnoreCase("a-")) {
            JOptionPane.showMessageDialog(null, "Tipo Sanguíneo: A-\nVocê pode doar para: A+,  A-,  AB-,  AB+\nVocê pode receber de: A-,  O-");
        } else if (TipoSangue.equalsIgnoreCase("a+")) {
            JOptionPane.showMessageDialog(null, "Tipo Sanguíneo: A+\nVocê pode doar para: A+,  AB+\nVocê pode receber de: A+,  A-,  O+,  O-");
        } else if (TipoSangue.equalsIgnoreCase("b+")) {
            JOptionPane.showMessageDialog(null, "Tipo Sanguíneo: B+\nVocê pode doar para: B+,  AB+\nVocê pode receber de: B+,  B-,  O+,  O-");
        } else if (TipoSangue.equalsIgnoreCase("b-")) {
            JOptionPane.showMessageDialog(null, "Tipo Sanguíneo: B-\nVocê pode doar para: B+,  B-,  AB+,  AB-\nVocê pode receber de: B-,  O-");
        } else if (TipoSangue.equalsIgnoreCase("ab+")) {
            JOptionPane.showMessageDialog(null, "Tipo Sanguíneo: AB+\nVocê pode doar para: AB+\nVocê pode receber de: A+,  A-,  B+,  B-,  AB+,  AB-,  O+,  O-");
        } else if (TipoSangue.equalsIgnoreCase("ab-")) {
            JOptionPane.showMessageDialog(null, "Tipo Sanguíneo: AB-\nVocê pode doar para: AB+,  AB-\nVocê pode receber de: A+,  A-,  AB+,  O-");
        } else if (TipoSangue.equalsIgnoreCase("o+")) {
            JOptionPane.showMessageDialog(null, "Tipo Sanguíneo: O+\nVocê pode doar para: A+,  B+,  AB+,  O+\nVocê pode receber de: O+,  O-");
        } else if (TipoSangue.equalsIgnoreCase("o-")) {
            JOptionPane.showMessageDialog(null, "Tipo Sanguíneo: O-\nVocê pode doar para: A+,  A-,  B+,  B-,  AB+,  AB-,  O+,  O-\nVocê pode receber de: O-");
        }else{JOptionPane.showMessageDialog(null, "Verifique se digitou corretamente");}

    }
}
