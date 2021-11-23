package src.modulo4.aula43.view;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import modulo4.ATP51.dao.ConnectionFactory;
import src.modulo4.ATP51.dao.CategoriaDao;

public class Update {
    public static void main(String[] args) {
        try (Connection conn = new ConnectionFactory().getConnection()){
            CategoriaDao dao = new CategoriaDao(conn);
            Categoria model = new Categoria(1, "TesteUpdate");
            int linhasAfetadas = dao.update(model);
            
            System.out.println(linhasAfetadas);


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
