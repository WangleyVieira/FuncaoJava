
package ListaProva2;

import java.util.Scanner;


public class NaoSei {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        boolean terminar = false;
        
        System.out.print("Informe a quantidade de veiculos: ");
        int qtdVeiculos = leitor.nextInt();
        int[] veiculos = FuncaoNaoSei.dadosVeiculos(qtdVeiculos);
        
        do{
            System.out.println("------------------------------------------------");
            System.out.println("1 - Faturamento do Dia");
            System.out.println("2 - Horas de permanencia por Faixa de Cobranca");
            System.out.println("3 - Relacao de pagamento por veiculo");
            System.out.println("4 - Sair");
            System.out.println("------------------------------------------------");
            System.out.print("Informe uma opcao: ");
            int opcao = leitor.nextInt();
            
            switch(opcao){
                case 1://faturamento
                    double fatura = FuncaoNaoSei.faturamentoDia(veiculos);
                    System.out.printf("Faturamento do dia R$ %.2f \n", fatura);
                break;
                //-------------------------------------------
                case 2://relatorio por faixa
                    FuncaoNaoSei.impressaoFaixa(veiculos);
                break;
                //-------------------------------------------
                case 3://relacao de pagamento dos veiculos
                    FuncaoNaoSei.impressaoVeiculo(veiculos);
                break;
                //-------------------------------------------
                case 4: //opcao sair do sistema (encerrar operacao)
                    System.out.println("Encerrando...");
                    terminar = true;
                break;
                //------------------------------------------
                default:
                    System.out.println("Opcao Invalida!!!");
            }
        }
        while(terminar == false);
    }
}
