package modulo4.aula34.view;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class View1Insert{
    public static void main(String[] args) {
        try{
            String nome = "Eletro";
            
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost/postgres", "postgres", "123456");
            PreparedStatement prepstatement = conn.prepareStatement();
            prepstatement.setString(0, nome);            
            
            prepstatement.execute();
            
            ResultSet ids = Statement.getGeneratedKeys();

            while(ids.next()){
                int id = ids.getInt("id");
                System.out.println(id);
            }
            conn.close();

        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}