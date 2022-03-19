/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import DAO.Conexion;
import java.io.FileInputStream;
import proyectopag.FramePrincipal;

/**
 *
 * @author carlo
 */
public class Form extends javax.swing.JFrame {
    FileInputStream fis;
    int longitudBytes;
    
    Conexion con = FramePrincipal.Conexion;
    
    public Form() {
        initComponents();
    }

    private void initComponents() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
