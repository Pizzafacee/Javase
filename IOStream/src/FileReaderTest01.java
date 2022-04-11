import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest01 {
    //直接读取普通文本
    public static void main(String[] args) {
        FileReader fr = null;
        try {
            fr = new FileReader("D:\\eclipse-installer\\configuration\\.metadata\\log.txt");
            char[] chars = new char[8];
            int readCount = 0;
            while (readCount != -1) {
                readCount = fr.read(chars);
               String s = new String(chars,0,readCount);
                System.out.print(s);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (fr != null) {
            try {
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
