package Review12;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class E9ConfigFile {
    public static void main(String[] args) {
        String path = "Files1/configProperties";

        FileInputStream fis=null;
        try {
            fis = new FileInputStream(path);
            Properties properties=new Properties();
            properties.load(fis);
            System.out.println(properties.getProperty("url"));
      }catch(IOException f) {
            f.printStackTrace();
        }finally{
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
