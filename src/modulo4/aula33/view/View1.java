package src.modulo4.aula33.view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class View1 {
    public static void main(String[] args) {
        try(Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "123456"))
        {
            int idDeletado =26;
            String sql = "DELETED FROM categoria WHERE id = ?";

            try(PreparedStatement preparedStatement = conn.prepareStatement(sql);)
            {
                preparedStatement.setInt(1, idDeletado);
            
                preparedStatement.execute();
                int linhaAfetadas = preparedStatement.getUpdateCount();
                System.out.println(linhaAfetadas);
            }catch (Exception e){
                e.printStackTrace();
            
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}
