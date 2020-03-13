/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MaiorNumero;

/**
 *
 * @author Msv Wangley
 */
public class OperacoesMaiores {
    public static int obterMaiores(int numero1, int numero2){
        int maiorNumero = 0;
        if(numero1 > numero2){
            maiorNumero = numero1;
        }
        else{
            maiorNumero = numero2;
        }
        return maiorNumero;
    }
    //impressao do maior numero
    public static void impressaoMaiorNumero(int maiorNumero){
        System.out.println("O maior numero = "+maiorNumero);
    }
}
