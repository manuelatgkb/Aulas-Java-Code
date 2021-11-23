package src.modulo4.aula43.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import src.modulo4.aula43.model.Categoria;

public class CategoriaDao {
        public int insert(Categoria model){
        int idGerado = 0;
        try(Connection conn = new ConnectionFactory().getConnection()){ 

            String sql = "INSERT INTO categoria(nome)values(?)";
            PreparedStatement prepStatement = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            prepStatement.setString(1, model.getNome());

            prepStatement.execute();
            ResultSet ids = prepStatement.getGeneratedKeys();

            while(ids.next()){
                idGerado = ids.getInt("id");
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
        return idGerado;
    }
}
        public ArrayList<Categoria> read() {
            ArrayList<Categoria> list = new ArrayList<Categoria>();

            try(Connection conn = new ConnectionFactory().getConnection()) {            

                PreparedStatement prepStatement = conn.prepareStatement("SELECT * FROM categoria");
                prepStatement.execute();
                ResultSet result = prepStatement.getResultSet();
                while(result.next()){
                    Categoria model = new Categoria();                
                    model.setId(result.getInt("id"));
                    model.setNome(result.getString("nome"));
                    list.add(model);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return list;
        }
        public int update(Categoria model) {
            int linhasAfetadas = 0;
            try(Connection conn = new ConnectionFactory().getConnection()) {                 

                String sql = "UPDATE categoria SET nome=? WHERE id = ?";            
                PreparedStatement prepStatement = conn.prepareStatement(sql);
                prepStatement.setString(1, model.getNome());
                prepStatement.setInt(2, model.getId());

                prepStatement.execute();  

                linhasAfetadas = prepStatement.getUpdateCount();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return linhasAfetadas;
        }
    }
