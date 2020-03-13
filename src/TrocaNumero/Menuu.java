/*/*
 * Crie uma classe java TrocaNumero que contenha um método que receba dois
 * números NumA e NumB, nessa ordem, e imprima em ordem inversa, isto é, se os
 * dados lidos forem NumA = 5 e NumB = 9, por exemplo, devem ser impressos na
 * ordem NumA = 9 e NumB = 5.
*/
package TrocaNumero;

import java.util.Scanner;

/**
 *
 * @author Msv Wangley
 */

public class Menuu {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Informe um valor A = ");
        int n1 = leitor.nextInt();
        System.out.print("Informe um valor B = ");
        int n2 = leitor.nextInt();
        System.out.println("Imprimindo valor de A = "+n1+" valor de B = "+n2);
     
        System.out.println("Valores Inversos");
        SeiLaFuncoes.inversao(n1, n2);
    }
}
