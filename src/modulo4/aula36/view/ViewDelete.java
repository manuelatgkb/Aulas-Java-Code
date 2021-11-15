package modulo4.aula36.view;

import java.sql.Connection;
import java.sql.SQLException;

import modulo4.aula36.utils.CategoriaDao;
import modulo4.aula36.utils.ConnectionFactory;

public class ViewDelete {
    public static void main(String[] args) {
        
        try(Connection conn = new ConnectionFactory().getConnection())
        {
            CategoriaDao dao = new CategoriaDao(conn);
            dao.delete(1);

        }catch(SQLException e){
        e.printStackTrace();
        }
    }
}
