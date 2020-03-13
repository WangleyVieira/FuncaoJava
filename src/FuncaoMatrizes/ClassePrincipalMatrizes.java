
package FuncaoMatrizes;

import java.util.Scanner;

/**
 *
 * @author Msv Wangley
 */
public class ClassePrincipalMatrizes {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int[][] elementosMatrizA = FuncoesMatrizes.obterMatriz();
        //int[][] elementosMatrizB = FuncoesMatrizes.obterMatrizB();

        System.out.println("Matriz Gerada com elementos aleatoriamente");
        System.out.println("------------------------------------------");
        FuncoesMatrizes.impressaoMatriz(elementosMatrizA);
        System.out.println("");
    }
}
