package modulo3.ExerciciosExtra.R08;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int[] numeros = new int[10];

       for (int i = 0; i < numeros.length; i++) {
           numeros[i] = -1;
       } 

       for (int i = 0; i < numeros.length; i++) {
            System.out.printf("digite um número ímpar(%d): ", i);
            int n = Integer.parseInt(sc.nextLine());
            if(n %2 != 0){
                numeros[i] = n;    
            }else{
                System.out.println("O número não é ímpar. Digite novamente");
                i --;
            }    
       }

       for (int n : numeros) {
           System.out.println(n);
       }
    }
}
