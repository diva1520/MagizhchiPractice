/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication5;

import java.util.ArrayList;
import javafx.scene.control.Alert;

public class Service {
    
    FXMLDocumentController controller;

    DAO dao = new DAO();
    
    public Service(FXMLDocumentController controller) {
        this.controller=controller;
    }
    
    public void checkUser(){
    
     String uName = controller.txtNAme.getText();
     String uPass = controller.txtPass.getText();
     
     Model data = dao.user();
     
     
     if(data.getName().equals(uName) && data.getPasswoord().equals(uPass)){
         Alert al = new Alert(Alert.AlertType.INFORMATION);
         al.setContentText("welcome");
         al.showAndWait();
     }else{
         Alert al = new Alert(Alert.AlertType.ERROR);
         al.setContentText("no user found");
         al.showAndWait();
     }
    }
    
    public void addTableData(){
    Model mo = new Model();
    mo.setName("shalini");
    mo.setArea("manamadurai");
    mo.setAge(45);
    mo.setPhno(234567890789l);
    mo.setId(420);
    
    Model mo1 = new Model();
    mo1.setName("raja");
    mo1.setAge(15);
    mo1.setArea("madurai");
    mo1.setId(121);
    mo1.setPhno(2345678);
    
    Model lst[] = {mo,mo1};
    
//    ArrayList<Model> lst = new ArrayList();
//    lst.add(mo);
//    lst.add(mo1);
    
    for(Model data : lst){
    controller.tbDetail.getItems().addAll(data);
    }
    
    
    
    }
    
}
