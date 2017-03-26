/*
23/03/2017
SORTEAR NUMEROS ENTRE 0 E 9
 */
package Aula;

import java.util.Random;
import java.util.Scanner;
//@Monteiro

public class Exercicio_sorteio {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Random rng = new Random();

        // vai mostrar quantos numeros ele vai sortear
        int i = rng.nextInt(10);
        System.out.println(i);

    }

}
