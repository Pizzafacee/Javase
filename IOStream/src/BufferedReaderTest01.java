import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderTest01 {
    public static void main(String[] args) {
        //带有缓冲区的字符输入流
        //使用这个流的时候不需要定义char或者byte数组
            BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("D:\\eclipse-installer\\configuration\\.metadata\\log.txt"));
            String s = null;
            while ( (s = br.readLine()) != null) {
//                br.readLine();//一读读一行
                System.out.println(s);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (br != null) {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
