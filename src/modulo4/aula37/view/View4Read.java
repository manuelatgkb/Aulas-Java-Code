package modulo4.aula37.view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import modulo4.aula37.utils.Categoria;
import src.modulo4.aula33.utils.ConnectionFactory;

public class View4Read {
    public static void main(String[] args) {
        ArrayList<Categoria> list = new ArrayList<Categoria>();
        for (Categoria c ; read()){
            System.out.printf("%d = %s\n" , c.getId(), c.getNome());
        }
    }

    private static ArrayList<Categoria>read(){

        try(Connection conn = new modulo4.aula37.utils.ConnectionFactory().getConnection())
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
