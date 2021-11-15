package modulo4.aula36.view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import modulo3.Aula20.MVC.Model.Categoria;
import src.modulo4.aula33.utils.ConnectionFactory;

public class View3Insert {
    public static void main(String[] args) {
        try(Connection conn = new ConnectionFactory().getConnection()){
            Categoria cat1 = new Categoria("TestePrepared");

            
            String sql = "INSERT INTO categoria(nome)values(?)";
            PreparedStatement prepStatement = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            prepStatement.setString(1, nome);
            
            prepStatement.execute();
            ResultSet ids = prepStatement.getGeneratedKeys();

            while(ids.next()){
                int id = ids.getInt("id");
                System.out.println(id);
            }

        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}
