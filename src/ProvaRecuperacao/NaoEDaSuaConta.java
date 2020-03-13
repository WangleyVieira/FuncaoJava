
package ProvaRecuperacao;

/**
 *
 * @author Msv Wangley
 */
public class NaoEDaSuaConta {
    //questao 1
    public static double[] vetoresAleatorios(){
        double[] vetorSeiLa = new double[10]; //vetor do tamanho 10
        for (int i = 0; i < 10; i++) {
            vetorSeiLa[i] = (double) (Math.random() * 4001) + 1000; //gera vetores aleatorios
        }
        return vetorSeiLa;
    }
    
    //questao 2
    public static double mediaValores(double[] vetorNaoSei){
        double media = 0;
        double soma = 0;
        for (int i = 0; i < vetorNaoSei.length; i++) {
            soma += vetorNaoSei[i];
        }
        media = soma / 10;
        
        return media;
    }
    
    //questao 3
    public static double metadeMedia(double[] vetorNaoSei){
        double metade = mediaValores(vetorNaoSei) / 2;
        return metade;
    }
    
    //questao 4
    public static double[] salarioCorrigido(double[] vetorNaoSei, double numero){
        double[] subVetor = new double[10];
        int j = 0;
        
        for (int i = 0; i < subVetor.length; i++) {
            subVetor[j] = vetorNaoSei[i] + numero;
            j ++;
        }
        return subVetor;
    }
    
    
    //questao 5
    public static void impressaoVetor(double[] vetorNaoSei){
        System.out.println("Funcionario  |  Salario Atual");
        for (int i = 0; i < vetorNaoSei.length; i++) {
            System.out.printf("Pessoa %d R$ %11.2f \n", (i+1), vetorNaoSei[i]);
        }
    }
    //
    public static void impressaoVetor2(double[] vetorNaoSei, double[] subVetor){
        System.out.println("Funcionario   |   Salario Atual   |  Salario Corrigido");
        for (int i = 0; i < vetorNaoSei.length; i++) {
            double[] aux = salarioCorrigido(subVetor, i);
            System.out.printf("Pessoa %d R$ %13.2f R$ %17.2f\n", (i+1), vetorNaoSei[i], aux[i]);
        }
    }
}
