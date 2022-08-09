/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easy.mart.items;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

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
    private TableView<itemModel> itemTable;
    @FXML
    private TableColumn<itemModel, String> itemCodeInTable;
    @FXML
    private TableColumn<itemModel, String> itemDescriptionInTable;
    @FXML
    private TableColumn<itemModel, String> itemPackSizeInTable;
    @FXML
    private TableColumn<itemModel, Integer> itemQuantityInTable;
    @FXML
    private TableColumn<itemModel, String> itemBatchInTable;
    @FXML
    private TableColumn<itemModel, String> itemUnitPriceInTable;

    ObservableList<itemModel> observableList = null;

    int index = -1;

    Connection conn;
    
    PreparedStatement pstm = null;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        System.out.println("check 1");
        buildTableAndData();
        
        System.out.println("check 1");

    }

    @FXML
    private void addItemButtonAction(ActionEvent event) {
        System.out.println("add button worked");
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

    public ObservableList<itemModel> getItemList() throws SQLException {
        String sql = "SELECT * FROM itemtable";
        ObservableList<itemModel> list = FXCollections.observableArrayList();
        try {
            Class.forName("com.mysql.jbdc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/itemlist");
            System.out.println("Connection established");
             System.out.println("check 4");

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {

                list.add(new itemModel(rs.getString("itemCodeInTable"), rs.getString("itemDescriptionInTable"), rs.getString("itemPackSizeInTable"), Integer.parseInt(rs.getString("itemCodeInTable")), rs.getString("itemBatchInTable"), rs.getString("itemUnitPriceInTable")));
            }
            rs.close();
            conn.close();
        } catch (SQLException ex) {
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ItemsController.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.print(list.size());
        return list;
    }

    private void buildTableAndData() {
        itemCodeInTable.setCellValueFactory(new PropertyValueFactory<itemModel, String>("itemCode"));
        itemDescriptionInTable.setCellValueFactory(new PropertyValueFactory<itemModel, String>("itemDescription"));
        itemPackSizeInTable.setCellValueFactory(new PropertyValueFactory<itemModel, String>("packSize"));
        itemQuantityInTable.setCellValueFactory(new PropertyValueFactory<itemModel, Integer>("quantityOnHand"));
        itemBatchInTable.setCellValueFactory(new PropertyValueFactory<itemModel, String>("batchID"));
        itemUnitPriceInTable.setCellValueFactory(new PropertyValueFactory<itemModel, String>("unitPrice"));
         System.out.println("check 2");

        try {
            observableList = getItemList();
            itemTable.setItems(observableList);
             System.out.println("check 3");
        } catch (SQLException ex) {
            Logger.getLogger(ItemsController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
