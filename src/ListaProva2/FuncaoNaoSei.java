
package ListaProva2;


public class FuncaoNaoSei {
    /* -- Questao 1
     * Crie uma funcao que receba como parametro a quantidade de veiculos que utilizaram o
     * estacionamento em um determinado dia e retorne a quantidade de horas de permanencia de 
     * cada veiculo (retorne um vetor de inteiros). Obs. : gere os valores para a quantidade
     * de horas de permanencia randomicamente (observe que um veiculo permanece no maximo por 
     * ate 10 horas em um dia)
    */
    public static int[] dadosVeiculos(int qtdVeiculos){
        int[] dados = new int[qtdVeiculos];
        for (int i = 0; i < dados.length; i++) {
            dados[i] = (int) (Math.random() * 10) + 1;
        }
        return dados;
    }
    
    
    /* --  Questao 2
     * Crie uma funcao que receba como parametro a quantidade de horas permanecidas
     * no estacionamento por um veiculo e retorne o valor a ser pago pela permanencia 
     * (referenciar tabela de calculo do estacionamento)
    */
    public static double calculoHorasPermanecidas(int qtdHoras){
        double valorHora = 0;
        if(qtdHoras <= 2){
            valorHora = 5;
        }
        else{
            if(qtdHoras <= 5){
                valorHora = 3.50;
            }
            else{
                valorHora = 3;
            }
        }
        return (double) qtdHoras * valorHora;//retorna o calculo pelo hora permanencia
    }
    
    /* -- Questao 3
     * Crie uma funcao que retorne o faturamento do dia (referenciar tabela de calculo 
     * do estacionamento)
    */
    
    public static double faturamentoDia(int[] dados){
        double fatura = 0;
        for (int i = 0; i < dados.length; i++) {
            double valor = calculoHorasPermanecidas(dados[i]);
            fatura += valor;
        }
        return fatura;
    }
    
    /* -- Questao 4
     * Crie uma funcao que retorne como parametro a faixa de cobranca e retorne a 
     * quantidade de horas utilizadas nessa faixa (referenciar tabela de calculo 
     * do estacionamento).
    */
    
    public static int obterHoras (int[] dados, int faixa){
        int horas = 0;
        for (int i = 0; i < dados.length; i++) {
            if(faixa == 1 && dados[i] <= 2){
                horas += dados[i];
            }
            if(faixa == 2 && dados[i] >= 3 && dados[i] <= 5){
                horas += dados[i];
            }
            if(faixa == 3 && dados[i] > 5){
                horas += dados[i];
            }
        }
        return horas;
    }
    
    /* -- Questao 5
     * Crie uma funcao que construa a seguinte tabela de exemplo, mas baseada nos dados
     * lidos anteriormente e utilizando a funcao do exercicio 4
    */
    
    public static void impressaoFaixa(int[] dados){
        System.out.println("Faixa   | Quantidade de Horas");
        for (int i = 1; i <= 3; i++) {
            int horas = obterHoras(dados, i);
            System.out.printf("%d   -   %d\n", i, horas);
        }
    }
    /* -- Questao 6
     * Impressao dos veiculos e o valor a ser pago
    */
    public static void impressaoVeiculo(int[] dados){
        double total = 0;
        System.out.println("Valor         Hora         Valor pago");
        for (int i = 0; i < dados.length; i++) {
            double valor = calculoHorasPermanecidas(dados[i]);
            total += valor;
            System.out.printf("veiculo %d      %d      %8.2f\n",(i+1), dados[i], valor);
        }
        System.out.printf("Total R$ = %.2f\n", total);
    }
}
