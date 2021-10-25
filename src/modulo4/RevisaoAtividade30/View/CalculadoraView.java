package modulo4.RevisaoAtividade30.View;

import java.util.Scanner;

import modulo4.RevisaoAtividade30.Controller.CalculadoraController;
import modulo4.RevisaoAtividade30.Model.Calculadora;


public class CalculadoraView {

    public static void main(String[] args) {
        imprimeMenu();
        int opcao = 0;
        lerNumero();

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
        int numero = 0;
        boolean valido;
        do{
            try{
                numero = Integer.parseInt(sc.nextLine());
                valido = true;
            }catch(Exception e){
                System.out.println("Valor inválido.\n O valor deve ser um número inteiro.");
                System.out.println("Digite novamente!");
                valido = false;
            }
        }while(!valido);
        return numero;
    }
    private static void opcoesMenu(){
        int opcao = lerNumero();
        CalculadoraView calc = new CalculadoraView();
        CalculadoraController calcController = new CalculadoraController();
        int resultado = 0;

        System.out.println("Digite um número 1: ");;
        calc.numero1 = lerNumero();

        boolean valido = true;
        do{
        System.out.println("Digite o número 2 : ");
        calc.numero2 = lerNumero();
        if(opcao == 4)///divisao
        {
                try{
                    validaZeroDivisao(calc.numero2);
                    valido = true;
                }catch(IllegalArgumentException e){
                    System.out.println(e.getMessage() + "Digite novamente");
                    valido = false;
                }
            }
        }while(!valido);

        switch (opcao) {
            case 1:
                resultado = calcController.soma(calc);
            
                break;
            case 2:
                resultado = calcController.subtracao(calc);

                break;
            case 3:
            resultado = calcController.multiplicacao(calc);

                break;
            case 4:
            resultado = calcController.divisao(calc);

                break;
        }
        System.out.printf("O resultado da operação é %d", resultado);

    }
    private static void validaZeroDivisao(int numero){
        if(numero == 0){
            throw new IllegalArgumentException("O divisor não pode ser zero!");
        }
    }
}
