/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursividade;

/**
 *
 * @author Danie
 */
public class Questao1 {
    public static int fatorial(int n){
        int j = 0;
        if (n==0){
            return 1;
        }
        else{
            j = j + (n * fatorial(n - 1));
        }
        System.out.println(j);
        return j;
    }
}