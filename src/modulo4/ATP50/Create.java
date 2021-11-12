package src.modulo4.ATP50;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Create {
    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection){
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "123456");

            PreparedStatement prepstatement = conn.prepstatement(sql);
            String sql = "INSERT INTO categoria(nome, descricao) VALUES('nome', 'id')";
            prepstatement.execute(sql, prepstatement.RETURN_GENERATED_KEYS);
            ResultSet info = prepstatement.getGeneratedKeys();

            while(info.next()){
                int id = info.getInt("id");
                System.out.println(id);
            }

            conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
    } 
    }
}
