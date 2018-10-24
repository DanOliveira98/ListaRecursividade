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
public class Questao8 {
    public static int mult(int n, int p, int cont){
        if(p==0){
            System.out.println(cont);
            return n;
        }
        else{
            cont = cont + n;
            return mult(n, p - 1, cont); 
        }
    }
    public static void main(String args[]){
        Scanner rec = new Scanner(System.in);
        System.out.println("Informe o primeiro numero");
        int n = rec.nextInt();
        System.out.println("Informe o segundo numero");
        int num = rec.nextInt();
        mult(n,num,0);
    
    
    }
}
