/*
23/03/2017
Começando a aprender tomadas de decisões IF, ELSE com operadores lógicos,
nesse exercicio usamos ==(igual) ||(ou)
*/
package Aula;
//@Monteiro

import java.util.Scanner;

public class DecisaoDias {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        //ENTRADA
        System.out.print("mês: ");
        int mes = console.nextInt();

        //PROCESSAMENTO
        int dias;
        if(mes == 2){
            dias = 28;
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                dias = 30;
            } else {
                dias = 31;
            }
        

        //SAIDA
        System.out.println("O Mês " + mes + " possue " + dias + " dias");
    }
}
