import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamTest01 {
    public static void main(String[] args) {
            FileInputStream fs = null;
        try {
             fs = new FileInputStream("D:\\eclipse-installer\\configuration\\.metadata\\log.txt");
             /*int readDate = fs.read();//方法的返回值是读取到的字节本身
            readDate = fs.read();
            readDate = fs.read();*/
            while (fs.read() != -1) {
                System.out.print(fs.read());
            }
            //如果读到末尾了，就会返回-1；

//            System.out.println(readDate);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fs != null) {
                }
                fs.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
