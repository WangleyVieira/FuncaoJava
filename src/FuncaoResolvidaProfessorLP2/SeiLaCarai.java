/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FuncaoResolvidaProfessorLP2;

import java.util.Scanner;

/**
 *
 * @author Msv Wangley
 */
public class SeiLaCarai {
    public static int[] obterDadosEstacionamento(
            int qtdeVeiculos) {
        int[] dados = new int[qtdeVeiculos];
        for(int i=0;i<qtdeVeiculos;i++) {
            dados[i] = (int) (Math.random()*10) + 1;
        }
        return dados;
    }
    
    public static double calculaValor(int horas) {
        double valorHora = 0;
        if (horas<=2) {
            valorHora = 5;
        } else {
            if (horas<=5) {
                valorHora = 3.5;
            } else {
                valorHora = 3;
            }
        }
        return (double) horas * valorHora;
    }
    
    public static double obterFaturamento(int[] dados) {
        double fatura = 0;
        for(int i=0;i<dados.length;i++) {
            double valor = calculaValor(dados[i]);
            fatura += valor;
        }
        return fatura;
    }
    
    public static int obterHoras(int[] dados, int faixa) {
        int horas = 0;
        for(int i=0;i<dados.length;i++) {
            if (faixa==1 && dados[i]<=2) {
                horas += dados[i];
            }
            if (faixa==2 && dados[i]>=3 && dados[i]<=5) {
                horas += dados[i];
            }
            if (faixa==3 && dados[i]>5) {
                horas += dados[i];
            }
        }
        return horas;
    }
    
    public static void impressaoFaixa(int[] dados) {
        System.out.println("Faixa     Qtde Horas");
        for(int i=1;i<=3;i++) {
            int horas = obterHoras(dados, i);
            System.out.printf("%d   -    %d\n", i, horas);
        }
    }
    
    public static void impressaoVeiculos(int[] dados) {
        double total = 0;
        System.out.println("Veiculo      Hora    ValorPago");
        for(int i=0;i<dados.length;i++) {
            double valor = calculaValor(dados[i]);
            total += valor;
            System.out.printf("Veiculo%d    %d      %8.2f\n", 
                    i, dados[i], valor);
        }
        System.out.printf("Total: R$ %.2f\n", total);
    }
    
    public static void main(String[] args) {
        int opcao = 0;
        Scanner leitor = new Scanner(System.in);
        int qtde;
        System.out.println("Informe a qtde de veÃ­culos: ");
        qtde = leitor.nextInt();
        int[] veiculos = obterDadosEstacionamento(qtde);
        
        while (opcao != 4) {
            System.out.println("1-Faturamento Dia");
            System.out.println("2-Horas Faturamento por Faixa Cobranca");
            System.out.println("3-RelaÃ§Ã£o Pagamento por Veiculo");
            System.out.println("4-Sair");
            System.out.print("Digite opÃ§Ã£o: ");
            opcao = leitor.nextInt();
            switch(opcao) {
                case 1: // faturamento
                    double fatura = obterFaturamento(veiculos);
                    System.out.printf("Faturamento: R$ %.2f\n", 
                            fatura);
                    break;
                    
                case 2: // relatorio por faixa
                    impressaoFaixa(veiculos);
                    break;
                    
                case 3:// relatorio por veiculos
                    impressaoVeiculos(veiculos);
                    break;
                    
                case 4:
                    System.out.println("Encerrando ...");
                    break;
                default: 
                    System.out.println("OpÃ§Ã£o invÃ¡lida, tente novamente");
            }
        }
    }
}
