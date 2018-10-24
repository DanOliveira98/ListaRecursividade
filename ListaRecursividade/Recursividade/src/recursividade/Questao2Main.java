/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursividade;

import java.util.Scanner;

/**
 *
 * @author Danie
 */
public class Questao2Main {

    public static void main(String[] args) {
        Questao2 q = new Questao2();
        Scanner rec = new Scanner(System.in);
        System.out.println("Informe quantos termos tem nessa sequencia");
        int n = rec.nextInt();
        q.fibonacci(n);
    }
}
