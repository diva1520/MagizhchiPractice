/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jd18;

import java.io.IOException;
import java.sql.SQLException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Stage;

/**
 *
 * @author thivagar
 */
public class Service {
    
    FXMLDocumentController controller;

    public Service(FXMLDocumentController controller) {
        this.controller=controller;
        
    }
    
    
    
    Dao d= new Dao();
    
    public void checkUser(Model data) throws ClassNotFoundException, SQLException, IOException{
        boolean res = d.checkUser(data);
        
        if(res==true){
            Stage st = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("/home/Home.fxml"));
            Scene sc = new Scene(root);
            st.setScene(sc);
            st.show();
            controller.aPane.getScene().getWindow().hide();
        
        }else{
            Alert al = new Alert(Alert.AlertType.INFORMATION);
            al.setContentText("no user found");
            al.showAndWait();
            
            
        }
    
    }
    
}
