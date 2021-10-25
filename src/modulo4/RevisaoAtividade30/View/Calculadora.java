package modulo4.RevisaoAtividade30.View;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        imprimeMenu();
        

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
    private static int lerNumero(){
        Scanner sc = new Scanner(System.in);
        int opcao = 0;
        boolean valido;
        do{
            try{
                opcao = Integer.parseInt(sc.nextLine());
                valido = true;
            }catch(Exception e){
                System.out.println("Valor inválido.\n O valor deve ser um número inteiro.");
                System.out.println("Digite novamente!");
                valido = false;
            }
        }while(!valido);

        return opcao;
    }
}
