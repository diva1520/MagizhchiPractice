
package j42;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author thivagar
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    public Label label;
    @FXML
    public Button button;
    @FXML
    public TextField txtName;
    @FXML
    public TextField txtPass;
    
    LoginService service ;
    @FXML
    private Button button1;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       service = new LoginService(this);
    }    

    @FXML
    private void login(ActionEvent event) {
      service.checkUser();
    }

    @FXML
    private void getUser(ActionEvent event) {
        LoginModel data = service.getUser();
        txtName.setText(data.getuName());
        txtPass.setText(data.getuPass());
    }
    
}
