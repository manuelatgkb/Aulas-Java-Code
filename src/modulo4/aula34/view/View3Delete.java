package modulo4.aula34.view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class View3Delete {
    public static void main(String[] args) {
        
        try{
            int id = 2;
            String nome = "UpdatePrepStatement";
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost/postgres", "postgres", "123456");
            
            String sql = "Delete FROM categoria WHERE id = ?";
            PreparedStatement prepstatement = conn.prepareStatement(sql);
            prepstatement.setInt(1, id);

            prepstatement.execute();
            int linhasAfetadas = prepstatement.getUpdateCount();
            System.out.println(linhasAfetadas);
        
            conn.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}
