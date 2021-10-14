package modulo3.Aula4.view;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.plaf.metal.MetalBorders.MenuItemBorder;

import modulo3.Aula4.controller.ArtistaController;
import modulo3.Aula4.model.Artista;

public class ArtistaView {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArtistaController controller = new ArtistaController();


        int opcao = menu(sc);
        do{
            switch (opcao) {
                case 1:
                    cadastrar(controller, sc);
                break;
                case 2:
                    ArrayList<Artista> lista = controller.listar();
                    for(Artista artista : lista){
                        System.out.printf("Nome: %s, Categoria: %s, Nacionalidade: %s", artista.nome, artista.categoria, artista.nacionalidade);
                    }
                    break;
            }
        }while(opcao != 0);
    }

    private static void cadastrar(ArtistaController controller, Scanner sc) {
        Artista artista1 = new Artista();
        System.out.println("Digite o nome");
        artista1.nome = sc.nextLine();
        System.out.println("Digite a categoria");
        artista1.categoria = sc.nextLine();
        System.out.println("Digite a nacionalidade");
        artista1.nacionalidade = sc.nextLine();
        controller.salvar(artista1);
    }

    private static int menu(Scanner sc) {
        System.out.println("\t1-Cadastrar\n\t 2-Listar\n\t0-Sair\n \n \tEscolha uma opçâo:\n");
        int opcao = Integer.parseInt(sc.nextLine());
        return opcao;
    }
}
