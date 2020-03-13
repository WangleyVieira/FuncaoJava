/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcao02;

import java.util.Scanner;


public class FuncaoPrincipal {

    public static void main(String[] args) {
       Scanner leitor = new Scanner(System.in);
        
        System.out.println("Vai comecar o programa!!!");
        System.out.print("Informe um numero: ");
        int numero1 = leitor.nextInt();
        System.out.print("Informe o segundo numero: ");
        int numero2 = leitor.nextInt();
        FuncaoSoma.soma(numero1, numero2);//ira chamar a FuncaoSoma da soma
        System.out.println("**************************************");
        System.out.println("\tRealizando outra operacao");
        System.out.println("**************************************");
        System.out.println("Informe um numero para Multiplicar: ");
        int numero3 = leitor.nextInt();
        System.out.println("Informe outro numero para Multiplicar");
        int numero4 = leitor.nextInt();
        FuncaoSoma.multiplicacao(numero3, numero4);//ira chamar a FuncaoSoma da multiplicacao
        
    }
}

