/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package osoitekirjafx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.event.Event;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.Tab;
import javafx.scene.control.TextField;

/**
 *
 * @author Ohjelmistokehitys
 */
public class FXMLDocumentController implements Initializable {
    
    OsoiteModel model = new OsoiteModel();
    OsoiteData osoite = new OsoiteData();
    
    @FXML
    TextField txtEtunimi;
    
    @FXML
    TextField txtSukunimi;

    @FXML
    TextField txtOsoite;

    @FXML
    TextField txtPuhelin;

    @FXML
    TextField txtEmail;
    
    @FXML
    Tab tabBtnSelaa;
    
    @FXML
    Button btnTallenna;
    
    @FXML
    ListView listNimet;

    @FXML
    private void handleSelectionSelaa(Event event) {
        if (tabBtnSelaa.isSelected()) {
            btnTallenna.setVisible(false);
            if (model.numberOfItems() > 0) {
                
            }
            else
                listNimet
        }
        else
            btnTallenna.setVisible(true);
    }
    
    @FXML
    private void handleBtnTallenna(ActionEvent event) {
        osoite.setEtunimi(txtEtunimi.getText());
        osoite.setSukunimi(txtSukunimi.getText());
        osoite.setOsoite(txtOsoite.getText());
        osoite.setPuhelin(txtPuhelin.getText());
        osoite.setEmail(txtEmail.getText());
        model.addToArray(osoite);
    }
    
    @FXML
    private void handleBtnClose(ActionEvent event) {
        Platform.exit();
    }   
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
