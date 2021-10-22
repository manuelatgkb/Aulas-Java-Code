package modulo4.ATP29.View;

import java.util.Scanner;

import modulo4.ATP29.Controller.ControllerCategorias;
import modulo4.ATP29.Controller.ControllerProdutos;
import modulo4.ATP29.Model.Categorias;
import modulo4.ATP29.Model.Produtos;

public class Main {
    public static void main(String[] args) {
        
        ControllerProdutos cp = new ControllerProdutos();
        ControllerCategorias cc = new ControllerCategorias();

        //Criando Produtos
        Produtos p1 = new Produtos();
        p1.id = 26262;
        p1.nome = "Smartphone"; 
        p1.categoria = "Telefones";

        Produtos p2 = new Produtos();
        p2.id = 636363;
        p2.nome = "Smart Tv";
        p2.categoria = "Televisores";

        Produtos p3 = new Produtos();
        p3.id = 26262;
        p3.nome = "Apple Watch"; 
        p3.categoria = "Relógios";



        //Criando Categorias
        Categorias c1 = new Categorias();
        c1.id = 28282;
        c1.marca = "Samsung";
        c1.descricao = "Telefone esperto";

        Categorias c2 = new Categorias();
        c2.id = 3636;
        c2.marca = "LG";
        c2.descricao = "Televisão esperta";

        //Cabeçalho
        System.out.println("\n_______________Bem-Vindo ao Cadastro de Produtos__________________\n");
        System.out.println("\nDigite uma opção: ");
        System.out.println("1- Criar produto");
        System.out.println("2 - Listar Produto");
        System.out.println("3 - Atualizar Produto");
        System.out.println("4 - Deletar Produto");
        System.out.println("5 - Sair");
        System.out.println("____________Obrigado por utilizar o Cadastro de Produtos___________-");
        Scanner sc = new Scanner(System.in);


        //Chamando Create: 
        cp.create(p1);
        System.out.println("Produto 1 id: " + p1.id + "Nome: " 
        + p1.nome + "Categoria: " + p1.categoria);
        cp.create(p2);
        System.out.println("Produto 2 id: " + p2.id + "Nome: " 
        + p2.nome + "Categoria: " + p2.categoria);

        cc.create(c1);
        System.out.println("Categoria 1 id: " + c1.id + "Marca: " 
        + c1.marca + "Descrição: " + c1.descricao);cp.create(p1);
        cc.create(c2);
        System.out.println("Categoria 2 id: " + c2.id + "Marca: " 
        + c2.marca + "Descrição: " + c2.descricao);
        
        //Chamando Update
        cp.update(p3);
        System.out.println("Update do primeiro produto, Id:  " + p3.id + "Nome: " 
        + p3.nome + "Categoria: " + p3.categoria);

        //Chamando Read
        System.out.println("Lista de produtos " + cp.read());
        System.out.println("Lista de produtos " + cc.read());


        //Chamando Delete
        cp.delete(p1);
        System.out.println("Deletado Produto 1, \n ID : " + p1.id);


        //Listando
    static public void listar(Object obj){
        if(obj instanceof ControllerProdutos){
            ControllerProdutos cp = (ControllerProdutos)obj;

            for (Produtos p : cp.read()) {
                System.out.println(p);
            }
        }else if (obj instanceof ControllerCategorias){
            ControllerCategorias c = (ControllerCategorias)obj;

            for (Categorias c : cc.read()) {
                System.out.println(c);
            }
        }


    }
}
