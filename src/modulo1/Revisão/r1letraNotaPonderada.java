
/*
Faça um procedimento que recebe as 3 notas de um aluno por parâmetro e uma letra. 
Se a letra for ‘A’, o procedimento calcula e escreve a média aritmética das notas do aluno, 
se for ‘P’, calcula e escreve a sua média ponderada (pesos: 5, 3 e 2). 
Faça um programa que leia 3 notas de N alunos e acione o procedimento para cada aluno. 
(N deve ser lido do teclado)
*/
package modulo1.Revisão;

import java.util.Scanner;

import javax.swing.table.DefaultTableCellRenderer;

public class r1letraNotaPonderada {
    int opcao = 0; 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota = Double.parseDouble(sc.nextLine());
    }

    static int qtAlunos(){
        System.out.println("Informe a quantidade de alunos: ");
        int qtAlunos = Integer.parseInt(sc.nextLine());
        return qtAlunos;

    switch(opcao){
        case 1: //media aritimética
        int nota1 = 0;
        int nota2 = 0;
        int nota3 = 0;
        int media = 0;
            System.out.println("Informe a nota");
            System.out.printf("nota 1");
            System.out.printf("nota 2");
            System.out.printf("nota 3");
            media =((nota1 + nota2+nota3)/3);
            System.out.print(media);
            break;

        case 2: // média ponderada
        int nota4 = 0;
        int nota5 = 0;
        int nota6 =0;
        int mediaPond = 0;
        System.out.println("Informe a nota");
        System.out.printf("nota 4");
        System.out.printf("nota 5");
        System.out.printf("nota 6");
        System.out.print(((nota4*5)+(nota5*3)+(nota6*2))/3); 
        return mediaPond;
        break;

        default:
            System.out.println("Sair");;
            break;
        }
            
    sc.close();

    }
}
