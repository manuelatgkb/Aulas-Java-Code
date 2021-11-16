package modulo4.aula37.view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import modulo4.aula37.utils.Categoria;
import modulo4.aula37.view.dao.CategoriaDao;

public class ViewDelete {
    public static void main(String[] args) {
        CategoriaDao dao = new CategoriaDao();
        Categoria model = new Categoria();

        try(Scanner sc = new Scanner(System.in);) {
            System.out.printf("\nDigite o id a ser deletado: ");
            int id = Integer.parseInt(sc.nextLine());
            model.setId(id);
            
        } catch (Exception e) {
            System.out.println("Não foi possível ler");
        }

    

        int lAfetadas =  model.delete(model);
        System.out.println(lAfetadas);
    }
}
