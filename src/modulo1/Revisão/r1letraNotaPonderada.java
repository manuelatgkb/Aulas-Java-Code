
/*
Faça um procedimento que recebe as 3 notas de um aluno por parâmetro e uma letra. 
Se a letra for ‘A’, o procedimento calcula e escreve a média aritmética das notas do aluno, 
se for ‘P’, calcula e escreve a sua média ponderada (pesos: 5, 3 e 2). 
Faça um programa que leia 3 notas de N alunos e acione o procedimento para cada aluno. 
(N deve ser lido do teclado)
*/
package modulo1.Revisão;

import java.util.Scanner;

public class r1letraNotaPonderada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota = Double.parseDouble(sc.nextLine());
    }

    static int qtAlunos(){
        System.out.println("Informe a quantidade de alunos: ");
        int qtAlunos = Integer.parseInt(sc.nextLine());
        return qtAlunos;

    switch(opcao){
        case A:
        nota = "nota1", "nota2", "nota3";
            System.out.println("Informe a nota");
            System.out.printf("nota 1");
            System.out.printf("nota 2");
            System.out.printf("nota 3");
            System.out.printf((nota1+nota2+nota3)/3);


            break;

        case P:
            System.out.println("Igual a 2");;
            break;

        case Sair:
            System.out.println("Igual a 2");;
            break;
        }
            
        sc.close();

    }
}
