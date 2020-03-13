/*
 * Funcao
 */
package TrocaNumero;

/**
 *
 * @author Msv Wangley
 */
public class SeiLaFuncoes {
    public static void inversao(int numero1, int numero2){
        int aux = 0;
        aux = numero1;
        numero1 = numero2;
        numero2 = aux;
        System.out.println("Valor de A = "+numero1+" valor de B = "+numero2);
    }
    
}
