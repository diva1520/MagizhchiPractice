/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package screen2;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;

/**
 * FXML Controller class
 *
 * @author thivagar
 */
public class Screen2FXMLController implements Initializable {

    @FXML
    private ComboBox<String> cbGender;
    @FXML
    private Label lblCB;

    
    String [] gen ={"male","female","others"};
    @FXML
    private RadioButton rMAle;
    @FXML
    private RadioButton rFemale;
    @FXML
    private RadioButton rOthers;
    @FXML
    private DatePicker dpDate;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
        for(String data : gen){
        cbGender.getItems().addAll(data);
        }
    }    

    @FXML
    private void bcClicked(ActionEvent event) {
        String opt = cbGender.getSelectionModel().getSelectedItem();
        lblCB.setText(opt);
        
    }

    @FXML
    private void rMaleClicked(ActionEvent event) {
        
        if(rMAle.isSelected()){
        rFemale.setSelected(false);
        rOthers.setSelected(false);
        }
        
    }

    @FXML
    private void rFemaleClicked(ActionEvent event) {
        if(rFemale.isSelected()){
        rMAle.setSelected(false);
        rOthers.setSelected(false);
        }
    }

    @FXML
    private void rOthersClicked(ActionEvent event) {
        if(rOthers.isSelected()){
        rMAle.setSelected(false);
        rFemale.setSelected(false);
        }
    }

    @FXML
    private void submmitClicked(ActionEvent event) {
        String gender = null ;
        
        if(rMAle.isSelected()){
        gender = rMAle.getText();
        }else if(rFemale.isSelected()){
        gender = rFemale.getText();
        }
        else if(rOthers.isSelected()){
        gender = rOthers.getText();
        }
        
        System.out.println("selected gender :: "+gender);
        
        
        LocalDate dt = dpDate.getValue();
        
        System.out.println("selected date :: "+dt);
    }
    
}
