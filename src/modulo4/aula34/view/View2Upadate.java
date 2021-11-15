package modulo4.aula34.view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class View2Upadate {
    public static void main(String[] args) {
        try{
            int id = 2;
            String nome = "UpdatePrepStatement";
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost/postgres", "postgres", "123456");
            
            String sql = "UPDATE categoria SET nome = ? where id = ?";
            PreparedStatement prepstatement = conn.prepareStatement(sql);
            prepstatement.setString(1, nome);
            prepstatement.setInt(2, id);

            prepstatement.execute(sql);
            
            int linhasAfetadas = prepstatement.getUpdateCount();
            System.out.println(linhasAfetadas);
            
            prepstatement.execute();
        
            conn.close();

        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}
