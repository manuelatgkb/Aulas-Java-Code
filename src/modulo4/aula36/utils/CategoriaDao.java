package modulo4.aula36.utils;

import java.lang.reflect.Constructor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.postgresql.jdbc2.ArrayAssistantRegistry;

import modulo3.aula13.Categoria;

public class CategoriaDao {

    private Connection conn;
    public CategoriaDao(Connection conn) {
        this.conn = conn;
    }

    public void create(Categoria model)throws SQLException{
        try(Connection conn = new ConnectionFactory().getConnection()){
            CategoriaDao cat1 = new Categoria("TestePrepared");

            
            String sql = "INSERT INTO categoria(nome)values(?)";
            PreparedStatement prepStatement = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            prepStatement.setString(1, model.getNome());
            
            prepStatement.execute();
            ResultSet ids = prepStatement.getGeneratedKeys();

            while(ids.next()){
                int id = ids.getInt("id");
                System.out.println(id);
            }

        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    public void List<Categorias> list(){
        List<Categorias> list = new ArrayList<Categorias>();
        return list;
        
    }

    public void update(Categoria model){
        
    }

    public void delete(int id){
        
    }
}
