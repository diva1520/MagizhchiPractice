 
package javafxapplication1;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class FXMLDocumentController implements Initializable {
    
    private Label label;
    @FXML
    private TextField TXTnAME;
    @FXML
    private TextField txtPass;
    @FXML
    private Label lbleMsg;
    @FXML
    private AnchorPane aPane1;
    
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        System.out.println("hii im init");
    }    

    @FXML
    private void loginClicked(ActionEvent event) throws IOException {
        
        String uname = "ram";
        String pass = "ram@123";
        
        String name = TXTnAME.getText();
        String password = txtPass.getText();
        
        
        if(uname.equals(name) && pass.equals(password)){
            lbleMsg.setText("welcome");
            
            Stage st = new Stage();
            
            Parent root = FXMLLoader.load(getClass().getResource("/screen2/Screen2FXML.fxml"));
            
            Scene sc = new Scene(root);
            st.setScene(sc);
            st.show();
            aPane1.getScene().getWindow().hide();
            
        }else{
            Alert al = new Alert(Alert.AlertType.INFORMATION);
            al.setContentText("no user found...");
            al.showAndWait();
        
        }
        
        System.out.println("user name :: "+name);
        System.out.println("password  :: "+password);
    }
    
}
