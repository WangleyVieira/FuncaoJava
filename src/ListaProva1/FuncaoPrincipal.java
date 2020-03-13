
package ListaProva1;



import java.util.Scanner;

/**
 * @author Msv Wangley
 */
public class FuncaoPrincipal {
    public static void main(String[] args) {
        
        int[] elementos = OperacoesVetores.gerarVetores();//novo vetor recebendo a funcao gerarVetores
        Scanner leitor = new Scanner(System.in);
        boolean terminar = false;
        
        do{
            System.out.println("-----------------------");
            System.out.println("1 - Visualizar Vetor");
            System.out.println("2 - Obter Subvetor");
            System.out.println("3 - Sair");
            System.out.println("-----------------------");
            System.out.print("Informe uma opcao: ");
            int opcao = leitor.nextInt();
            
            switch(opcao){
                case 1://mostrar vetor gerado
                    OperacoesVetores.imprimirVetores(elementos);
                break;
                
                case 2://obter subvetor
                    System.out.print("Informe um numero: ");
                    int numero = leitor.nextInt();
                    int[] subV = OperacoesVetores.subVetor(numero, elementos);
                    OperacoesVetores.imprimirVetores(subV);//imprime os subvetores
                break;
                
                case 3://opcao sair 
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
