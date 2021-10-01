package modulo2.AtividadesIndividuais.ResolucaodaAtividade16;

import java.util.Scanner;

public class AtividadeBanco2 {
    static Scanner sc = new Scanner(System.in);
    static CalculadoraTaxas2 calcTaxas = new CalculadoraTaxas2();
    static double taxaTransferencia = 0;
    static double taxasSaque = 0;

    public static void main(String[] args) {
        boolean continua = false;
        do{
            int op = menu();
            opcoesMenu(op);
            continua = retornaMenu();
        }while(continua);
        System.out.printf("\n O valor de todas as taxas cobradas foi de %.4f, \n sendo %.4f de transferencia  e %.4 de transferencia de saques", taxaTransferencia, taxasSaque);
        System.out.println();
    }
   
    static boolean retornaMenu(){
        boolean resposta = false;
        char resposta_continua;

        do{
            System.out.println("Deseja voltar ao menu principal? (S/N)");
            resposta_continua = sc.nextLine().toUpperCase().charAt(0);

            if(resposta_continua == 'S'){
                resposta = true;
            }
            else if(resposta_continua == 'N'){
                System.out.println("Até mais!!!");
            }
            else{
                System.out.println(" Opção inválida. Digite (S/N)! \n");

            }
        }while(resposta_continua != 'S' && resposta_continua != 'N');

        return resposta;
    }

    static void opcoesMenu(int opcao){
        switch(opcao){
            case 1: 
                System.out.println("+++++++Transferências++++++");
                double taxaT = transferencia();
                taxaTransferencia +=taxaT;
                System.out.printf("O valor da taxa de transferência é:  %2f \n", taxaT);

            break;
            case 2: 
                System.out.println("++++++++Saques++++++++");
                double taxaS = saque();
                taxasSaque += taxaS;
                System.out.printf("\n O valor de taxa de Saque foi de %.2f, \n\n", taxaS);
            break;
        }
    }

    static int menu(){
        int opcao;
        do{
            System.out.println("===============Calculadora de Taxas==================\n");
            System.out.println("\t1-Taxa Transferência \n\t2 - Taxa Saque \n");
            System.out.println("===============+++++++++++++++++++++==================\n");
            System.out.print("Escolha uma opção do menu: ");
            opcao = Integer.parseInt(sc.nextLine());
            if(opcao < 1 || opcao > 2){
                System.out.println("Opção Invalida. Digite Novamente");
            }
        }while(opcao <1 || opcao >2);
            return opcao;
    }

    static double transferencia(){
        System.out.print("Digite o valor a ser transferido: ");
        double valor = Double.parseDouble(sc.nextLine());
        double taxaT1 = calcTaxas.CalculadoraTaxaTransferencia(valor);
        return taxaT1;
    }

    static double saque(){
        System.out.print("Digite o valor a ser sacado: ");
        double valor = Double.parseDouble(sc.nextLine());
        double taxaS1 = calcTaxas.calculaTaxaSaque(50);
        return taxaS1;
    }
}