/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jd18;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

/**
 *
 * @author thivagar
 */
public class FXMLDocumentController implements Initializable {
    
    private Label label;
    @FXML
    private TextField txtUser;
    @FXML
    private TextField txtPass;
    
    Model data = new Model();
    Service sc ;
    
    @FXML
    public AnchorPane aPane;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        sc = new Service(this);
    }    

    @FXML
    private void btnLoginClicked(ActionEvent event) throws ClassNotFoundException, SQLException, IOException {
        String uname = txtUser.getText();
        String pass = txtPass.getText();
        
        data.setUname(uname);
        data.setPassword(pass);
        
        sc.checkUser(data);
        
    }
    
}
