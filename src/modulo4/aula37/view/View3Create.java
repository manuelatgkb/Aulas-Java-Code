package modulo4.aula37.view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import modulo4.aula37.utils.Categoria;
import modulo4.aula37.view.dao.CategoriaDao;
import src.modulo4.Aula37.utils.Categoria;
import src.modulo4.Aula37.utils.ConnectionFactory;

public class View3Create {
    public static void main(String[] args) {
        CategoriaDao dao = new CategoriaDao();

        Categoria model = new Categoria();
        Categoria model2 = new Categoria();

        try(Scanner sc = new Scanner(System.in))
        {
            System.out.print("Digite a categoria");
            model.setNome(sc.nextLine());

            System.out.print("Digite a categoria 2");
            model2.setNome(sc.nextLine());
        }catch(Exception e){
            System.out.println("Erro ao ler");

        }
            dao.insert(model);
            dao.insert(model2);

    }
}
