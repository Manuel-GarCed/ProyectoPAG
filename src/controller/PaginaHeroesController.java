/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.Conexion;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author carlo
 */
public class PaginaHeroesController implements Initializable {
    
    @FXML
    private VBox VboxHeroes;
    @FXML
    private Pane PaneBusqueda;
    @FXML
    private Label labelHERO;
    @FXML
    private TextField TextFBusc;
    @FXML
    private Button BtnBuscar;
    @FXML
    private HBox HboxHeroes;
    @FXML
    private TilePane TilePHeroes;
    @FXML
    private ImageView FlechaVerde;
    @FXML
    private ImageView Batman;
    @FXML
    private ImageView Superman;
    @FXML
    private ImageView Spiderman;
    @FXML
    private ImageView Iroman;
    @FXML
    private ImageView CapitanAmerica;
    @FXML
    private ImageView Deadpool;
    @FXML
    private ImageView Constantine;
    @FXML
    private ImageView ViudaNegra;
    @FXML
    private ScrollPane ScroballPag;
    @FXML
    private ImageView FLASH;
    @FXML
    private ImageView BRUJA_ESCARLATA;
    @FXML
    private Button btneditar;
    

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
        @FXML
    private void eventAction(ActionEvent event) {
        btneditar.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                
             Stage stage = new Stage();
                        Parent root = null;
                 try {
                    root = FXMLLoader.load(getClass().getResource("/interfaz/InterfazEditar.fxml"));
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
                    } catch (IOException ex) {
                     JOptionPane.showMessageDialog(null, "");
                    }
            }
        });
    }
     @FXML
     private void eventActionBuscar(ActionEvent event) {
        BtnBuscar.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
            }
        });
     }
     
     public static void buscar (String bus){
         
     }
}
