package src.modulo4.aula33;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.spi.DirStateFactory.Result;

public class View2 {
    public static void main(String[] args) {
        try{
            Connection conn = DriverManager.getConnection(jdbc:postgresql: , xxxx, password);
            Statement statement = conn.createStatement();
            statement.execute("SELECT * FROM pessoa");
            ResultSet result = statement.getResultSet();

            while(result.next()){
                int id = result.getInt("id");
                String nome = result.getString("nome");
                String sobrenome = result.getString("sobrenome");
                System.out.printf("%d - %s %s",id, nome, sobrenome);
            }

            conn.close();

        }catch(SQLException e){
            System.out.println("Não foi posível conectar");

        }
        
    }
}
