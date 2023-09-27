package Class28;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class E1ExcelFile {
    public static void main(String[] args) throws IOException {
        //Creating excelFile
        String path=System.getProperty("user.dir")+"\\Files\\TestExcelFile.xlsx\\";
        FileInputStream fileInputStream=new FileInputStream(path);
        //1) Software 2) Path 3)Store the file

        XSSFWorkbook xssfWorkbook=new XSSFWorkbook();
        Sheet sheet = xssfWorkbook.createSheet("Sheet1");
        Sheet sheet1=xssfWorkbook.getSheet("Sheet1");
        Row row=sheet.createRow(0);
        Cell cell=row.createCell(0);
        Cell cell1=row.createCell(1);
        cell1.setCellValue("Mark");
        cell.setCellValue("Wael");
        //FileOutPutStream is used to create new file and FileInputStream is used to read data from existing file
        FileOutputStream fileOutputStream=new
                FileOutputStream("C:\\Users\\olegm\\IdeaProjects\\BroCode\\Files\\TestExcelFile.xlsx");
        xssfWorkbook.write(fileOutputStream);
























    }
}
