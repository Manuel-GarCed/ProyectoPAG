/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author carlo
 */
public class Conexion {
    
    public Connection conexion;
    public Statement sentencia;
    public ResultSet resultado;

//JDBC DRIVER MANAGER Y BASE DE DATOS URL
    final String JDBC_DRIVER="org.postgresql.Driver";
    final String DB="ProyectoPAGHeroes";
    final String URL="jdbc:postgresql://localhost:5432/"+DB;
    
//CREDENCIALES DE LA BASE DE DATOS
    final String USER="postgres";
    final String PASS="123"; 

    public void conectar() throws Exception {
        try {
            Connection cn = DriverManager.getConnection(URL, USER, PASS);
            Class.forName(JDBC_DRIVER);
            sentencia = cn.createStatement();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), 
                    "Error ", JOptionPane.ERROR_MESSAGE);;
        }
}
    public void cerrar () throws Exception{
        try {
            if (conexion != null) {
                if (sentencia != null) {
                    sentencia.close();
                }
                conexion.close();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            System.exit(1);
        }
    }

    public Connection getConnection() {
        return conexion;
    }
}