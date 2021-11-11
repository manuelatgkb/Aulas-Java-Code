package src.modulo4.aula33;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class View5 {
    public static void main(String[] args) {
        try{
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost/postgres", "postgres", "123456");
            
            Statement statement = conn.createStatement();
            String sql = "DELETE FROM pessoa where id >10";
            
            statement.execute(sql, statement.RETURN_GENERETED_KEYS);
            
            ResultSet ids = statement.getGeneratedKeys();

            while(ids.next()){
                int id = ids.getInt(1);
                System.out.println(id);
            }
            conn.close();

        }catch(SQLException e){
            System.out.println("Não foi posível conectar");
        }
    }
}
