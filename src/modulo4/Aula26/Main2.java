package modulo4.Aula26;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args){
        System.out.println("Entrando no método 1");
        metodo1();
        System.out.println("Entrando no método 2");
        metodo2();
    }

        public  static void metodo1() {
            System.out.println("Entrando no metodo 1...");
            metodo2();
            System.out.println("Saindo do metodo 1... ");
        }
    

        public static void metodo2(){
            System.out.println("Entrando no metodo 2 ...");
            String nome = null;
            int idade = 0;
            try{
                System.out.println("Digite sua idade");
                Scanner sc = new Scanner(System.in);
                idade = Integer.parseInt(sc.nextLine());

                if(idade <0 || idade > 150){
                    throw new IllegalAccessException("Idade Invalida. Deve ser maior que zero e menor que 150! Digite novamente.");
                }
            }
            catch(NullPointerException ex){
                System.out.println(ex.getMessage());
                System.out.println("Deu ruim na String");
            }catch(NumberFormatException ex){
                System.out.println(ex.getMessage());
                System.out.println("Deu ruim na mensagem");
                idade = -1;
            }catch(Exception ex){
                System.out.println(ex.getMessage());
                System.out.println("Deu ruim, dado inválido");
                idade = 1;

            }while(idade == -1);
            System.out.println("Saindo do metodo 2");
        
            
    }
}
