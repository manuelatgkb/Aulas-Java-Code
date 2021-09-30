package modulo1.atividadesPraticas;

import java.util.Scanner;

public class atp14metodoSomarDividirSubtrairMultiplicar {
    public static void main(String[] args) {
        cabecalho();
        menu();
        int opcao = leropcao("\n Escolha uma opção: ");
        double n1 = ler("\n Digite o primeiro número: ");
        double n2 = ler("\n Digite o segundo número: ");
        escolhe_menu(opcao, n1, n2);
    }
    // Construa um método que imprima uma mensagem para ser usada como cabeçalho da aplicação. 
    //A mensagem deve exibir a mensagem “Calculadora”.
    static void cabecalho(){
        System.out.println("============Calculadora===========");
    }
// menu
    static void menu(){
        System.out.println("\t1 somar");
        System.out.println("\t2 subtrair");
        System.out.println("\t3 multiplicar ");
        System.out.println("\t4 dividir");
    }

    //validar 
    static boolean validaopcao(int opcao){
        if(opcao > 4 || opcao < 1){
            System.out.println("\n Opção Inválida ");
            return false;
        }else{ 
        return true;}
    }
//metodo de scanner 
    static double ler(String mensagem){
        Scanner scan = new Scanner(System.in);
        System.out.print(mensagem);
        double numero = Double.parseDouble(scan.nextLine());
        return numero;
        // scan.close();
    }

    static int leropcao(String mensagem){
        int opcao;
        Scanner scan = new Scanner(System.in);
        do{System.out.print(mensagem);
            opcao = Integer.parseInt(scan.nextLine());
        }while(!validaopcao(opcao));
        return opcao;
        // scan.close();
    }

//menu com opcoes somar, subtrair, dividir e multiplicar
    static void escolhe_menu(int opcao, double n1, double n2){
        switch(opcao){

            case 1: //somar
                double soma = somar(n1, n2);
                System.out.printf("A soma é %.2f: ", soma);
            break;

            case 2: //subtrair
                double sub = subtrair(n1, n2);
                System.out.printf("A subtração é: %.2f", sub);
            break;


            case 3: // multiplicar
                double mul = multiplicar(n1,  n2);
                System.out.printf("A multiplicação é: %.2f", mul);
            break; 


            case 4 : //dividir
                double div = dividir(n1, n2);
                System.out.printf("A divisão é: %.2f", div);
            break;
    
        }
    }
//metodos somar, subtrair, dividir e multiplica
    static double somar(double n1, double n2){
       double soma = n1 + n2;
       return soma;
    }
    static double subtrair(double n3, double n4){
        double sub = n3 - n4;
        return sub;
     }
     static double multiplicar(double n5, double n6){
        double mul = n5 * n6;
        return mul;
     }
     static double dividir(double n7, double n8){
        double div = n7 / n8;
        return div;
     }
     //imprimir o resultado
     /*static void imprimir(double resultado){
         System.out.prdoublef("O resultado é %.2f: ", resultado);
     }*/
}

