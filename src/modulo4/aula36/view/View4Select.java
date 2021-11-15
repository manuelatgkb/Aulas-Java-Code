package modulo4.aula36.view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import modulo3.Aula20.MVC.Model.Categoria;
import modulo4.aula36.utils.CategoriaDao;

public class View4Select {
    public static void main(String[] args) {
        try(Connection conn = new ConnectionFactory().getConnection())
        {
           CategoriaDao dao = new CategoriaDao(conn);

           for(Categoria c : dao.list()){
               System.out.println(c);
           }
        }catch(SQLException e){
            e.printStackTrace();
        }
        
    }
}
