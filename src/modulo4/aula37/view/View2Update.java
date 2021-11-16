package modulo4.aula37.view;

import java.util.Scanner;

import modulo4.aula37.utils.Categoria;
import modulo4.aula37.view.dao.CategoriaDao;

public class View2Update {
    public static void main(String[] args) {
        CategoriaDao dao = new CategoriaDao();
        Categoria model = new Categoria();
        try (Scanner sc = new Scanner(System.in)){
            System.out.printf("\n Digite o id a ser alterado");
            int id = Integer.parseInt(sc.nextLine());
            model.setId(id);

            System.out.printf("\n Digite o nome a ser alterado");
            String nome = sc.nextLine();
            model.setNome(nome);

        } catch (Exception e) {
            System.out.println("Não foi possível ler");
        }
        int linhasAfetadas = dao.update(model);
        System.out.println(linhasAfetadas);  

    }

}
