package javafxapplication6;

import java.sql.SQLException;
import java.util.List;
import javafx.scene.control.Alert;

public class Service {

    FXMLDocumentController controller;

    DAO d = new DAO();
    Model mo = new Model();

    Service(FXMLDocumentController aThis) {
        controller = aThis;
    }

    
    public void init() throws ClassNotFoundException, SQLException{
    List<Model> lst = d.getUsers();
    
    for(Model data : lst){
    controller.tbDetail.getItems().addAll(data);
    }
    
    }
    
    public void checkUser() throws ClassNotFoundException, SQLException {
        String name = controller.txtUser.getText();
        String pass = controller.txtPass.getText();

        mo.setName(name);
        mo.setPass(pass);

        boolean res = d.user(mo);

        if (res) {
            Alert al = new Alert(Alert.AlertType.INFORMATION);
            al.setContentText("welcome");
            al.showAndWait();
        } else {
            Alert al = new Alert(Alert.AlertType.INFORMATION);
            al.setContentText("no user found");
            al.showAndWait();
        }
    }

}
