
package Revisao;


public class FuncoesNaoSei {
    /*
     * 1-Faça uma função que gere e retorne um vetor contendo 100 números inteiros 
    * aleatórios
    */
    public static int[] gerarVetor(){
        int[] vetorNao = new int[100];
        for (int i = 0; i < vetorNao.length; i++) {
            vetorNao[i] = (int) (Math.random() * 100) + 1;
        }
        return vetorNao;
    }
    
    /*
     * 2-Faça uma função que receba um vetor de inteiros e retorne o menor elemento 
     * deste vetor
    */
    public static int menorElemento(int[] v){
        int menor = v[0];//ira receber o primeiro indice do vetor que sera por enquanto o menor
        for (int i = 0; i < v.length; i++) {
            if(v[i] < menor){
                menor = v[i];//menor recebe do elemento de v[i] 
            }
        }
        return menor;
    }
    
    /*
     * 3-Faça uma função que receba um vetor de inteiros e retorne o maior elemento 
     * deste vetor 
    */
    
    public static int maiorElemento(int[] v){
        int maior = v[0];//ira receber o primeiro indice do vetor que sera por enquanto o maior
        for (int i = 0; i < v.length; i++) {
            if(v[i] > maior){
                maior = v[i];
            }
        }
        return maior;
    }
    
    /*
     * 4-Faça uma função que receba dois valores do tipo inteiro e retorne a média
    */
    
    public static double calcularMedia(int n1, int n2){
        double media = (n1 + n2 ) / 2;
        return media;
    }
    
    /*
     * Criar uma funcao que receba um vetor e um numero e retorne a quantidade de elementos
     * que sao menores que esse numero
    */
    public static int qtdElementosMenores(int[] v, double n){
        int cont = 0;//contador de n. menores
        for (int i = 0; i < v.length; i++) {
            if(v[i] < n ){//verifica se os elementos de v sao menores que n, se for conta
                cont ++;
            }
        }
        return cont;
    }
    
    /*
     * 5 - Faca uma funcao que receba um vetor e retorne um vetor contendo todos os
     * elementos menores que a media (maior elemento + menor elemento)
    */
    
    public static int[] elementosMenoresMedia(int[] v){
        int menor = menorElemento(v);//o menor recebe da funcao menorElemento
        int maior = maiorElemento(v);//o maior recebe da funcao maiorElemento
        double media = calcularMedia(menor, maior);//calcula a media do menor e maior
        int tamanho = qtdElementosMenores(v, media);//tamanho do subvetor
        int[] subVetor = new int[tamanho];
        int j = 0; //indice do sub-vetor
        for(int i = 0; i < v.length; i++) {
            if(v[i] < media){
                subVetor[j] = v[i];
                j++; //a cada acrescimo do subvetor o indice j passa para o proximo indice
            }
        }
        return subVetor;
    }
    
    /*
     * 6-Faça uma função que receba um vetor e imprima o seu conteúdo
    */
    
    public static void impressao(int[] v){
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
            if((i + 1) % 10 == 0){//se a linha atingir 10 pula para proxima linha
                System.out.println("");
            }
        }
    }
    
}
