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
public class Questao4 {
    public static int somvect(int a[], int n){
        if(n==1){
            return a[0];
        }
        else
            return somvect(a,n-1) + a[n-1];
    }
}
