package inventroyUsingExcel.services;

import inventroyUsingExcel.models.products;

import java.io.IOException;
import java.util.List;

public interface InventoryServices {

     void addProducts(products products);
     void purchaseProducts(String productID,int quantity) throws IOException;
     List<products> showInventory() throws IOException;

}
