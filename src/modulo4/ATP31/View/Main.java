package modulo4.ATP31.View;

import java.util.Scanner;

import modulo4.ATP31.Model.Produto;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
    imprimeOpcoes();
    int opcao = getNumero();
    


    }
    public static void imprimeOpcoes(){
        System.out.println("Opções: \n 1- Cadastrar, \n 2-Atualizar, \n 3- Listar, \n 4- Deletar, \n 5-Sair");
    }

   private static int getNumero(){
       int numero = 0;
       boolean valido;
       do{
           try{
               numero = Integer.parseInt(sc.nextLine());
               valido = true;
           }catch(NumberFormatException e){
               System.out.println("O número digitado não é um inteiro!");
               valido = false;
           }
       }while (!valido);
       return numero;
   }
   public static void menu(int opcao){
       switch (opcao) {
           case 1:
            
               System.out.println("______Cadastrar_____");
               cadastrar();
               break;
            case 2:
               System.out.println("_________Atualizar________");
               break;
            case 3:
               System.out.println("____________Listar_________");
               break;
            case 4:
                System.err.println("___________Deletar_______");
               
               break;
            case 5:
               System.out.println("Saindo");
               
               break;
       
           default:
               break;
       }
   }
   static public Produto cadastrar(){
        Produto p = new Produto();

        System.out.println("Digite o id do produto: ");
        p.id = sc.nextLine();
        System.out.println("Digite o nome do produto: ");
        p.nome = sc.nextLine();
        System.out.println("Digite a categoria do produto: ");
        p.categoria.id = sc.nextLine();
        System.out.println("Digite a descrição do produto: ");
        p.categoria.descricao = sc.nextLine();

        System.out.println("O produto foi cadastrado corretamente");

        return p;
   }
   public void atualizar(){
       
    }   
    public void listar(){
       
    }
    public void deletar(){
       
    }
}
