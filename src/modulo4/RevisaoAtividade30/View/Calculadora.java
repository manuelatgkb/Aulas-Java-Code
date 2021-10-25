package modulo4.RevisaoAtividade30.View;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        imprimeMenu();
        try{
            int opcao = Integer.parseInt(sc.nextLine());
        }catch(Exception e){
            System.out.println("Valor inválido.\n O valor deve ser um número inteiro.");
        }

    }
    private static void imprimeMenu(){
        System.out.println("+++++++Cabeçalho+++++++");
        System.out.println("Menu: ");
        System.out.println("1-Soma");
        System.out.println("2-Subtrair");
        System.out.println("3-multiplicar");
        System.out.println("4-dividir");
        System.out.println("5-Sair");
        System.out.println("Digite uma opção do menu: ");
    }
}
