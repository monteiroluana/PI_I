/*
Escreva um programa em Java que lê o tamanho dos dois catetos de um 
triângulo retângulo e que mostra o tamanho da hipotenusa.
 */
package pi_exercicios_EstruturasSequenciais;
//@Monteiro

import java.util.Scanner;

public class TrianguloRetangulo {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        
        /*Entrada*/
        System.out.print("catetoA: ");
        double a = Double.parseDouble(console.nextLine());
        System.out.print("cateto2: ");
        double b = Double.parseDouble(console.nextLine());

        /*Processamento*/      
        double c = Math.sqrt(a * a + b * b);

        /*Saida*/      
        System.out.println("Hipotenusa c" + c);
        System.out.println("Perimetro " + (a + b + c));
    }
}

