/*
 * 7-Faça o programa principal contendo o seguinte menu:

1) Imprimir vetor gerado

2) maior número

3) menor número

4) média do vetor

5) elementos menores que a média

6) sair
 */
package Revisao;

import java.util.Scanner;

/**
 *
 * @author Msv Wangley
 */
public class MenPrincipal {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int[] vetor = FuncoesNaoSei.gerarVetor();//vetor recebe os elementos da Funcao gerarVetor
        boolean terminar = false;
        do{
            System.out.println("\n-----------------------------------");
            System.out.println("1 - Imprimir vetor gerado");
            System.out.println("2 - Maior numero");
            System.out.println("3 - Menor numero");
            System.out.println("4 - Media do vetor");
            System.out.println("5 - Elementos menores que a media");
            System.out.println("6 - Sair");
            System.out.println("-----------------------------------");
            System.out.print("Informe uma opcao: ");
            int opcao = leitor.nextInt();
            
            switch(opcao){
                case 1:
                    FuncoesNaoSei.impressao(vetor);
                    System.out.println("");
                    break;//encerra este caso
                    
                case 2 :
                    int maiorNumero = FuncoesNaoSei.maiorElemento(vetor);//declaracao do maiorNumero
                    //na funcao principal e recebe a funcao maiorElemento, o mesmo ocorre com o menorNumero
                    System.out.println("Maior numero: " + maiorNumero);
                    break;
                    
                case 3:
                    int menorNumero = FuncoesNaoSei.menorElemento(vetor);
                    System.out.println("Menor numero: " + menorNumero);
                    break;
                    
                case 4: 
                    maiorNumero = FuncoesNaoSei.maiorElemento(vetor);
                    menorNumero = FuncoesNaoSei.menorElemento(vetor);
                    double mediaVetor = FuncoesNaoSei.calcularMedia(menorNumero, maiorNumero);
                    System.out.println("Media do vetor: " + mediaVetor);
                    break;
                    
                case 5:
                    int[] subVetorMenores = FuncoesNaoSei.elementosMenoresMedia(vetor);
                    FuncoesNaoSei.impressao(subVetorMenores);
                    break;
                    
                case 6:
                    System.out.println("Encerrando...");
                    terminar = true;//terminar recebe verdadeiro e encerra o programa
                    break;
                    
                default:
                    System.out.println("Opcao Invalida!!!");
            }
        }
        while(terminar == false);
    }
}
