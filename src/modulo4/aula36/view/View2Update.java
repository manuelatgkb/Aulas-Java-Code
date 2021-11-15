package modulo4.aula36.view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import modulo4.ATP31.Model.Categoria;
import src.modulo4.aula35.utils.ConnectionFactory;

public class View2Update {
    public static void main(String[] args) {
        try(Connection conn = new ConnectionFactory().getConnection()){
        Categoria cat = new Categoria( 1, "UpdateCOMModel");
        
            String sql = "UPDATE categoria SET nome = ? where id = ?";
            PreparedStatement prepStatement = conn.prepareStatement(sql));
            prepStatement.setString(1, cat.getNome());
            prepStatement.setInt(2, cat.getId());

            prepStatement.execute(sql);

            int linhasAfetadas = prepStatement.getUpdateCount();
            System.out.println(linhasAfetadas);
        } catch (Exception e) {
                e.printStackTrace();
        }     
    }
}
