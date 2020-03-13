
package FuncaoMatrizes;

/**
 *
 * @author Msv Wangley
 */
public class FuncoesMatrizes {
    /*
     * 1 - Construa uma funcao que retorne uma matriz de quadrada 4x4 preenchidas aleatori-
    * mente (valores de 1 ate 20)
    */
    public static int[][] obterMatriz(){
        int[][] matriz = new int[4][4];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = (int) (Math.random() * 10) + 1;
            }
        }
        return matriz;
    }

    
    
    /*
     * Impressao de Matriz
    */
    public static void impressaoMatriz(int[][] matriz){
        System.out.println("Matriz Impressa");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(" [ "+matriz[i][j]+" ] ");
            }
            System.out.println("");
        }
    }
}
