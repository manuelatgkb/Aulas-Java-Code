package src.modulo4.ATP49;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Read {
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "123456");

            PreparedStatement prepStatement = conn.prepareStatement();
            String sql = "SELECT * FROM categoria";
            prepStatement.execute(sql);
            ResultSet result = prepStatement.getResultSet();

            while(result.next()){
                int id = result.getInt("id");
                String nome = result.getString("nome");
                System.out.printf("%d: %s\n", id, nome);
            }

            conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
