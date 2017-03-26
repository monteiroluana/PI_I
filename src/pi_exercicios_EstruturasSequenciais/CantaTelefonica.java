/*
Uma conta telefônica é composta pelos seguintes itens:

* Assinatura: R$ 23,32
* Ligações Locais: R$ 0,09 / min
* Ligações Interurbanas (DDD): R$ 0,26 / min
* Ligações Internacionais (DDI): R$ 0,86 / min

Escreva um algoritmo que lê os minutos gastos em cada tipo de ligação e que 
mostra o valor a ser pago em cada um dos itens e, também, o valor total.
 */
package pi_exercicios_EstruturasSequenciais;

import java.util.Scanner;
//@Monteiro 

public class CantaTelefonica {

    public static void main(String[] args) {
        double Assinatura = 23.32;
        double LgLocais = 0.09;
        double LgInterurbana = 0.26;
        double LgInternacionais = 0.86;
        double Locais, Interurbanas, Internacionais, Total;

        Scanner console = new Scanner(System.in);

        /*Entradas*/
        System.out.println("Insira os minutos gastos em cada tipo de ligação");
        System.out.print("Ligações Locais (R$0.09/min) : ");
        Locais = console.nextDouble();
        System.out.print("Ligações Interurbanas (R$0.26/min) : ");
        Interurbanas = console.nextDouble();
        System.out.print("Ligações Internacionais (R$0,86/min) : ");
        Internacionais = console.nextDouble();

        /*Processamento*/
        Locais = Locais * LgLocais;
        Interurbanas = Interurbanas * LgInterurbana;
        Internacionais = Internacionais * LgInternacionais;
        Total = Assinatura + Locais + Internacionais + Interurbanas;

        /*Saida*/
        System.out.println("__________________________________________________________");
        System.out.printf("Assinatura: R$%.2f\n", Assinatura);
        System.out.printf("Ligaçôes Locais: R$%.2f\n", Locais);
        System.out.printf("Ligações Interurbanas: R$%.2f\n", Interurbanas);
        System.out.printf("Ligaçoes Internacionais: R$%.2f\n", Internacionais);
        System.out.printf("TOTAL DA CONTA: R$%.2f\n", Total);

    }

}
