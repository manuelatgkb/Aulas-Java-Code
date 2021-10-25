package modulo4.ATP30;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static Calculadora c = new Calculadora();
    public static void main(String[] args) {
    int op = 0; 
    do{
        try{
            System.out.println("Digite o primeiro número");
            int num1 = Integer.parseInt(sc.nextLine());
            System.out.println("Digite o segundo número");
            int num2 = Integer.parseInt(sc.nextLine());
            System.out.println("Escolha uma opção: \n1 somar, \n2 multiplicar, \n3 subtrair, \n4 dividir, \n5 sair");
            op = Integer.parseInt(sc.nextLine());
        
            imprimeMenu(op, num1, num2);
        }catch(Exception e){
            System.out.println("Deu ruim! Undêrere!!!!");
        }
    }while(op != 6);

    }
        
        public static void imprimeMenu(int op, int num1, int num2){ 
            switch (op) {
                case 1:
                    System.out.println("A soma é:  " + c.somar(num1, num2));
                    break;
                case 2:
                System.out.println("A multiplicação é : "+c.multiplicar(num1, num2));

                    break;
                case 3:
                System.out.println("A subtração é : "+c.subtrair(num1, num2));

                    break;
                case 4:
                System.out.println("A divisão é: "+ c.dividir(num1, num2));

                    break;

                case 5:
                System.out.println("Sair");

                    break;
            
                default:
                System.out.println("Opção inválida. Digite outro um número de 1 a 5.");

                    break;
            }
            }
        
    }

