package inventroyUsingExcel;

import inventroyUsingExcel.Utils.ExcelUtil;
import inventroyUsingExcel.models.products;
import inventroyUsingExcel.services.ExcelInventoryServices;
import inventroyUsingExcel.services.InventoryServices;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public class InventoryManager {

    public static void main(String[] args) throws IOException {

        String excelPath = "C:\\Users\\abhil\\Desktop\\inventory.xlsx";
        System.out.println("file found");
        InventoryServices inventory = new ExcelInventoryServices(excelPath);
        List<products> test = inventory.showInventory();
        System.out.println("first time"+test);
         inventory.purchaseProducts("test1", 1);
        List<products> test1 = inventory.showInventory();
        System.out.println("second time "+test1);




    }



}
