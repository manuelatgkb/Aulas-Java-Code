package src.modulo4.aula33.view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class View1 {
    public static void main(String[] args) {
        try{
            int idDeletado =26;

            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "123456");

            String sql = "DELETE FROM categoria WHERE id = ?";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setInt(1, idDeletado);
            
            preparedStatement.execute();
            int linhaAfetadas = preparedStatement.getUpdateCount();
            System.out.println(linhaAfetadas);

            conn.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}
