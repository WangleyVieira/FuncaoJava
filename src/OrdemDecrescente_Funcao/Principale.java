/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OrdemDecrescente_Funcao;

import java.util.Scanner;

/**
 *
 * @author Msv Wangley
 */
public class Principale {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Informe o tamanho do vetor: ");
        int tamanhoVetor = leitor.nextInt();
        int[] vetorPrincipal = ExecucoesVetores.gerarVetor(tamanhoVetor);
        System.out.println("Imprimindo vetor do tamanho "+tamanhoVetor);
        ExecucoesVetores.impressao(vetorPrincipal);
    }
}
