package modulo3.AtividadePratica17;

import java.util.Scanner;      

public class CalculoImpostosMain {
    static Scanner sc = new Scanner(System.in);
    static CalculoImpostos calcTaxas = new CalculoImpostos();
    static double taxasISS = 0;
    static double taxasIOF = 0;
    static double taxasIR = 0;

    public static void main(String[] args) {
       boolean continua;
       do{
            int opcao = menu();
            opcoesMenu(opcao);
            continua = retornaMenu();

       }while(continua);
       System.out.printf("O valor de todas as taxas foi de %.3f \n", 
       taxasISS, taxasIOF, taxasIR);
       System.out.println();

    }

    static void menu(){
        System.out.println("\n ========Calculadora de Impostos========\n");
        System.out.println(" t1 - ISS \n t2 - IOF \n t3 - IR");
        System.out.println("==================");
        System.out.println("Escolha uma opção do menu: ");
        int opcao = Integer.parseInt(sc.nextLine());
        System.out.println();
    }

    static void feito(){
        CalculoImpostos calcImpostos = new CalculoImpostos();

        double CalculoISS = calcImpostos.CalculoISS(valor);
        double CalculoIOF = calcImpostos.CalculoIOF(valor);
        double CalculoIR = calcImpostos.CalculoIR(valor);

        System.out.printf("Os valores dos impostos são %.2f, %.2f e %.2f \n", CalculoISS, CalculoIOF, CalculoIR );

    }
}
