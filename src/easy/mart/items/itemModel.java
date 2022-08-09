
package easy.mart.items;

import javafx.beans.property.SimpleStringProperty;

public class itemModel {

    private String itemDescription;

    private String itemCode;

    private String packSize;

    private int quantityOnHand;

    private String batchID;

    private String unitPrice;

    public itemModel(String itemDescription, String itemCode, String packSize, int quantityOnHand, String batchID, String unitPrice) {
        this.itemDescription = itemDescription;
        this.itemCode = itemCode;
        this.packSize = packSize;
        this.quantityOnHand = quantityOnHand;
        this.batchID = batchID;
        this.unitPrice = unitPrice;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getPackSize() {
        return packSize;
    }

    public void setPackSize(String packSize) {
        this.packSize = packSize;
    }

    public int getQuantityOnHand() {
        return quantityOnHand;
    }

    public void setQuantityOnHand(int quantityOnHand) {
        this.quantityOnHand = quantityOnHand;
    }

    public String getBatchID() {
        return batchID;
    }

    public void setBatchID(String batchID) {
        this.batchID = batchID;
    }

    public String getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(String unitPrice) {
        this.unitPrice = unitPrice;
    }
    
    

   
 
}
