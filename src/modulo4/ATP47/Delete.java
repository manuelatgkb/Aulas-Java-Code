package src.modulo4.ATP47;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Delete {
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "123456");
            Statement statement = conn.createStatement();
            String sql = "DELETE FROM categoria WHERE id = 6";
            statement.execute(sql);

            int linhasAfetadas = ((java.sql.Statement) statement).getUpdateCount();
            System.out.println(linhasAfetadas);

            conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
