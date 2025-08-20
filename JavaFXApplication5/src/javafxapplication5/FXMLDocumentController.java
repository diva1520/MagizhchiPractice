
package javafxapplication5;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class FXMLDocumentController implements Initializable {
    
    @FXML
    public Button button;
    @FXML
    public TextField txtNAme;
    @FXML
    public TextField txtPass;
    
    
   
    Service ser;
    @FXML
    public TableView<Model> tbDetail;
    @FXML
    public TableColumn<Model, String> clName;
    @FXML
    public TableColumn<Model, Integer> clAge;
    @FXML
    public TableColumn<Model, String> clArea;
    @FXML
    public TableColumn<Model, Integer> clID;
    @FXML
    public TableColumn<Model, Long> clPhone;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
         ser = new Service(this);
       ser.addTableData();
    }  
    
     @FXML
    private void handleButtonAction(ActionEvent event) {
       ser.checkUser();
    }
}
