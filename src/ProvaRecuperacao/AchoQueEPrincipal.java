
package ProvaRecuperacao;

import java.util.Scanner;

/**
 *
 * @author Msv Wangley
 */
public class AchoQueEPrincipal {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double[] vetorNao = NaoEDaSuaConta.vetoresAleatorios();
        
        boolean terminar = false;
        do{
            System.out.println("\n--------------------------------------");
            System.out.println("1 - Salario atual");
            System.out.println("2 - Valor do aumento");
            System.out.println("3 - Salario corrigido");
            System.out.println("4 - Sair");
            System.out.println("----------------------------------------");
            System.out.print("Informe a opcao: ");
            int opcao = leitor.nextInt();
            switch(opcao){
                case 1://opcao 1
                    NaoEDaSuaConta.impressaoVetor(vetorNao);
                    break;
                    
                case 2://opcao 2
                    double metade = NaoEDaSuaConta.metadeMedia(vetorNao);
                    double total = NaoEDaSuaConta.mediaValores(vetorNao);
                    System.out.printf("Media dos salarios: %.2f\n", total);
                    System.out.printf("Valor do aumento: %.2f", metade);
                    break;
                    
                case 3://opcao 3
                    double n = NaoEDaSuaConta.metadeMedia(vetorNao);
                    double[] subV = NaoEDaSuaConta.salarioCorrigido(vetorNao, n);
                    NaoEDaSuaConta.impressaoVetor2(vetorNao, subV);
                    
                    break;
                    
                case 4://opcao 4
                    System.out.println("Encerrando...");
                    terminar = true;
                    break;
                    
                default:
                    System.out.println("Opcao Invalida!");
            }
        }
        while(terminar == false);
    }
}
