
package OrdemDecrescente_Funcao;

/**
 *
 * @author Msv Wangley
 */
public class ExecucoesVetores {
    public static int[] gerarVetor(int numero){
        int[] vetorNaoSei = new int[numero];
        for (int i = 0; i < vetorNaoSei.length; i++) {
            vetorNaoSei[i] = (int) (Math.random() * 10) + 1;
        }
        return vetorNaoSei;
    }  
    public static void impressao(int[] vetorNaoSei){
        for (int i = 0; i < vetorNaoSei.length; i++) {
            System.out.print(vetorNaoSei[i]+" ");
        }
        System.out.println("");
    }
}
