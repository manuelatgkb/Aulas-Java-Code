package src.modulo4.ATP50;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.sql.DataSource;

import src.modulo4.aula33.utils.ComboPooleDataSource;

public class ConnectionFactory {
    private String url;
    private String user;
    private String password;
    private DataSource dataSource;

public ConnectionFactory(){
    this.url = "jdbc:postgresql://localhost:5432/postgres";
    this.user = "postgres";
    this.password = "123456";
    ComboPooleDataSource pool = new ComboPooleDataSource();
    pool.setjdbcURL(this.url);
    pool.setUser(this.user);
    pool.setPassword(this.password);
    pool.setMaxPoolSize(10);
    this.dataSource = pool;

}

        public Connection getConnection() throws SQLException{
            return DriverManager.getConnection(this.url, this.user, this.password);
    }
}
