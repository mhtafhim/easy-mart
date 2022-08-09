/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easy.mart.items;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import easy.mart.items.*;

/**
 *
 * @author Tafhim
 */
public class mysqlconnect {
    
    Connection conn = null;
    
    public Connection connectDB() throws SQLException
    {
        try {
            Class.forName("com.mysql.jbdc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/itemlist");
            System.out.println("Connection Established");
            
            return conn;
                    } catch (ClassNotFoundException ex) {
            Logger.getLogger(mysqlconnect.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    
    public ObservableList<itemModel> getItemList() throws SQLException {
        String sql = "SELECT * FROM itemtable";
        ObservableList<itemModel> list = FXCollections.observableArrayList();
        try {
            connectDB();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                
                list.add(new itemModel(rs.getString("itemCodeInTable"),rs.getString("itemDescriptionInTable"),rs.getString("itemPackSizeInTable"),Integer.parseInt(rs.getString("itemCodeInTable")),rs.getString("itemBatchInTable"),rs.getString("itemUnitPriceInTable")));
            }
            rs.close();
            conn.close();
        } catch (SQLException ex) {
        }
        System.out.print(list.size());
        return list;
    }

    
}
