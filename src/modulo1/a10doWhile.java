package modulo1;

import java.util.Scanner;

import javax.security.sasl.SaslException;

public class a10doWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        byte idade = Byte.parseByte(sc.nextLine());
        while(idade<0){
            System.out.println("Idade não pode ser negativa! \n Digite novamente: ");
            idade = Byte.parseByte(sc.nextLine());
        }

        byte idade1 = 0;
        boolean valido = true;
        do{
            System.out.print("Digite sua idade1: ");
            idade1 = Byte.parseByte(sc.nextLine());
            if(idade1 < 0){
                System.out.println("A idade não pode ser negativa!");
                valido = false;
            }
        }while(valido);


        System.out.println("------------------Obrigado----------------");
    }
}
