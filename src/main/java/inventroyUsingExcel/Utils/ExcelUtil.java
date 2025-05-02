package inventroyUsingExcel.Utils;

import builderDesignPattern.Products;
import inventroyUsingExcel.models.products;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ExcelUtil {


    public static List<products> readInventroy(String filePath) throws IOException {

        List<products> prod = new ArrayList();
        FileInputStream fis = new FileInputStream(filePath);

        Workbook wb = new XSSFWorkbook(fis);
        Sheet sheet = wb.getSheetAt(0);
        for (Row row : sheet) {
            if (row.getRowNum() == 0) {
                continue;
            }

            products p = new products(
                    row.getCell(0).getStringCellValue(),
                    row.getCell(1).getStringCellValue(),
                    (int) row.getCell(2).getNumericCellValue(),
                    row.getCell(3).getNumericCellValue());
            prod.add(p);


        }
        return prod;
    }


    public static void addOrUpdate() {

    }

    public static void purchaseProduct(String file, int quantity, String productID) throws IOException {
        try (FileInputStream fis = new FileInputStream(file);
             Workbook workbook = new XSSFWorkbook(fis)) {

            Sheet sheet = workbook.getSheetAt(0);

            for (Row row : sheet) {
                if (row.getRowNum() == 0) {
                    continue;
                }
                if (row.getCell(0).getStringCellValue() == productID) {
                    int currentQuantity = (int) row.getCell(2).getNumericCellValue();
                    if (currentQuantity <= quantity) {
                        row.getCell(0).setCellValue(0);
                    } else {
                        row.getCell(0).setCellValue(currentQuantity - quantity);
                    }
                    break;
                }
            }
            try (FileOutputStream fos = new FileOutputStream(file)) {
                workbook.write(fos);
            }
        }

    }
}