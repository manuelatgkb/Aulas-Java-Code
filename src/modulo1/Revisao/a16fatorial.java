package modulo1.Revisao;

import java.util.Scanner;

public class a16fatorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = Integer.parseInt(sc.nextLine());

        //fatorial de 3 = 3*2*1 = 6
        //fatorial de 5 = 5*4*3*2*1 = 120
        int fatorial = 1;

        for(int i = numero; i>0; i--){
            System.out.printf("%d* ", i);
            fatorial = fatorial * i;
        }
        System.out.printf("= %d ", fatorial);

        sc.close();
    }
}
