/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursividade;

import java.util.Scanner;
import static recursividade.Questao9.cresc;

/**
 *
 * @author Danie
 */
public class Questao10 {
     public static int desc(int n){
     System.out.println(n);
     if(n==0){
         return 0;
     }
     else{
         return desc(n - 1);
     }
        
    }
        public static void main(String args[]){
        Scanner rec = new Scanner(System.in);
        System.out.println("Informe o numero inteiro positivo");
        int n = rec.nextInt();
        desc(n);
    
    
    }
}
