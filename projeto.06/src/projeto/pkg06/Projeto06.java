/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.pkg06;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Projeto06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Classe SCANNER deve ser importada de
        //dentro do pacote java.util.Scanner
        //DEfinir um objeto 'entrada' da classe Scanner
        //usando a palavra reservada NEW
        //que e responsavel pela instanciacao de objetos
        //de uma classe JAVA
        String nome = "Anderson";
        Scanner entrada = new Scanner(System.in);
        
        //criar um programa que receba ENTRADA de 
        //2 (dois) valor (num1 e num2) e verifique
        //qual o maior e o menor numero entre os dois
        
        int num1, num2;
        System.out.println("Digite o primeiro numero:");
        num1 = entrada.nextInt();
        System.out.println("Digite o segundo numero:");
        num2 = entrada.nextInt();
//valor atribuidos a num1 e num2
        System.out.println("Valor NUM1: " + num1);
        System.out.println("Valor NUM2: " + num2);
        if (num1 > num2)
        {
            System.out.println("Maior numero e: " + num1);
            System.out.println("Menor numero e: " + num2);
        }
        else 
        {
            System.out.println("Maior numero e: " + num2);
            System.out.println("Menor numero e: " + num1);

        }
        }
    
}
