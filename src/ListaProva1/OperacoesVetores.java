
package ListaProva1;


public class OperacoesVetores { 
    
    /*Construa uma função que retorne um vetor de inteiros com 10 posições
preenchidas com números aleatórios (valores entre 1 e 10).*/    
    public static int[] gerarVetores(){//nao pediu nenhum parametro, somente gerar vetor
        
        int[] vetor = new int[10];
        for (int i = 0; i < vetor.length; i++) {//length eh o tamanho do vetor
            vetor[i] = (int) (Math.random() * 10) + 1; //gera valores entre 1 e 10 aleatoriamente
        }
        return vetor; //retorna um vetor
    }
   //-------------------------------------------------------------------------- 
    /*Crie uma função que receba um determinado número inteiro X e um
vetor de inteiros e informe a quantidade de elementos dentro deste vetor que é
maior que esse número X. A função deve retornar o valor 6.*/
    
    public static int quantidadeElemMaioresQue(int numero, int[] vetor){
    //recebe como parametro um numero inteiro X e um vetor
        int cont = 0;//contador de numeros maiores que o elementos do vetor[i]
        for (int i = 0; i < vetor.length; i++) {
            if(vetor[i] > numero){
                cont++; //tamanho do sub-vetor
            }
        }
        return cont;//retorna um valor inteiro
    }
    //-------------------------------------------------------------------------
    /*Crie uma função que receba um determinado número inteiro X e um
vetor de inteiros e retorne em um outro vetor, contendo todos os números maiores
que X. A função deve retornar o seguinte vetor: */
    
    public static int[] subVetor(int numero, int[] vetor){
    //recebe como parametro um numero inteiro X e um vetor
        int tamanho = quantidadeElemMaioresQue(numero, vetor);
        int[] subVetor = new int[tamanho]; //subvetor
        int j = 0;//indice do subvetor
        for (int i = 0; i < vetor.length; i++) {
            if(vetor[i] > numero){
                subVetor[j] = vetor[i];
                j++; //indice do subvetor, a cada comparacao ele se autoincrementa
            }
        }
        return subVetor;//retorna um subvetor
    }
    //-------------------------------------------------------------------------
    //funcao que somente imprime
    public static void imprimirVetores(int[] vetor){
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println("");
    }
}
