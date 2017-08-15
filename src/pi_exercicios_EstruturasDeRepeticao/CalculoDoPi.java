/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pi_exercicios_EstruturasDeRepeticao;
//@Monteiro

public class CalculoDoPi {

    public static void main(String[] args) {

        double pi = 0, pi2 = 0, num;

        for (int i = 1; i <= 100; i += 2) {
            System.out.println(i);

            num = 1d / (i);
            pi = pi + num;
            pi = pi - num;

        }
        System.out.println("Valor de pi: " + pi);
    }
}
