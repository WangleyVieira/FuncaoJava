/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TesteFuncaoRevisao;

import java.util.Scanner;

/**
 *
 * @author Msv Wangley
 */
public class NovoPrincipal {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Informe um numero inteiro: ");
        int numero1 = leitor.nextInt();
        System.out.print("Informe outro numero inteiro: ");
        int numero2 = leitor.nextInt();
        
        int resultado1 = NaoSeiCara.Soma(numero1, numero2);
        System.out.println("O resultado da soma eh: " + resultado1);
        int resultado2 = NaoSeiCara.subtracao(numero1, numero2);
        System.out.println("O resultado da subtracao eh: " + resultado2);
            
    }
}
