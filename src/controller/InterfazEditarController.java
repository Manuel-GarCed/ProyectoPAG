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
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author I3
 */
public class InterfazEditarController implements Initializable {

    @FXML
    private Label lblalterego;
    @FXML
    private TextField txtalterego;
    @FXML
    private Label lblprimerapublicacion;
    @FXML
    private TextField txtprimerapublicacion;
    @FXML
    private Label lblpersonajes;
    @FXML
    private TextField txtpersonajes;
    @FXML
    private Label lbid;
    @FXML
    private ComboBox<?> cmbID;
    @FXML
    private Label lbNH;
    @FXML
    private TextField txtNH;
    @FXML
    private Button btnguardar;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void Guardar(ActionEvent event) {
    }
    
}
