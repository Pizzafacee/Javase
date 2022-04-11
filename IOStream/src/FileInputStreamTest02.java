import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest02 {
    public static void main(String[] args) {
        FileInputStream fs = null ;
        try {
            fs = new FileInputStream("D:\\eclipse-installer\\configuration\\.metadata\\log.txt");
           /* byte[] bytes = new byte[fs.available()];
            int readCount = fs.read(bytes);
            String s = new String(bytes,0,readCount);
            System.out.println(s);*/

            //或者采用循环
            byte[] bytes = new byte[6];

            int readCount = 0 ;
            while (readCount != -1) {
                readCount = fs.read(bytes);
                String str = new String(bytes,0,readCount);
                System.out.print(str);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fs != null) {
                try {
                    fs.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
