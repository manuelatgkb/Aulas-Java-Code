package src.modulo4.aula43.view;

//https://github.com/margareth-mee/BancoDeDados/tree/main/ATP51

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import modulo4.ATP51.model.Categoria;
import modulo4.ATP51.dao.ConnectionFactory;

public class Create {
    public static void main(String[] args) {
        try (Connection conn = new ConnectionFactory().getConnection()){
            CategoriaDao dao = new CategoriaDao(conn);
            Categoria model = new Categoria("TesteCreate");

            dao.create(model);

        } catch (SQLException e) {
            e.printStackTrace();
        } 
    }
}
