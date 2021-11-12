package src.modulo4.aula33.view;

import java.sql.Connection;
import java.sql.PreparedStatement;

import src.modulo4.aula33.utils.ConnectionFactory;

public class View2 {
    public static void main(String[] args) {
        try (            Connection conn = new ConnectionFactory().getConnection();
        ) {
            String nome = "UpdatePrepStatment";
            int id = 25;
            try(PreparedStatement preparedStatement = conn.prepareStatement(sql)){
            String sql = "UPDATE categoria SET nome = ? WHERE id =?";
            preparedStatement.setString(1, nome);
            preparedStatement.setInt(2, id);

            preparedStatement.execute();

            int linhaAfetadas = preparedStatement.getUpdateCount();
            System.out.println(linhaAfetadas);
            }catch(Exception e){
                e.printStackTrace();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
