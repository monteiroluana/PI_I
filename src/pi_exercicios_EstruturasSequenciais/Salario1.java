/*
Escreva um algoritmo que lê o nome de um funcionário, o valor da sua hora de 
trabalho e a quantidade de horas que ele trabalhou. O algoritmo deve calcular 
o valor do salário a ser pago e mostrar a seguinte mensagem: “O funcionário 
Nome do Funcionário trabalhou Horas Trabalhadas horas por R$ Valor da Hora 
e deve receber R$ Valor do Salário“.
 */
package pi_exercicios_EstruturasSequenciais;

import java.util.Scanner;
//@Monteiro

public class Salario1 {

    public static void main(String[] args) {
        String NomeFuncionario;
        double HorasTrabalhadas, ValorHora, Salario;

        Scanner console = new Scanner(System.in);

        /*Entradas*/
        System.out.print("Nome do Funcionário: ");
        NomeFuncionario = console.next();
        System.out.print("Horas Trabalhadas: ");
        HorasTrabalhadas = console.nextDouble();
        System.out.print("Valor da hora: ");
        ValorHora = console.nextDouble();

        /*Processamento*/
        Salario = HorasTrabalhadas * ValorHora;
        
        /*Saida*/
        System.out.printf("O Funcionário %s terá o seu salário de R$%.2f\n", NomeFuncionario, Salario);

    }

}
