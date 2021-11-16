package modulo4.aula37.view.dao;

public class CategoriaDao {
    public static void main(String[] args) {
        private static void insert(Categoria model){
            try(Connection conn = new ConnectionFactory().getConnection()){
                
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
    }
}
