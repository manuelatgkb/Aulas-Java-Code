package modulo4.aula37.view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import src.modulo4.aula35.utils.ConnectionFactory;

public class View2 {
    public static void main(String[] args) {
        try(Connection conn = new ConnectionFactory().getConnection())
        {
            int id = 2;            
            String sql = "UPDATE categoria SET nome = ? where id = ?";
            try(PreparedStatement prepStatement = conn.prepareStatement(sql)) {
                prepStatement.setInt(1, idDeletado);
                prepStatement.execute(sql);
                int linhasAfetadas = prepStatement.getUpdateCount();
                System.out.println(linhasAfetadas);
            } catch (Exception e) {
                e.printStackTrace();
            }        

        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}
