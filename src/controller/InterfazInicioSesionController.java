/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.VBox;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author I3
 */
public class InterfazInicioSesionController implements Initializable {

    @FXML
    private VBox vboxprincipal;
    @FXML
    private Label labelinicio;
    @FXML
    private VBox vboxcampos;
    @FXML
    private Label labelusuario;
    @FXML
    private TextField textuser;
    @FXML
    private Label labelcontra;
    @FXML
    private PasswordField textcontra;
    @FXML
    private Button btninicio;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void eventKey(KeyEvent event) {
        Object evt = event.getSource();
        
        if(evt.equals(textuser)){            
            if(event.getCharacter().equals(" ")){
                event.consume();
            }            
        }else if(evt.equals(textcontra)){
            if(event.getCharacter().equals(" ")){
                event.consume();
            }            
        }
        
    }               

    @FXML
    private void eventAction(ActionEvent event) {
        
        Object evt = event.getSource();
        
        if(evt.equals(btninicio)){
            if(!textuser.getText().isEmpty() && !textcontra.getText().isEmpty()){
                
                String user = textuser.getText();
                String pass = textcontra.getText();
                
            }else{
                JOptionPane.showMessageDialog(null, "Error al iniciar sesión, datos de acceso incorrectos", 
                                                            "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
            }
        }
        
    }
    
}
