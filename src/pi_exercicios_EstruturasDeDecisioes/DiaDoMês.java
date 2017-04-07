/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pi_exercicios_EstruturasDeDecisioes;
//@Monteiro

import java.util.Scanner;

public class DiaDoMês {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("mes");
        String mes = console.next();
        switch(mes){
            case "1":
                System.out.println("Janeiro tem 31 dias");
                break;
            case "2":
                System.out.println("fevereiro tem 28 dias");
                break;
            case "3":
                System.out.println("Março tem 31 dias");
                break;
            case "4":
                    System.out.println("Abril tem 30 dias");
                    break;
            case "5":
                System.out.println("Maio tem 31 dias");
                break;
            case "6":
                System.out.println("Junho tem 30 dias");
                break;
            case "7":
                System.out.println("Julho tem 31 dias");
                break:
                case"8":
                    System.out.println("Agosto tem");
                    
                break;
                        
        }
    }
    

}
