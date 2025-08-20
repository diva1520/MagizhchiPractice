/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication6;

import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

/**
 *
 * @author thivagar
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    public Button button;
    @FXML
    public TextField txtUser;
    @FXML
    public TextField txtPass;
     
    Service ser;
    @FXML
    public TableView<Model> tbDetail;
    @FXML
    public TableColumn<Model, String> clName;
    @FXML
    public TableColumn<Model, String> clPass;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       ser = new Service(this);
        try {
            ser.init();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    

    @FXML
    private void login(ActionEvent event) throws ClassNotFoundException, SQLException {
        ser.checkUser();
    }
    
}
