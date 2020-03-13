/*
 * Crie um programa principal que obtenha o vetor gerado pela funcao do exercicio 1
 * e implemente o seguinte menu utilizando comando de repeticao:
 *      1 - Imprimir o vetor  gerado
 *      2 - Imprimir somente os numeros nao negativos
 *      3 - Sair
 */
package CorrecaoProvaII;

import java.util.Scanner;

/**
 *
 * @author Msv Wangley
 */
public class MenuPrincipal {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] vetor = Funcao.geraVetor();//o vetor irao receber os elementos da Funcao.geraVetor
        boolean terminar = false;
        
        do{
            System.out.println("\n-----------------------");
            System.out.println("1 - Vetor Gerado");
            System.out.println("2 - Vetor nao negativo");
            System.out.println("3 - Sair");
            System.out.println("-----------------------");
    
            System.out.print("Informe a opcao: ");
            int opcao = ler.nextInt();
            switch(opcao){
                case 1:
                  Funcao.imprimirVetor(vetor);
                break;
                
                case 2:
                    int[] numerosNaoNegativos = Funcao.elementosNaoNegativos(vetor);
                    Funcao.imprimirVetor(numerosNaoNegativos);
                break;
                
                case 3:
                    System.out.println("Encerrando!!!");
                    terminar = true;//terminar recebe verdadeiro e encerra a execucao
                break;
                
                default:
                    System.out.println("Opcao Invalida!");
            }
        }
        while(terminar == false);
    }
}
