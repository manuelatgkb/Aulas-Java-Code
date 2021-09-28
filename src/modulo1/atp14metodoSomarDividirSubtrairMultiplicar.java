package modulo1;

import java.util.Scanner;

public class atp14metodoSomarDividirSubtrairMultiplicar {
    public static void main(String[] args) {
        cabecalho();
        escolhe_menu(opcao);
        ler("\n Digite um número");
        imprima();
    }
    // Construa um método que imprima uma mensagem para ser usada como cabeçalho da aplicação. 
    //A mensagem deve exibir a mensagem “Calculadora”.
    static void cabecalho(){
        System.out.println("============Calculadora===========");
    }
//metodo de sacnner 
    static int ler(String mensagem){
        Scanner scan = new Scanner(System.in);
        System.out.println(mensagem);
    }
//menu com opcoes somar, subtrair, dividir e multiplicar
    static int escolhe_menu(){
        switch(opcao){

            case 1: //somar
                int n1 = ler("\n Digite o n1: ");
                int n2 = ler("\n Digite o n2: ");
                int soma = somar(n1, n2);
                System.out.printf("A soma é de %d: ", soma);
            break;

            case 2: //subtrair
                int n3 = ler("\n Digite o n3: ");
                int n4 = ler("\n Digite o n4");
                int sub = subtrair(n3, n4);
                System.out.printf("A subtração é: %d");
            break;


            case 3: // multiplicar
                int n5 = ler("\n Digite o n3: ");
                int n6 = ler("\n Digite o n4");
                int mul = multiplicaçao(n5,  n6);
                System.out.printf("A multiplicação é: %d");
            break; 


            case 4 : //dividir
                int n7 = ler("\n Digite o n7: ");
                int n8 = ler("\n Digite o n8");
                int div = dividir(n7, n8);
                System.out.printf("A divisão é: %d");
            break;
    
        }
    }
//metodos somar, subtrair, dividir e multiplica
    static int somar(int n1, int n2){
       int soma = n1 + n2;
       return soma;
    }
    static int sub(int n3, int n4){
        int sub = n3 - n4;
        return sub;
     }
     static int mul(int n5, int n6){
        int mul = n5 * n6;
        return mul;
     }
     static int div(int n7, int n8){
        int div = n7 / n8;
        return div;
     }

     //imprimir o resultado
     static double imprima(){
         System.out.println("O resultado é %d: ");
     }

    
}

