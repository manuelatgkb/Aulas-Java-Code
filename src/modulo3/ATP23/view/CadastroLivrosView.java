package modulo3.ATP23.view;

import java.util.ArrayList;
import java.util.Scanner;

import modulo3.ATP23.controller.LivrosController;
import modulo3.ATP23.model.Livros;

public class CadastroLivrosView {
   // private static int id = 0;
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
        LivrosController controller = new LivrosController();

        int opcao = menu(sc);

        do{
            switch (opcao) {
                case 1:
                cadastrar(controller, sc);
                break;
                case 2: 
                listar(controller,  sc);
                break;
            }
        }while(opcao != 0);
    }
        

        private static void listar(LivrosController controller, Scanner sc){
            ArrayList<Livros> listaLivros = controller.listar();
                        for(Livros livro : listaLivros){
                            System.out.printf("Id: %d, ISNB: %d, Título: %s", livro.id, livro.isbn, livro.titulo);
                        }
                    }

        private static void cadastrar(LivrosController controller, Scanner sc) {
            Livros livro1 = new Livros();
            System.out.print("Digite o id do livro");
            livro1.id = sc.nextInt();
            System.out.print("Digite o isbn do Livro ");
            livro1.isbn = sc.nextInt();
            System.out.print("Digite o autor do livro");
            livro1.titulo = sc.nextLine();
            controller.salvar(livro1);
        }

        public static int menu(Scanner sc) {
            System.out.printf("\t1-Cadastrar\n\t 2-Listar\n\t0-Sair\n \n \tEscolha uma opçâo:\n");
            int opcao = Integer.parseInt(sc.nextLine());
            return opcao;
        }
    }
