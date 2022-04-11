import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest01 {
    public static void main(String[] args) {
        FileWriter fw = null;
        try {
            fw = new FileWriter("FileWriterTest.txt");
            char[] chars = {'我','是','中','国','人'};
            fw.write(chars);
            fw.write("我是一个神");
            fw.write("神一般的男人");
            fw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

        finally {
            if (fw != null) {
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
