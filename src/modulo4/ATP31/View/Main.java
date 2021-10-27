package modulo4.ATP31.View;

import java.util.Scanner;

import modulo4.ATP31.Controller.ProdutoController;
import modulo4.ATP31.Model.Produto;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
    ProdutoController controlle = new ProdutoController();
    int opcao;

    do{
        imprimeOpcoes();
        opcao = getNumero();
        menu(opcao, controlle);
    }while(opcao !=5);


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
   public static void menu(int opcao, ProdutoController controller){
       
        switch (opcao) {
           case 1:
            
               System.out.println("______Cadastrar_____");
               controller.create(cadastrar());
               break;
            case 2:
               System.out.println("_________Atualizar________");
               controller.update(atualizar());
               break;
            case 3:
               System.out.println("____________Listar_________");
               listar(controller);
               break;
            case 4:
                System.err.println("___________Deletar_______");
               controller.delete(deletar());
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
        System.out.println("Digite o id da categoria do produto: ");
        p.categoria.id = sc.nextLine();
        System.out.println("Digite a descrição do produto: ");
        p.categoria.descricao = sc.nextLine();

        System.out.println("O produto foi cadastrado corretamente");

        return p;
   }
    public static Produto atualizar(){
        Produto p = new Produto();
        System.out.println("Digite o id do produto que você deseja atualizar: ");
        p.id = sc.nextLine();
        return p;
    }   
    public static void listar(ProdutoController controller){
        for(Produto p :controller.read()){
            System.out.println(p);
        }
    }
    public static Produto deletar(){
        Produto p = new Produto();

        System.out.println("Digite o ID a ser deletado: ");
        p.id = sc.nextLine();
        return p;
    }
}

/*public boolean delete(T obj){

    return this.lista.remove(obj);

}*/