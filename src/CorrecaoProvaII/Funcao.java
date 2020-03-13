
package CorrecaoProvaII;

/**
 *
 * @author Msv Wangley
 */
public class Funcao {
    // 1 - Crie uma funcao que retorne um vetor de 100 elementos do tipo inteiro preenchido
    //com numeros aleatorios entre [-100, +100]
    public static int[] geraVetor(){
        int[] vetor = new int[100];//declaracao do vetor do tamanho 100
        for (int i = 0; i < 100; i++) {
            vetor[i] = (int) (Math.random() * 201) - 100;//gera numeros aleatorios entre 100 e -100 
            //para preencher os elementos do vetor[i]
        }
        return vetor;
    }
    
    // 2 - Crie uma funcao que receba um valor do tipo inteiro e retorne verdadeiro se este
    //numero for negativo, e retorne falso, caso contrario
    public static boolean ehNegativo(int n){
        boolean retorno = false;
        if(n < 0){
            retorno = true;
        }
        return retorno;
    }
    
    // 3 - Crie uma funcao que receba um vetor de inteiros e retorne a quantidade de elementos
    //que sao numeros negativos (utilize a funcao do exercicio 2)
    public static int qtdNegativos(int[] v){
        int cont = 0;
        for (int i = 0; i < v.length; i++) {
            if(ehNegativo(v[i])){//chama a funcao anterior para comparar se eh negativo os elementos do vetor v
                cont ++;
            }
        }
        return cont;
    }
    
    // 4 - Crie uma funcao que receba um vetor de inteiros e retorne um sub-vetor contendo
    //os numeros nao negativos (utilize a funcao dos exercicios 2 e 3)
    public static int[] elementosNaoNegativos(int[] v){
        int tamanho = v.length - qtdNegativos(v);//total - qtd nao-negativos, o resultado sera os elementos nao-negativos
        int[] subV = new int[tamanho];//tamanho do sub-vetor nao-negativos
        int j = 0;//indice do sub-vetor 
        for (int i = 0; i < v.length; i++) {
            if(!ehNegativo(v[i])){ //nao negativo. if(ehNegativo(v[i]) == false)
                subV[j] = v[i];
                j ++;
            }
        }
        return subV;//retorna um sub-vetor
    }
    
    //impressao
    public static void imprimirVetor(int[] v){
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
            if( (i+1) % 10 == 0){ //pula linha se o indice for maior que 10
                System.out.println("");
            }
        }
    }
}
