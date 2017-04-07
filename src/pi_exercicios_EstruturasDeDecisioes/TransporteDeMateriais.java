/*
Escreva um programa que pergunta qual o tipo de material que vai ser transportado 
e qual a temperatura que está no local de transporte.
O programa deve indicar se é possível ou não fazer o transporte.
 */
package pi_exercicios_EstruturasDeDecisioes;
//@Monteiro

import java.util.Scanner;

public class TransporteDeMateriais {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("Tipo de Material: ");
        String tipo = console.next();
        System.out.print("Temperatura: ");
        double temperatura = console.nextDouble();

        switch (tipo) {
            case "a":
                if (temperatura >= 10 && temperatura <= 17) {
                    System.out.println("É possivel fazer o transporte");
                } else {
                    System.out.println("Não será possivel fazer o transporte");
                }break;
            case "b":if (temperatura >= 11 && temperatura <= 16) {
                    System.out.println("É possivel fazer o transporte");
                } else {
                    System.out.println("Não será possivel fazer o transporte");
                }break;
            case "c":if (temperatura >= 12 && temperatura <= 15) {
                    System.out.println("É possivel fazer o transporte");
                } else {
                    System.out.println("Não será possivel fazer o transporte");
                }break;
            case "d":if (temperatura >= 13 && temperatura <= 14) {
                    System.out.println("É possivel fazer o transporte");
                } else {
                    System.out.println("Não será possivel fazer o transporte");
                }break;
                
            default: System.out.println("Tipo invélido");

        }
    }
}
