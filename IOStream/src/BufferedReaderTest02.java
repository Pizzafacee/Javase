import java.io.*;

public class BufferedReaderTest02 {
    public static void main(String[] args) {
        BufferedReader br = null;
        try {
            FileInputStream fis = new FileInputStream("D:\\eclipse-installer\\configuration\\.metadata\\log.txt");
            InputStreamReader isr  = new InputStreamReader(fis);//转换流
            br = new BufferedReader(isr);//这个里面只能传字符流
            String s = null;
            while ((s = br.readLine()) != null) {
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
