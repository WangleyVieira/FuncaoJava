/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcao;

public class Funcao {


    //funcao soma
    public static int soma (int a, int b){ //funcao retorna um valor inteiro
        int s = a + b;
        System.out.println("A soma e "+ s);
        return s; //retorna o valor inteiro de s
    }
    //fim funcao soma
    
    public static void main(String[] args) { //main (principal) eh uma metodo que nao retorna um valor que recebe um valor como parametro 
        System.out.println("Comecou o programa");
        soma(5,2);//ira chamar a funcao soma
    }
    
}
