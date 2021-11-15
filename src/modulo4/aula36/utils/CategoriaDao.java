package modulo4.aula36.utils;

import java.lang.reflect.Constructor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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

    public void List<Categorias> list() throws SQLException{
        List<Categorias> list = new ArrayList<Categorias>();

        PreparedStatement prepStatement = conn.prepareStatement("SELECT * FROM categoria");
        prepStatement.execute();
        ResultSet result = prepStatement.getResultSet();

        while(result.next()){
            Categoria cat = new Categoria(result.getInt("id"), result.getString("nome"));
            list.add(cat);
        }
        return list;
        
    }

    public int update(Categoria model)throws SQLException{            
                String sql = "UPDATE categoria SET nome = ? where id = ?";
                PreparedStatement prepStatement = conn.prepareStatement(sql);
                prepStatement.setString(1, model.getNome());
                prepStatement.setInt(2, model.getId());
                prepStatement.execute(sql);
    
                return prepStatement.getUpdateCount();
    }

    public int delete(int id){
            int linhasAfetadas = 0;
            String sql = "Delete FROM categoria WHERE id = ?";

            try(PreparedStatement prepstatement = conn.prepareStatement(sql)){
            prepstatement.setInt(1, id);
            prepstatement.execute();
            linhasAfetadas = prepstatement.getUpdateCount();
            System.out.println(linhasAfetadas);
            }catch(Exception e){
            e.printStackTrace();
        }
        return linhasAfetadas;
    }
}
