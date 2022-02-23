/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.*;

/**
 *
 * @author I3
 */
public class ConnectionPoolPostgres {

     private final String DB="ProyectoPAGHeroes";
    private final String URL="jdbc:postgresql://localhost:5432/"+DB;
    private final String USER="postgres";
    private final String PASS="123";
    
    private static ConnectionPoolPostgres dataSource;
    private BasicDataSource basicDataSource=null;
    
    private ConnectionPoolPostgres(){
     
        basicDataSource = new BasicDataSource();
        basicDataSource.setDriverClassName("org.postgresql.Driver");
        basicDataSource.setUsername(USER);
        basicDataSource.setPassword(PASS);
        basicDataSource.setUrl(URL);
        
        basicDataSource.setMinIdle(5);
        basicDataSource.setMaxIdle(20);
        basicDataSource.setMaxTotal(50);
        basicDataSource.setMaxWaitMillis(-1);
        
    }
    
    public static ConnectionPoolPostgres getInstance() {
        if (dataSource == null) {
            dataSource = new ConnectionPoolPostgres();
            return dataSource;
        } else {
            return dataSource;
        }
    }

    public Connection getConnection() throws SQLException{
      return this.basicDataSource.getConnection();
    }
    
    public void closeConnection(Connection connection) throws SQLException {
        connection.close();
    }    
    
    
    
}