package Review13;

import Utils.ExcelReader;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class EmployeeTester {
    public static void main(String[] args) {
       /* List<Map<String, String>> empData = null;
        try {
            empData = ExcelReader.read(Constants.EMPLOYEE_FILE_PATH, "Sheet1");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        WebDriver driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login%22");

                WebElement userName = driver.findElement(By.xpath("//input[@name='txtUsername']"));
        userName.sendKeys("Admin");
        WebElement password = driver.findElement(By.xpath("//input[@id='txtPassword']"));
        password.sendKeys("Hum@nhrm123");
        WebElement logIn = driver.findElement(By.xpath("//*[@id='btnLogin']"));
        logIn.click();
        WebElement pim = driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']"));
        pim.click();

        for (Map<String, String> map : empData) {
            WebElement addEmp = driver.findElement(By.xpath("//a[@id='menu_pim_addEmployee']"));
            addEmp.click();
            driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys(map.get("FirstName"));
            driver.findElement(By.xpath("//input[@id='middleName']")).sendKeys(map.get("MiddleName"));
            driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys(map.get("LastName"));
        }*/
        try {
        List<Map<String,String>> list = ExcelReader.read("C:\\Users\\olegm\\IdeaProjects\\BroCode\\Files\\HRMSEmployeesDataAsghar.xlsx","Sheet1");
         for(var names:list){
             System.out.println(names);
         }
        System.out.println(list);
        } catch (IOException e) {
            throw new RuntimeException(e);

        }

    }
}




