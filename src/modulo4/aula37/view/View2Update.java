package modulo4.aula37.view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import modulo4.aula37.utils.Categoria;
import src.modulo4.aula35.utils.ConnectionFactory;

public class View2Update {
    public static void main(String[] args) {
        Categoria model = new Categoria();
        try (Scanner sc = new Scanner(System.in)){
            System.out.printf("\n Digite o id a ser alterado");
            int id = Integer.parseInt(sc.nextLine());
            model.setId(id);

            System.out.printf("\n Digite o nome a ser alterado");
            String nome = sc.nextLine();
            model.setNome(nome);

        } catch (Exception e) {
            System.out.println("Não foi possível ler");
        }
        update(model);
    }

    private static void update(Categoria model){
        try(Connection conn = new ConnectionFactory().getConnection()){
           
            String sql = "UPDATE categoria SET nome = ? where id = ?";
            PreparedStatement prepStatement = conn.prepareStatement(sql);
            prepStatement.setString(1, model.getNome);
            prepStatement.setInt(2, model.getId());

            prepStatement.execute(sql);
                
            int linhasAfetadas = prepStatement.getUpdateCount();
            System.out.println(linhasAfetadas);  
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}
