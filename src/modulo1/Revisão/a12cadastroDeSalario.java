package modulo1.Revisão;

import java.util.Scanner;

public class a12cadastroDeSalario {
   public static void main(String[] args) {
    System.out.printf("Cadastro de salários\n");
    Scanner sc = new Scanner(System.in);
    double salario = 0.0;
    boolean invalido = true;

            do {
                System.out.printf("Digite seu salário: ");
                salario = Double.parseDouble(sc.nextLine());
                if (salario > 1997.58 && salario < 5999.99) {
                    System.out.println("\n O salário é maior que 1997,58");
                }
                else if(salario >= 5399.99) {
                    System.out.println("\n O salário é maior ou igual a 5399,99");
                }
                else if(salario == 0.0){
                    System.out.println("\n Salário igual a zero. Por favor digite o salário novamente");
                }
                else
                {
                    System.out.println("Invalido");
                }                     
                 invalido = false;
            } while (salario <= 0);
            sc.close();
   } 
}
