package src.modulo4.ATP50;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Delete {
   public static void main(String[] args) {
    try {

        int id = 1; 
        String sql = "DELETE FROM categoria WHERE id = ?";

        Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "123456");
        
        PreparedStatement prepStatement = conn.prepareStatement(sql);
        prepStatement.setInt(1, id);

        prepStatement.execute();
        int linhasAfetadas = prepStatement.getUpdateCount();
        System.out.println(linhasAfetadas);

        conn.close();

    } catch (SQLException e) {
        e.printStackTrace();
    }
}
   } 
}
