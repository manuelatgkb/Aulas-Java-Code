package modulo1.Revisão;

import java.util.Scanner;

public class a11cadastroIdade {
    public static void main(String[] args) {
        System.out.printf("Cadastro de idade\n");
            Scanner sc = new Scanner(System.in);
            byte idade = 0;
            boolean invalido = true;

                    do {
                        System.out.printf("Digite sua idade: ");
                        idade = sc.nextByte();
                        if (idade < 25) {
                            System.out.println("\n Idade menor que 25 anos");
                        } else if (idade == 25) {System.out.println("\n Idade é 25 anos");
                        }else{
                            System.out.println("\nIdade maior que 25 anos");
                        }                           
                         invalido = false;
                    } while (invalido);
                    sc.close();

    }
}

