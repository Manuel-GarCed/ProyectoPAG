/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.stage.Window;
import javafx.stage.WindowEvent;
import javax.swing.JOptionPane;
import model.UserDAO;

/**
 * FXML Controller class
 *
 * @author I3
 */
public class InterfazInicioSesionController implements Initializable {

    private UserDAO model = new UserDAO();

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


    private void btninicioOnAction(ActionEvent e) {

        if (!textuser.getText().isEmpty() == false && !textcontra.getText().isEmpty() == false) {
            String user = textuser.getText();
            String pass = textcontra.getText();

            int state = model.login(user, pass);
        }

    }

    private void loadStage(String url, Event event) {

        try {

            //((Node)(event.getSource())).getScene().getWindow().hide();    
            Object eventSource = event.getSource();
            Node sourceAsNode = (Node) eventSource;
            Scene oldScene = sourceAsNode.getScene();
            Window window = oldScene.getWindow();
            Stage stage = (Stage) window;
            stage.hide();

            Parent root = FXMLLoader.load(getClass().getResource(url));
            Scene scene = new Scene(root);
            Stage newStage = new Stage();
            newStage.setScene(scene);
            newStage.show();

            newStage.setOnCloseRequest(new EventHandler<WindowEvent>() {
                @Override
                public void handle(WindowEvent event) {
                    Platform.exit();
                }
            });

        } catch (IOException ex) {
            Logger.getLogger(InterfazInicioSesionController.class.getName()).log(Level.SEVERE, null, ex);
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
