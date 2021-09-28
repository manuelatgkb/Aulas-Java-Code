
/*
Faça um procedimento que recebe as 3 notas de um aluno por parâmetro e uma letra. 
Se a letra for ‘A’, o procedimento calcula e escreve a média aritmética das notas do aluno, 
se for ‘P’, calcula e escreve a sua média ponderada (pesos: 5, 3 e 2). 
Faça um programa que leia 3 notas de N alunos e acione o procedimento para cada aluno. 
(N deve ser lido do teclado)
*/
package modulo1.Revisão;

import java.util.Scanner;

import org.w3c.dom.Notation;

import java.util.Locale;

public class r1letraNotaPonderada {
    int opcao = 0; 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota = Double.parseDouble(sc.nextLine());
    }

    public static int media_nota(){

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

    static double valida_nota (String Mensagem){
        boolean valida = true;
        double valida = 0;
        do{
            System.out.println(Mensagem);
            nota = Double.parseDouble(sc.nextLine());
            valida = validarNota(nota);
        }while(!=valida);
        return nota;
    }

    switch(opcao){
        case 1: 


        case 2: // média ponderada
        Double nota4 = nota("Informe a primeira nota do aluno" + "i" + : "");
        Double nota5 = 0;
        Double nota6 =0;
        notas4_6(nota4, nota5, nota6); // criar metodo mediaPond
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
