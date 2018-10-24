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
public class Questao3Main {
    public static void main(String args[]){
        Scanner rec = new Scanner(System.in);
        System.out.println("Informe o numero que você quer que seja invertido");
        int n = rec.nextInt();
        Questao3 q = new Questao3();
        q.invercao(n,0);
        
        
    }
}
