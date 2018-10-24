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
public class Questao7 {
    public static int ver(int n, int p, int cont){
        if(n==0){
            System.out.println("O numero " + p + " aparece " + cont +" vezes!");
            return cont;
        }
        else{
            if(p == (n%10)){
                cont++;
            }
            n = n /10;
            return ver(n,p,cont);
        }
    }
    public static void main(String args[]){
        Scanner rec = new Scanner(System.in);
        System.out.println("Informe o numero");
        int n = rec.nextInt();
        System.out.println("Informe o Digito que você quer verificar");
        int num = rec.nextInt();
        Questao7 q = new Questao7();
        q.ver(n,num,0);
    }
}
