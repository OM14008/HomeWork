package Class27;

import Utils.Constants;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class E4ExcelReader {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream=new FileInputStream(Constants.EXCEL_FILE_PATH);
        //Special class which knows how to read data from excelFiles;
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);
        Sheet sheet = xssfWorkbook.getSheet("Sheet1");

        int rowSize=sheet.getPhysicalNumberOfRows();
        for (int rows = 0; rows < rowSize; rows++) {
            Row row = sheet.getRow(rows);
            int colSize=row.getPhysicalNumberOfCells();
            for (int column = 0; column < colSize; column++) {
                System.out.print(row.getCell(column)+" ");
            }
            System.out.println();
        }









    }
}
