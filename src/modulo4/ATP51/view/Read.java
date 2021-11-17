package src.modulo4.ATP51.view;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import modulo4.ATP51.dao.ConnectionFactory;
import src.modulo4.ATP51.dao.CategoriaDao;

public class Read {
    public static void main(String[] args) {
        try (Connection conn = new ConnectionFactory().getConnection()){
            CategoriaDao dao = new CategoriaDao(conn);

            for(Categoria c : dao.list()){
                System.out.println(c);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
