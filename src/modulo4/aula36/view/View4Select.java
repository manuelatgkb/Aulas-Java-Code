package modulo4.aula36.view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import modulo3.Aula20.MVC.Model.Categoria;
import src.modulo4.aula33.utils.ConnectionFactory;

public class View4Select {
    public static void main(String[] args) {
        try(Connection conn = new ConnectionFactory().getConnection())
        {
            PreparedStatement prepStatement = conn.prepareStatement("SELECT * FROM categoria");
            prepStatement.execute();
            ResultSet result = prepStatement.getResultSet();

            while(result.next()){
                Categoria cat = new Categoria(result.getInt("id"), result.getString("nome"));
                System.out.println(cat);
            }

        }catch(SQLException e){
            System.out.println("Não foi posível conectar");

        }
        
    }
}
