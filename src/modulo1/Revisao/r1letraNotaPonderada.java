
/*
Faça um procedimento que recebe as 3 notas de um aluno por parâmetro e uma letra. 
Se a letra for ‘A’, o procedimento calcula e escreve a média aritmética das notas do aluno, 
se for ‘P’, calcula e escreve a sua média ponderada (pesos: 5, 3 e 2). 
Faça um programa que leia 3 notas de N alunos e acione o procedimento para cada aluno. 
(N deve ser lido do teclado)
*/
package modulo1.Revisao;

import java.util.Scanner;

import javax.print.attribute.standard.QueuedJobCount;

import jdk.dynalink.beans.StaticClass;

import java.util.Locale;

public class r1letraNotaPonderada {
    int opcao = 0; 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota = Double.parseDouble(sc.nextLine());
        boolean opcao = (media_nota, media_pond);
        cabecalho();
        int case1 =  media_nota(1, 3, 5);
        int case2 = media_pond(1, 2, 3);
        valida_nota(nota);
        pedeNota("Digite a nota %f : ");
        qtAlunos();

    }

    public static void cabecalho(){
        System.out.println("____________NOTAS___________");
    }


    public static int media_nota(int n1, int n2, int n3){
        int media_nota = (n1 + n2 +n3) /3;
        return media_nota;
    }

    public static int media_pond(int n1, int n2, int n3){
        int media_pond = ((n1*5) + (n2*3) +(n3*2)) /3;
        return media_pond;
    }

    static boolean valida_nota(double nota){
        if(nota > 10 || nota < 0){
            System.out.print("Nota invalida. Insira uma nota válida");
            return false;
        }else{
            return true;
        }
    }
    static double pedeNota(String mensagem){
        double nota;
        System.out.printf(mensagem);
        do{
            nota = Double.parseDouble(sc.nextLine());
        }while(!valida_nota(nota));
            return nota;
    }

    static int qtAlunos(){
        System.out.println("Informe a quantidade de alunos: ");
        int qtAlunos = Integer.parseInt(sc.nextLine());
        return qtAlunos;
        
    }

    switch(opcao){
        case 1: // media aritimética
            case1();

        case 2: // media ponderada
            case2();
        }
            
    sc.close();

    }
}
