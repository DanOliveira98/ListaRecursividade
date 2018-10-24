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
import java.util.Scanner;
public class Questao1Main {
    public static void main(String[] args) {
        Questao1 q = new Questao1();
        Scanner rec = new Scanner(System.in);
        System.out.println("Informe o Valor do numero que você quer o fatorial");
        int n = rec.nextInt();
        Questao1.fatorial(n);
    }
    
}
