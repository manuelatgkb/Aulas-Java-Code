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

    static boolean retornaMenu(){
        boolean resposta = false;
        char resposta_continua;

        do{
            System.out.println("Deseja voltar ao menu? (S/N)");
            resposta_continua = sc.nextLine().toUpperCase().charAt(0);

            if(resposta_continua == 'S'){
                resposta = true;
            }
            else if(resposta_continua == 'N'){
                System.out.println("Até mais !!!");
            }
            else{
                System.out.println("Opção invalida! Digite (S/N)!");
            }
        }while(resposta_continua != 'S' && resposta_continua != 'N');

        return resposta;
    }

    static void opcoesMenu(int opcao){
        switch(opcao){
            case 1 :
                System.out.println("=========Calcula ISS========");
                double taxasISS = ISS();
                taxasISS += taxasISS();
                System.out.printf("O valor da taxa de ISS foi %.4f \n", taxasISS);
            break;

            case 2 :
                System.out.println("=========Calcula IOF========");
                double taxasIOF = IOF();
                taxasISS += taxasIOF();
                System.out.printf("O valor da taxa de IOF foi %.4f \n", taxasIOF);
            break;

            case 3: 
                System.out.println("=========Calcula IR========");
                double taxasIR = IR();
                taxasISS += taxasIR();
                System.out.printf("O valor do IR foi %.4f \n", taxasIR);
            break;
        
        }
    }

    static int menu(){
        int opcao; 
        do{
        System.out.println("\n ========Calculadora de Impostos========\n");
        System.out.println(" t1 - ISS \n t2 - IOF \n t3 - IR");
        System.out.println("==================");
        System.out.println("Escolha uma opção do menu: ");
        opcao = Integer.parseInt(sc.nextLine());
        if(opcao <1 || opcao >3){
        System.out.println("Opção inválida. Digite Novamente. \n");
        }
        }while(opcao <1 || opcao > 3);
        return opcao;
    }

    static double ISS(){
    }

    static double IOF(){

    }
    static double IR(){

    }
}
