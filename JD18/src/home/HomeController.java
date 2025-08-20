/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package home;

import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

/**
 * FXML Controller class
 *
 * @author thivagar
 */
public class HomeController implements Initializable {

    @FXML
    public TableView<StPojo> tbDetails;
    @FXML
    public TableColumn<StPojo, String> clName;
    @FXML
    public TableColumn<StPojo, String> clArea;
    @FXML
    public TableColumn<StPojo, Integer> clPhone;

    StuService service;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
     service = new StuService(this);
        try {
            service.setTb();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(HomeController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(HomeController.class.getName()).log(Level.SEVERE, null, ex);
        }
    } 
    
    
   
    
}
