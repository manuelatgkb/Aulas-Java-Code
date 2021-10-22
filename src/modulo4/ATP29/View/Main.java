package modulo4.ATP29.View;

import java.util.Scanner;

import modulo4.ATP29.Controller.ControllerProdutos;
import modulo4.ATP29.Model.Categorias;
import modulo4.ATP29.Model.Produtos;


public class Main {
    static Scanner sc = new Scanner(System.in);
    static ControllerProdutos cp = new ControllerProdutos();


    public static void main(String[] args) {
        
/*
        //Criando Categorias
        Categorias c1 = new Categorias();
        c1.id = 28282;
        c1.marca = "Samsung";
        c1.descricao = "Telefone esperto";

        Categorias c2 = new Categorias();
        c2.id = 3636;
        c2.marca = "LG";
        c2.descricao = "Televisão esperta";


        //Criando Produtos
        Produtos p1 = new Produtos();
        p1.id = 26262;
        p1.categoria.id = 2727;
        p1.nome = "Smartphone"; 
        p1.categoria = c1;


        Produtos p2 = new Produtos();
        p2.id = 636363;
        p2.categoria.id = 227;
        p2.nome = "Smart Tv";
        p2.categoria = c2;

        Produtos p3 = new Produtos();
        p3.id = 26262;
        p3.categoria.id = 373737;
        p3.nome = "Apple Watch"; 
        p3.categoria = c2; */

        int opcao;

        do{
            imprimirCabecalho();
            opcao = lerOpcao();
            escolhaMenu(opcao);
        }while(opcao !=5);


        /*Chamando Create: 
        cp.create(p1);
        System.out.println("Produto 1 id: " + p1.id + "Nome: " 
        + p1.nome + "Categoria: " + p1.categoria);
        cp.create(p2);
        System.out.println("Produto 2 id: " + p2.id + "Nome: " 
        + p2.nome + "Categoria: " + p2.categoria);

        
        //Chamando Update
        cp.update(p3);
        System.out.println("Update do primeiro produto, Id:  " + p3.id + "Nome: " 
        + p3.nome + "Categoria: " + p3.categoria);

        //Chamando Read
        System.out.println("Lista de produtos " + cp.read());
        listar(cp);


        //Chamando Delete
        cp.delete(p1);
        System.out.println("Deletado Produto 1, \n ID : " + p1.id);
    */
    }

//Cabeçalho
public static void  imprimirCabecalho (){
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

public static void escolhaMenu(int opcao){
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
            System.out.println("Opção inválida");
            break;
    }
}
//Listando
public static void listar(){
    for (Produtos p : cp.read()) {
        System.out.println(p);
        }
    }

    public static void  cadastrar() {
        Produtos p = new Produtos();
        System.out.printf("Digite o ID: ");
        p.id = Integer.parseInt(sc.nextLine());
        System.out.printf("Digite o nome do produto: ");
        p.nome =sc.nextLine();
        System.out.printf("Digite a marca do produto: ");
        p.categoria.marca = sc.nextLine();
        System.out.printf("Digite a Descrição do produto: ");
        p.categoria.descricao = sc.nextLine();
        cp.create(p);
    }

    public static void atualizar(){
        Produtos p = new Produtos();
        System.out.printf("Digite o ID: ");
        p.id = Integer.parseInt(sc.nextLine());
        System.out.printf("Digite o nome do produto: ");
        p.nome =sc.nextLine();
        System.out.printf("Digite a marca do produto: ");
        p.categoria.marca = sc.nextLine();
        System.out.printf("Digite a Descrição do produto: ");
        p.categoria.descricao = sc.nextLine();
        cp.update(p);

    }

    public static void deletar(){
        Produtos p = new Produtos();
        System.out.printf("Digite o ID: ");
        p.id = Integer.parseInt(sc.nextLine());
        cp.delete(p);
    }
}
    
