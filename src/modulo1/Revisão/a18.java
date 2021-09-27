package modulo1.Revisão;

import java.util.Scanner;

//import jdk.internal.platform.Container;

public class a18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte opcao;
        char continua = 'N';
      do{
        System.out.println("Digite uma opção"); 
        opcao = Byte.parseByte(sc.nextLine());
        switch(opcao){
            case 1:
                System.out.println("Digitado 1");
            break;

            case 2:
                System.out.println("Digitado 2");
            break;

            case 3:
                System.out.println("Digitado 3");
            break;

            default:
                System.out.println("O número digitado não é válido");
            break;
            }
            if(opcao > 0 && opcao < 4){
            System.out.println("Deseja voltar ao menu principal? (s== SIM): ");
            }
        }while (opcao < 1 || opcao > 3 || continua == 'S');

        sc.close();
    }
}
