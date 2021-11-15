package modulo4.aula36.view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import src.modulo4.aula33.utils.ConnectionFactory;

public class ViewDelete {
    public static void main(String[] args) {
        
        try(Connection conn = new ConnectionFactory().getConnection())
        {
            int idDeletado = 2;
            String sql = "Delete FROM categoria WHERE id = ?";

            try(PreparedStatement prepstatement = conn.prepareStatement(sql)){
            prepstatement.setInt(1, idDeletado);
            prepstatement.execute();
            int linhasAfetadas = prepstatement.getUpdateCount();
            System.out.println(linhasAfetadas);
            }catch(Exception e){
            e.printStackTrace();
        }
        }catch(SQLException e){
        e.printStackTrace();
        }
    }
}
