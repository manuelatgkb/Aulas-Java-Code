package modulo1.Revisão;

import java.util.Scanner;

public class aTP11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte opcao;
        char continua = 'N';

        do{
            System.out.println("\n\n============== Bradesco Financiamentos ==================");
            System.out.println("\t1-Crédito Pessoal");
            System.out.println("\t2-Crédito Imobiliário");
            System.out.println("\t3-Crédito Empresarial");
            System.out.println("\t4-Empréstimo Consignado");
            System.out.print("Digite uma opção: ");
            opcao = Byte.parseByte(sc.nextLine()); 

                switch(opcao){
                case 1:
                    System.out.println("Crédito Pessoal");
                break;

                case 2:
                    System.out.println("Crédito Imobiliário");
                break;

                case 3:
                    System.out.println("Crédito Empresarial");
                break;

                case 4:
                    System.out.println("Empréstimo Consignado");
                break;

                default:
                    System.out.println("A opção digitada é inválido");
                break;

            }

            if(opcao > 0 && opcao < 5){
                do{
                    System.out.print("Para voltar digite V e para sair digite S: ");
                    continua = sc.nextLine().toUpperCase().charAt(0);
                }while(continua != 'V' && continua !='S');
            }

        }while (opcao < 1 || opcao > 3 || continua == 'V');

        sc.close();
    }
}

