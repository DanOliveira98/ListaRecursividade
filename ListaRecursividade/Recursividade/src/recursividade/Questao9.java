/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursividade;

import java.util.Scanner;
import static recursividade.Questao8.mult;

/**
 *
 * @author Danie
 */
public class Questao9 {
    public static int cresc(int n, int p){
     System.out.println(p);
     if(n==p){
         return 0;
     }
     else{
         return cresc(n, p + 1);
     }
        
    }
        public static void main(String args[]){
        Scanner rec = new Scanner(System.in);
        System.out.println("Informe o numero inteiro positivo");
        int n = rec.nextInt();
        cresc(n,0);
    
    
    }
    }
