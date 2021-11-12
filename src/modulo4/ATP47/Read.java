package src.modulo4.ATP47;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Read {
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "123456");

            Statement statement = (Statement) conn.createStatement();
            String sql = "SELECT * FROM categoria";
            statement.execute(sql);
            ResultSet result = ((java.sql.Statement) statement).getResultSet();

            while(result.next()){
                int id = result.getInt("id");
                String nome = result.getString("nome");
                String descricao = result.getString("descricao");
                System.out.printf("%d: %s - %s\n", id, nome, descricao);
            }

            conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
