package modulo4.aula37.view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import modulo4.aula35.utils.ConnectionFactory;

public class ViewDelete {
    public static void main(String[] args) {
        
        try(Connection conn = new ConnectionFactory().getConnection())
        {
            Categoria model = new Categoria();
            model.setId(2);
            String sql = 

            int id = 2;
            String nome = "DeletePrepStatement";
            try(PreparedStatement prepstatement = conn.prepareStatement(sql))
            {
            prepstatement.setInt(1, id);
            prepstatement.execute();
            int linhasAfetadas = prepstatement.getUpdateCount();
            System.out.println(linhasAfetadas);
        
        }catch(SQLException e){
            e.printStackTrace();
        }
    }catch(SQLException e){
        e.printStackTrace();
    }
}
}
