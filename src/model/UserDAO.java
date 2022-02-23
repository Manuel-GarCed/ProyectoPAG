package model;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class UserDAO {

    public int login (String user, String password) {
        String BD = "jdbc:postgresql://localhost:5432/proyectoPagHeroes";
        String usuariou = "postgres";
        String contrasenhac = "123";
        PreparedStatement pst;
        ResultSet rs;
        int state = -1;

        try {
            Connection connection = DriverManager.getConnection(BD, user, password);

            if (connection != null) {

                String sql = "SELECT * FROM usuarios WHERE BINARY usuario=? AND contrasenha=AES_ENCRYPT(?, 'key')";

                pst = connection.prepareStatement(sql);
                pst.setString(1, user);
                pst.setString(2, password);

                rs = pst.executeQuery();

                if (rs.next()) {
                    state = 1;
                } else {
                    state = 0;
                }

            } else {
                JOptionPane.showMessageDialog(null, "Hubo un error al conectarse con la base de datos", "ERROR", JOptionPane.ERROR_MESSAGE);
            }

            JOptionPane.showMessageDialog(null, "Base de datos conectada con éxito");
        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Hubo un error de ejecución, posibles errores:\n"
                    + ex.getMessage());
        } finally {

            try {
                
                if (connection != null) {
                    DriverManager.getConnection().closeConnection(connection);
                }
            } catch (SQLException ex) {
                System.err.println(ex.getMessage());
            }

        }

        return state;
    }
        
}     //return state;
    
    /*
    public int login (String user, String password){
        
        Connection connection = null;
        PreparedStatement pst;
        ResultSet rs;
        int state = -1;

        try{
            
            connection = ConnectionPoolMySQL.getInstance().getConnection();
            
            if(connection!=null){
                
                String sql = "SELECT * FROM usuarios WHERE BINARY user=? AND pass=AES_ENCRYPT(?, 'key')";
                
                pst = connection.prepareStatement(sql);
                pst.setString(1, user);
                pst.setString(2, password);
                
                rs = pst.executeQuery();
                
                if(rs.next()){
                    state = 1;
                }else{
                    state = 0;
                }
                
            }else{
                JOptionPane.showMessageDialog(null, "Hubo un error al conectarse con la base de datos", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
            
        }catch(HeadlessException | SQLException ex){
            JOptionPane.showMessageDialog(null, "Hubo un error de ejecución, posibles errores:\n"
                                              + ex.getMessage());
        }finally{
            
            try{
                if(connection != null){
                    ConnectionPoolMySQL.getInstance().closeConnection(connection);            
                }            
            }catch(SQLException ex){
                System.err.println(ex.getMessage());            
            }

        }
        
        
        return state;
        
    }*/
    
    
//}
