package modulo4.RevisaoATP29.View;

import java.util.Scanner;

import modulo4.RevisaoATP29.Controller.ProdutosController;
import modulo4.RevisaoATP29.Model.Produtos;

public class Main {
    static Scanner sc = new Scanner(System.in); 
    static ProdutosController cp = new ProdutosController();

    public static void main(String[] args) {
        int opcao;

        do{imprimirCabecalho();
            opcao = lerOpcao();
            escolhaMenu(opcao);
        }while (opcao != 5);

    }
    //Cabeçalho
        public static void imprimirCabecalho(){
            System.out.println("\n_______________Bem-Vindo ao Cadastro de Produtos__________________\n");
            System.out.println("\nDigite uma opção: ");
            System.out.println("1- Criar produto");
            System.out.println("2 - Listar Produto");
            System.out.println("3 - Atualizar Produto");
            System.out.println("4 - Deletar Produto");
            System.out.println("5 - Sair");
        
        }

        public static int lerOpcao(){ 
            System.out.println("__________Digite uma das opções_____________");
            return Integer.parseInt(sc.nextLine());
        }

        public  static void escolhaMenu(int opcao) {
            switch (opcao) {
                case 1:
                cadastrar();
                    break;
                case 2:
                    listar();
                    break;
                case 3:
                    atualizar();
                
                    break;
                case 4:
                    deletar();
                    break;
                case 5:
                System.out.println("_________Obrigado por utilizar nosso cadastro de produtos________");
                    break;
                default:
                System.out.println("Opção inválida. Escolha uma opção: ");
                    break;
            }
        }

        public static void listar(){
            for(Produtos p : cp.read()){
                System.out.println(p);
            }
        }

        public static void cadastar(){
            Produtos p = new Produtos();
            System.out.println("Digite o id do produto: ");
            p.id = Integer.parseInt(sc.nextLine());
            System.out.println("Digite o nome do produto: ");
            p.nome = sc.nextLine();
            System.out.println("Digite a marca do produto: ");
            p.categoria.marca = sc.nextLine();
            cp.create(p);
        }

        public static void atualizar(){
            Produtos p = new Produtos();
            System.out.println("Digite o id do produto: ");
            p.id = Integer.parseInt(sc.nextLine());
            System.out.println("Digite o nome do produto: ");
            p.nome = sc.nextLine();
            System.out.println("Digite a marca do produto: ");
            p.categoria.marca = sc.nextLine();
            cp.update(p);
        }

        public static void deletar(){
            Produtos p = new Produtos();
            System.out.println("Digite o id do produto: ");
            p.id = Integer.parseInt(sc.nextLine());
            cp.delete(p);
        }
}


