package modulo4.aula36.view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import modulo4.aula36.model.Categoria;
import modulo4.aula36.utils.CategoriaDao;

public class View3Insert {
    public static void main(String[] args) {

       try(Connection conn = new modulo4.aula36.utils.ConnectionFactory().getConnection()){
           CategoriaDao dao = new CategoriaDao(conn);
           Categoria cat1 = new Categoria("Teste1Dao");

           dao.create(cat1);
       }catch(SQLException e){
           e.printStackTrace();
       }
    }
}
