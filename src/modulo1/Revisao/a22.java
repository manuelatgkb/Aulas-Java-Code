package modulo1.Revisao;

import java.util.Scanner;

public class a22 {
    public static void main(String[] args) {
        ler("\n Digite um número: ");
        
    }
    static int ler(String mensagem){
       Scanner scan = new Scanner(System.in);
        int dado;
        do{
            System.out.println(mensagem);
            dado = Integer.parseInt(scan.nextLine());
            if(dado < 0 ){
                System.out.println("O número não pode ser negativo. Digite novamente: ");
            }
        }while(dado < 0);
        return dado;
        //scan.close();
    }
    static boolean valida_positivos(int numero){
        if(numero < 0)
            return false;
        return true;
    }
}
