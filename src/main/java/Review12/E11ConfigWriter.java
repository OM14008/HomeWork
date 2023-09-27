package Review12;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class E11ConfigWriter {

    public static void main(String[] args) throws IOException {
        String path="Files1/TestWriterProperties";
        Properties properties=new Properties();
        properties.setProperty("Name","Vlad");
        FileOutputStream fos=new FileOutputStream(path);
        properties.store(fos,"adding a name");

    }
}
