/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.pkg01;

/**
 *
 * @author aluno
 */
public class Projeto01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Comentarios simples
        /*
        Comentarios em mais de uma linha
        */
        
        //Definir uma variavel em java(TIPO NOME;)
        int idade; //Declara
        idade = 30;
        int novaIdade = 35;
        idade = idade + 10;
        int divisao= 11/2;
        int modulo = 11 % 2;
        
        System.out.println("idade: " + idade);
        // sout + tab
        System.out.println("Tecla de atalho");
        // double e float
        double pi = 3.14;
        int x = 20;
        x = x/3;
        System.out.println("Valor de x: " + x);
        boolean menorIdade = idade < 18; // retorna true ou false
        System.out.println("Mnor Idade: " + menorIdade);
        
        char letraA= 'a';
        System.out.println("Letra A ");
        
    }
    
}
