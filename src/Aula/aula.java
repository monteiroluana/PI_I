/*
04/05/2017
Tratamento de erro  

try{

}catch(NumberFormatException ex){
System.out.println("ERRO");
}

 */
package Aula;
//@Monteiro

import java.util.Scanner;

public class aula {

    public static void main(String[] args) {
        double n1 = lerNumero("Número 1");
        double n2 = lerNumero("Número 2");
        double resultado = n1 + n2;
        System.out.println(resultado);
    }
    

    /*Criando uma função para ler o número*/
    public static double lerNumero(String mensagem) {
        Scanner console = new Scanner(System.in);
        boolean numeroValido = false;
        double n = 0;
        do {
            try {
                System.out.println(mensagem);
                n = Double.parseDouble(console.nextLine());
                numeroValido = true;
            } catch (NumberFormatException ex) {
                System.out.println("Número Inválido");
            }
        } while (!numeroValido);
        return n;
    }
    

    /*Criando uma função para fazer um calculo fatorial*/
    public static int fatorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * fatorial(n - 1);
        }
    }


}
