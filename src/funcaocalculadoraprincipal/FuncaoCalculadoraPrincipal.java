/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcaocalculadoraprincipal;

import java.util.Scanner;

/**
 *
 * @author Msv Wangley
 */
public class FuncaoCalculadoraPrincipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        boolean terminar = false;
        do{
            System.out.println("C A L C U L A D O R A ");
            double n1, n2;
            System.out.print("Informe um valor: ");
            n1 = leitor.nextDouble();
            System.out.print("Outro valor: ");
            n2 = leitor.nextDouble();

            System.out.println("-------------------------");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtracao");
            System.out.println("3 - Multiplicacao");
            System.out.println("4 - Divisao");
            System.out.println("-------------------------");
            System.out.print("Informe a opcao: ");
            int opcao = leitor.nextInt();

            switch(opcao){
                case 1://soma
                    System.out.println("O resultado da soma: "+Funcao.soma(n1, n2));
                    break;

                case 2://subtracao
                    System.out.println("O resultado da subtracao: "+Funcao.subtracao(n1, n2));
                    break;

                case 3://multiplicacao
                    System.out.println("O resultado da multiplicacao: "+Funcao.multiplicacao(n1, n2));
                    break;

                case 4://divisao
                    System.out.printf("O resultado da divisao: %.2f\n", Funcao.divisao(n1, n2));
                    break;

                default:
                    System.out.println("Opcao invalida!");
                    break;
            }
            
            System.out.println("Continuar...? (sim/nao)");
            String cont = leitor.next();
            if(cont.equals("nao")){
                terminar = true;
            }
        }
        while(!terminar);
    }
    
}
