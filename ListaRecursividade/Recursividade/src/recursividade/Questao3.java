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
public class Questao3 {
    public static int invercao(int n, int inv){
        if(n==0){
            System.out.println(inv);
            return inv;
        }
        else{
            return invercao( n/10, inv * 10 + n % 10);
        }
    }
}
