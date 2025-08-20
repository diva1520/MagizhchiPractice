/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package combo.demo;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

/**
 *
 * @author thivagar
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Label label;
    @FXML
    private ComboBox<String> cbGender;

    String[] gen = {"male", "female", "others"};
    @FXML
    private TextField txtName;
    @FXML
    private TextField txtArea;
    @FXML
    private RadioButton rApple;
    @FXML
    private RadioButton rBeet;
    @FXML
    private RadioButton rCarrot;
    @FXML
    private CheckBox cBike;
    @FXML
    private CheckBox cCar;
    @FXML
    private CheckBox cLorry;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        for (String temp : gen) {
            cbGender.getItems().addAll(temp);
        }
    }

    @FXML
    private void Clicked(ActionEvent event) {
        System.out.println(txtName.getText());
        System.out.println(txtArea.getText());
        String gender = cbGender.getSelectionModel().getSelectedItem();
        String fruit = null;
        if (rApple.isSelected()) {
            fruit = rApple.getText();
        } else if (rBeet.isSelected()) {
            fruit = rBeet.getText();
        } else if (rCarrot.isSelected()) {
            fruit = rCarrot.getText();
        }
        
        System.out.println("fruit  :: "+fruit);
        System.out.println("gender :: "+gender);
        
       
    }

    @FXML
    private void RappClicked(ActionEvent event) {
        if (rApple.isSelected()) {
            rBeet.setSelected(false);
            rCarrot.setSelected(false);
        }
    }

    @FXML
    private void rBeetClicked(ActionEvent event) {
        if (rBeet.isSelected()) {
            rApple.setSelected(false);
            rCarrot.setSelected(false);
        }
    }

    @FXML
    private void rCarrotClicked(ActionEvent event) {
        if (rCarrot.isSelected()) {
            rApple.setSelected(false);
            rBeet.setSelected(false);
        }
    }

}
