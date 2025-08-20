package j42;

import javafx.scene.control.Alert;

public class LoginService {

    FXMLDocumentController controller;

    public LoginService(FXMLDocumentController controller) {
        this.controller = controller;
    }

    public void checkUser() {
        String name = "ram";
        String pass = "ram@123";

        String uName = controller.txtName.getText();
        String uPass = controller.txtPass.getText();

        if (name.equals(uName) && pass.equals(uPass)) {
            Alert al = new Alert(Alert.AlertType.INFORMATION);
            al.setContentText("welcome");
            al.showAndWait();

        } else {
            Alert al = new Alert(Alert.AlertType.ERROR);
            al.setContentText("no user found");
            al.showAndWait();

        }
    }
    
    
    public LoginModel getUser(){
    
        LoginModel data = new LoginModel();
        data.setuName("ram");
        data.setuPass("ram@123");
        
        return data;
    }
}
