/*package modulo1.dojo;

import java.util.Scanner;

public class dojo210928 {
    public static void main(String[] args) {
        menu();
       int opcao =  ler("Digite uma opção do menu");
       escolhe_menu(opcao);
       //String en = entrada("\n Esta é a entrada");
       //System.out.println(en);
    }

    private static void escolhe_menu(int opcao){
        switch(opcao){
               case 1: 
                    int n1 = ler("\n Digite o n1: ");
                    int n2 = ler("\n Digite o n2: ");
                    int soma1 = somar(n1, n2);
                    System.out.printf("A soma é de %d: ", soma1);
               break;

               case 2:
                    int n3 = ler("\n Digite o n3: ");
                    int n4 = ler("\n Digite o n4: ");
                    int d = dividir(n3, n4);
                    System.out.printf("A divisão é de %d: ", d);
               break;
           }
    }

    static void menu (){
        System.out.println("=========Calculadora==========");
        System.out.println("\t1 Somar");
        System.out.println("\t2 Dividir");
    }

    static int ler(String mensagem){
        Scanner scan = new Scanner(System.in);
        System.out.println(mensagem);
        int numero = Integer.parseInt(scan.nextLine());
        //scan.close();
        return numero; 
    }

    /*static String entrada(String mensagem){
        Scanner scan = new Scanner(System.in);
        System.out.println(mensagem);
        String info = scan.nextLine();
        scan.close();
        return info;
    }*/

    /*static int somar(int n1, int n2){
        int soma1 = n1 + n2;
        return soma1;
    }
    
    static int dividir(int n3, int n4){
        int d = (n3/n4);
        return d; 
    }
}*/
