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
public class Questao2 {
    int j = 0;
    public int fibonacci(int n) {
        if (n == 0) {
            System.out.println(j);
            return j;
        } else {
            if (n == 1) {
                return 1;
            } else {
              return j = fibonacci(n - 1) + fibonacci(n - 2);

            }
        }
}
}