package modulo4.aula37.view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import modulo4.aula36.model.Categoria;
import src.modulo4.aula33.utils.ConnectionFactory;

public class View4 {
    public static void main(String[] args) {
        try(Connection conn = new ConnectionFactory().getConnection());
        {
            PreparedStatement prepStatement = conn.prepareStatement("SELECT FROM *categoria");
            prepStatement.execute("SELECT * FROM pessoa");
            ResultSet result = prepStatement.getResultSet();

            while(result.next()){
                Categoria model = new Categoria();
                int id = result.getInt("id");
                String nome = result.getString("nome");

                model.setId(result.getInt("id"));
                model.setNome(result.getString("nome"));
                System.out.printf("%d - %s", model.getId(), model.getNome());
            }

        }catch(SQLException e){
            e.printStackTrace();
        }
        
    }
}
