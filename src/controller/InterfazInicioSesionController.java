/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.Conexion;
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
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.stage.Window;
import javafx.stage.WindowEvent;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author carlo
 */
public class InterfazInicioSesionController implements Initializable {

    private Conexion cn = new Conexion();
    
    @FXML
    private BorderPane borderPLogin;
    @FXML
    private ImageView imgComic;
    @FXML
    private AnchorPane AP;
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
    @FXML
    private ImageView imgLogin;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

  @FXML
    private void eventAction(ActionEvent eventAction) {
        btninicio.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent eventAction) {
                try {
                    Conexion cn = new Conexion();
                    String u = textuser.getText();
                    String p = textcontra.getText();
                    cn.conectar();

                    String sql = "SELECT id, usuario FROM \"usuarios\" WHERE usuario = '" + u + "' AND contrasenha = '" + p + "'";
                    cn.resultado = cn.sentencia.executeQuery(sql);
                    if (cn.resultado.next()) {
                        Stage stage = new Stage();
                        Parent root = FXMLLoader.load(getClass().getResource("/interfaz/PaginaHeroes.fxml"));
                        Scene scene = new Scene(root);
                        stage.setOnCloseRequest(new EventHandler<WindowEvent>() {
                            @Override
                            public void handle(WindowEvent e) {
                                Platform.exit();
                                System.exit(0);
                            }

                        });
                        stage.setScene(scene);
                        stage.show();
                        //Ocultar login
                        ((Node)(eventAction.getSource())).getScene().getWindow().hide();
                    } else {
                        JOptionPane.showMessageDialog(null, "Usuario o Contraseña incorrectos");
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e.getMessage());

                }
            }
        });
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
            Logger.getLogger(InterfazInicioSesionController.class.getName()).log(Level.SEVERE,
                    null, ex);
        }
    }
}

