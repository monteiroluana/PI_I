/*
Escreva um programa em Java que lê o tamanho dos dois catetos de um 
triângulo retângulo e que mostra o perímetro do triângulo.
 */
package pi_exercicios_EstruturasSequenciais;
//@Monteiro

import java.util.Scanner;

public class TrianguloRetanguloII {

    public static void main(String[] args) {
        /*Entradas*/
        Scanner console = new Scanner(System.in);
        System.out.print("catetoA: ");
        double a = Double.parseDouble(console.nextLine());
        System.out.print("cateto2: ");
        double b = Double.parseDouble(console.nextLine());

        /*Processamento*/     
        double c = Math.sqrt(a * a + b * b);

        /*Saida */ 
        System.out.println("Hipotenusa c" + c);
        System.out.println("Perimetro " + (a + b + c));
    }
}
