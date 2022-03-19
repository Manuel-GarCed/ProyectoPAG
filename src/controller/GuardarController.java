/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

/**
 * FXML Controller class
 *
 * @author carlo
 */
public class GuardarController implements Initializable {

    @FXML
    private VBox VboxBP;
    @FXML
    private HBox HBoxVB;
    @FXML
    private Label lblHDM1;
    @FXML
    private ImageView Img;
    @FXML
    private Label lblN;
    @FXML
    private TextField txtN;
    @FXML
    private Label lblAlt;
    @FXML
    private TextField txtB11;
    @FXML
    private Label lblPP;
    @FXML
    private TextField txtB12;
    @FXML
    private Label lblP;
    @FXML
    private TextField txtB14;
    @FXML
    private Button btnGuardar;
    @FXML
    private Button btnAgImg;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void guardarBD(ActionEvent event) {
    }

    @FXML
    private void AgregarImg(ActionEvent event) {
    }
    
}
