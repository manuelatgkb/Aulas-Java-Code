package modulo4.aula37.view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import src.modulo4.aula33.utils.ConnectionFactory;

public class View4 {
    public static void main(String[] args) {
        try(Connection conn = new ConnectionFactory().getConnection());
        {
            PreparedStatement prepStatement = conn.prepareStatement("SELECT FROM *categoria");
            prepStatement.execute("SELECT * FROM pessoa");
            ResultSet result = prepStatement.getResultSet();

            while(result.next()){
                int id = result.getInt("id");
                String nome = result.getString("nome");
                System.out.printf("%d - %s",id, nome, sobrenome);
            }

        }catch(SQLException e){
            System.out.println("Não foi posível conectar");

        }
        
    }
}
