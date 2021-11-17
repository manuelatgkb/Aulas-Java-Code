package src.modulo4.ATP51.view;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import modulo4.ATP51.dao.ConnectionFactory;
import src.modulo4.ATP51.dao.CategoriaDao;

public class Delete {
   public static void main(String[] args) {
    try (Connection conn = new ConnectionFactory().getConnection()){
        CategoriaDao dao = new CategoriaDao(conn);
        int linhasAfetadas = dao.delete(1);

        System.out.println("\nNúmero de linhas afetadas: " + linhasAfetadas);


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
} 

