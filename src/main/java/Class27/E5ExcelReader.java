package Class27;

import Utils.Constants;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class E5ExcelReader {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream=new FileInputStream(Constants.EXCEL_FILE_PATH);
        //Special class which knows how to read data from excelFiles;
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);
        Sheet sheet = xssfWorkbook.getSheet("Sheet1");
        List<Map<String,String>>excelData=new ArrayList<>();
        Row headerRow= sheet.getRow(0);
        for (int rows = 1; rows < sheet.getPhysicalNumberOfRows(); rows++) {
            Row row = sheet.getRow(rows);

            Map<String,String>rowMap=new HashMap<>();
            for (int column = 0; column < row.getPhysicalNumberOfCells(); column++) {
                String key=headerRow.getCell(column).toString();
                String value=row.getCell(column).toString();
                rowMap.put(key,value);
            }
            excelData.add(rowMap);
        }
        System.out.println(excelData);









    }
}
