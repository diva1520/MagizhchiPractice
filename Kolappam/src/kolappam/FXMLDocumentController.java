/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kolappam;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

/**
 *
 * @author thivagar
 */
public class FXMLDocumentController implements Initializable {
    
    private Label label;
    @FXML
    private Button btSaveRecord;
    @FXML
    private TableView<TableModel> tbDetails;
    @FXML
    private TextField txtId;
    @FXML
    private TextField txtName;
    @FXML
    private TextField txtDoorNo;
    @FXML
    private TextField txtStreet;
    @FXML
    private TextField txtArea;
    @FXML
    private TextField txtCity;
    @FXML
    private TextField txtMobileNumber;
    
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void buttonMouseEntered(MouseEvent event) {
        btSaveRecord.setStyle("-fx-background-color: red");
    }

    @FXML
    private void buttonMouseExited(MouseEvent event) {
        btSaveRecord.setStyle("-fx-background-color: green");
    }

    @FXML
    private void btSaveClicked(ActionEvent event) {
        
        TableModel model = new TableModel();
        model.setId(Integer.parseInt(txtId.getText()));
        model.setName(txtName.getText());
        model.setDoorNo(txtDoorNo.getText());
        model.setStreet(txtStreet.getText());
        model.setArea(txtArea.getText());
        model.setCity(txtCity.getText());
        model.setContactNumber(Long.parseLong(txtMobileNumber.getText()));
        
        tbDetails.getItems().add(model);
    }
    
}
