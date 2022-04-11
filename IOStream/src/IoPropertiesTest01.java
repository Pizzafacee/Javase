import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

//IO和
public class IoPropertiesTest01 {
    public static void main(String[] args) {
        FileReader reader = null;
        try {
            reader = new FileReader("C:\\Users\\pizza\\IdeaProjects\\javase\\IOStream\\src\\File.properties");
            Properties pro = new Properties();
            pro.load(reader);
            String user = pro.getProperty("user");
            String password = pro.getProperty("password");
            System.out.println(user + password);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (reader != null) {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
