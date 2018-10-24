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
public class Questao5Main {
    public static void main(String args[]){
        Scanner rec = new Scanner(System.in);
        System.out.println("Informe o valor que voce quer somar de 1 até ele");
        int n = rec.nextInt();
        Questao5 q = new Questao5();
        q.somInt(n,0);
    }
}
