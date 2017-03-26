package pi_exercicios_EstruturasSequenciais;
//@Monteiro

import java.util.Scanner;

public class BhaskaraAsAvessas {
    
   //Programa Bhaskara às Avessas
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        /*Entradas*/
        System.out.print("x1: ");
        double x1 = Double.parseDouble(console.nextLine());
        System.out.print("x2: ");
        double x2 = Double.parseDouble(console.nextLine());
        System.out.print("c: ");
        double c = Double.parseDouble(console.nextLine());

        /*Saidas*/
        double soma = x1 + x2;
        double produto = x1 * x2;
        double a = c / produto;
        double b = -(soma * a);

        System.out.println("A equação que tem raizes" + x1 + " e " + x2 + " é " + a + "x² + " + b + "x + " + c);

    }

}
