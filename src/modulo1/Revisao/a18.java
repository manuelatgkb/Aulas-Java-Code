package modulo1.Revisao;

import java.util.Scanner;

public class a18 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        

        produto();
        categoria();
        fornecedores();
        naoprevista();

    }

    static void produto(){
        
    }

    static void categoria(){
        
    }

    static void fornecedores(){
        
    }

    static void naoprevista(){

        byte opcao;
        char continua = 'N';

        do{
            System.out.println("\n\n============== Bradesco Financiamentos ==================");
            System.out.println("\t1-Cadastro Produtos");
            System.out.println("\t2-Categoria");
            System.out.println("\t3- Fornecedores");
            System.out.print("Digite uma opção: ");
            opcao = Byte.parseByte(sc.nextLine()); 

                switch(opcao){
                case 1:
                    produto();
                break;

                case 2:
                    categoria();
                break;

                case 3:
                    fornecedores();
                break;

                case 4:
                    naoprevista();
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
