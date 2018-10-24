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
public class Questao5 {
    public int somInt(int n, int j){
        if(n==0){
            System.out.println(j);
            return j; 
        }
        else{
            return somInt(n-1, j + n) + n-1;
    }
}
}