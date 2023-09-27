package Class28;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class E6Exception {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new
                    FileInputStream("C:\\Users\\olegm\\IdeaProjects\\BroCode\\Files\\Employees (1).xlsx");
        }catch(FileNotFoundException foundException){
            System.out.println("the file you are trying to read is not found on the address specified");
        }
        System.out.println("Line6");
        // if we have a try catch block we guarantee that the rest of the code will be executed, in this case:
        //System.out.println("Line6");
    }
}
