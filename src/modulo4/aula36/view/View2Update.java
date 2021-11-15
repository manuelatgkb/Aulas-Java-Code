package modulo4.aula36.view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import modulo4.ATP31.Model.Categoria;
import modulo4.aula36.utils.CategoriaDao;
import src.modulo4.aula36.utils.ConnectionFactory;

public class View2Update {
    public static void main(String[] args) {
        try(Connection conn = new modulo4.aula36.utils.ConnectionFactory().getConnection())
        {
            CategoriaDao dao = new CategoriaDao(conn);
            Categoria model = new Categoria(1, "TesteAlteracaoDao");
            
            System.out.println(dao.update(model));
            
        } catch (SQLException e) {
                e.printStackTrace();
        }     
    }
}
