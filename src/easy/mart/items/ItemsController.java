/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easy.mart.items;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Tafhim
 */
public class ItemsController implements Initializable {

    @FXML
    private TextField itemDescription;
    @FXML
    private TextField itemCode;
    @FXML
    private TextField packSize;
    @FXML
    private TextField quantityOnHand;
    @FXML
    private TextField batchID;
    @FXML
    private TextField unitPrice;
    @FXML
    private Button addItemButton;
    @FXML
    private Button searchItemButton;
    @FXML
    private Button deleteItemButton;
    @FXML
    private Button updateItemButton;
    @FXML
    private TableView<?> itemTable;
    @FXML
    private TableColumn<?, ?> itemCodeInTable;
    @FXML
    private TableColumn<?, ?> itemDescriptionInTable;
    @FXML
    private TableColumn<?, ?> itemPackSizeInTable;
    @FXML
    private TableColumn<?, ?> itemQuantityInTable;
    @FXML
    private TableColumn<?, ?> itemBatchInTable;
    @FXML
    private TableColumn<?, ?> itemUnitPriceInTable;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void addItemButtonAction(ActionEvent event) {
    }

    @FXML
    private void searchItemButtonAction(ActionEvent event) {
    }

    @FXML
    private void deleteItemButtonAction(ActionEvent event) {
    }

    @FXML
    private void updateItemButtonAction(ActionEvent event) {
    }
    
}
