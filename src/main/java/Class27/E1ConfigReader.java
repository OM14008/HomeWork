package Class27;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class E1ConfigReader {
    public static void main(String[] args) throws IOException {
        //System.getProperty("user.dir") =>it gives you the path to your project
        String path=System.getProperty("user.dir")+"\\Files\\Config.properties";
        //Brings the data from the file in the form of bytes
        FileInputStream fis=new FileInputStream(path);
        Properties prop=new Properties();
        prop.load(fis);
        System.out.println(prop.getProperty("userName"));

    }
}
