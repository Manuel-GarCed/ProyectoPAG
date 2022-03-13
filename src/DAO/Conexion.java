/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author carlo
 */
public class Conexion {
    
    protected Connection conexion; 
//JDBC DRIVER MANAGER Y BASE DE DATOS URL
    final String JDBC_DRIVER="org.postgresql.Driver";
    final String DB="ProyectoPAGHeroes";
    final String URL="jdbc:postgresql://localhost:5432/"+DB;
    
//CREDENCIALES DE LA BASE DE DATOS
    final String USER="postgres";
    final String PASS="123"; 

    public void conectar() throws Exception {
        try {
            Connection conexion = DriverManager.getConnection(URL, USER, PASS);
            Class.forName(JDBC_DRIVER);
        } catch (Exception e) {
            throw e;
        }
}
    public void cerrar () throws Exception{
        if (conexion != null) {
            if (!conexion.isClosed()) {
                conexion.close();
            }
        }
    }

}
