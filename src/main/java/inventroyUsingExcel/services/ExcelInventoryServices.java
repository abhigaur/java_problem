package inventroyUsingExcel.services;

import inventroyUsingExcel.Utils.ExcelUtil;
import inventroyUsingExcel.models.products;

import java.io.IOException;
import java.util.List;

public class ExcelInventoryServices  implements InventoryServices{
    private final String filePath;
    public ExcelInventoryServices(String filePath) {

        this.filePath = filePath;
    }

    @Override
    public void addProducts(products prod) {

        ExcelUtil.addOrUpdate();

    }

    @Override
    public void purchaseProducts(String productID, int quantity) throws IOException {

        ExcelUtil.purchaseProduct(filePath, quantity, productID);

    }

    @Override
    public List<products> showInventory() throws IOException {
        return ExcelUtil.readInventroy(filePath);
    }
}
