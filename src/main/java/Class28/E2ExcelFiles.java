package Class28;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class E2ExcelFiles {
    public static void main(String[] args) throws IOException {
        String path="Files/Employees (1).xlsx";
        //we use  FileInputStream, so we don't lose the data from the list we are adding data to
        FileInputStream fileInputStream=new FileInputStream(path);
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);
        Sheet sheet=xssfWorkbook.getSheet("Sheet1");
        Row row=sheet.createRow(5);
        row.createCell(0).setCellValue("Moncef");
        row.createCell(1).setCellValue("Leo");
        row.createCell(2).setCellValue("Anna");
        //Creates an empty file
        FileOutputStream fileOutputStreamStream1=new FileOutputStream(path);
        // data is written to that file;
        xssfWorkbook.write(fileOutputStreamStream1);
    }
}
