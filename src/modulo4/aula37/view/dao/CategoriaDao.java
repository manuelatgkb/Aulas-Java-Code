package modulo4.aula37.view.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import modulo4.aula37.utils.Categoria;
import modulo4.aula37.utils.ConnectionFactory;

public class CategoriaDao {
    public static void main(String[] args) {

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
    
            }catch(SQLException e){
                e.printStackTrace();
            }
            return idGerado;
        }


            public ArraList<Categoria> read(){
                ArrayList<Categoria> list = new ArrayList<Categoria>();
                try(Connection conn = new ConnectionFactory().getConnection()){
                    PreparedStatement prepStatement = conn preparedStatement("SELECT * FROM categoria");
                    prepStatement.executeQuery();
                    ResultSet result = prepStatement.getResultSet();
                    while(result.next()){
                        Categoria model = new Categoria();
                        model.setId(result.getInt("id"));
                        model.setNome(result.getString("nome"));
                        list.add(model);
                    }
                }catch (SQLException e){
                    e.printStackTrace();
                }
                return list;
            }
        }

            public int update(Categoria model){
                int linhasAfetadas = 0;

                try(Connection conn = new ConnectionFactory().getConnection()){
                   
                    String sql = "UPDATE categoria SET nome = ? where id = ?";
                    PreparedStatement prepStatement = conn.prepareStatement(sql);
                    prepStatement.setString(1, model.getNome);
                    prepStatement.setInt(2, model.getId());
        
                    prepStatement.execute(sql);
                        
                    linhasAfetadas = prepStatement.getUpdateCount();
                    
                }catch(SQLException e){
                    e.printStackTrace();
                }
                return linhasAfetadas;
            }
        
            public int delete(Categoria model){
                int linhasAfetadas = 0;
                try(Connection conn = new ConnectionFactory().getConnection())
                {
                    Categoria model = new Categoria();
                    model.setId(2);
                    
                    String sql = "DELETED * FROM categoria WHERE id = ?";
        
                    try(PreparedStatement prepstatement = conn.prepareStatement(sql))
                    {
                    prepstatement.setInt(1, model.getId());
                    prepstatement.execute();
                    linhasAfetadas = prepstatement.getUpdateCount();
                
                    }catch(SQLException e){
                    e.printStackTrace();
                    }
                }catch(SQLException e){
                    e.printStackTrace();
                }
                return linhasAfetadas;
    }
}

