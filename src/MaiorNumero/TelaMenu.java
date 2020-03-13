/*
 * Crie uma classe Java MaiorNumero que contenha um metodo que receba dois
 * numeros inteiros e imprima o maior entre eles.
 */
package MaiorNumero;

import java.util.Scanner;

/**
 *
 * @author Msv Wangley
 */
public class TelaMenu {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Informe um numero inteiro: ");
        int n1 = leitor.nextInt();
        System.out.print("Informe outro numero inteiro: ");
        int n2 = leitor.nextInt();
        
        int maiorElemento = OperacoesMaiores.obterMaiores(n1, n2);
        /* a variavel maiorElemento ira receber a funcao OperacoesMaiores com os parametros
         * n1 e n2 lidos na entrada.
        */
        System.out.println("Imprimindo o maior entre eles");
        OperacoesMaiores.impressaoMaiorNumero(maiorElemento);
        
    }
}
