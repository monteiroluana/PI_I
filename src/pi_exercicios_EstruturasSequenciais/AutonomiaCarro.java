/*
Escreva um programa em Java que calcula quantos km/l seu carro está fazendo.
 */
package pi_exercicios_EstruturasSequenciais;
//@Monteiro

import java.util.Scanner;

public class AutonomiaCarro {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        /*Entrada*/    
        System.out.print("Distancia: ");
        double distancia = Double.parseDouble(console.nextLine());
        System.out.print("Combustivel: ");
        double combustivel = Double.parseDouble(console.nextLine());

        /*Processamento*/    
        double consumo = distancia / combustivel;

        /*Saida*/   
        System.out.println("o consumo é " + consumo);
    }
}
