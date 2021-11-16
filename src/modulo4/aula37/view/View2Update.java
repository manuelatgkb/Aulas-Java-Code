package modulo4.aula37.view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import modulo4.aula37.utils.Categoria;
import src.modulo4.aula35.utils.ConnectionFactory;

public class View2Update {
    public static void main(String[] args) {
        try(Connection conn = new ConnectionFactory().getConnection())
        {
            Categoria model = new Categoria();

            model.setId(1);
            model.setNome("Teste aula 37 - Update");

            String sql = "UPDATE categoria SET nome = ? where id = ?";
            try(PreparedStatement prepStatement = conn.prepareStatement(sql)) {
                prepStatement.setString(1, model.getNome);
                prepStatement.setInt(2, model.getId());

                prepStatement.execute(sql);
                int linhasAfetadas = prepStatement.getUpdateCount();
                System.out.println(linhasAfetadas);
            } catch (Exception e) {
                e.printStackTrace();
            }        

        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}
