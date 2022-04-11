import java.io.*;

public class BufferedWriterTest {
    public static void main(String[] args) {
        BufferedWriter bw = null;
        try {
            //bw = new BufferedWriter(new FileWriter("BufferedWriterTest"));
            bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("BufferedWriterTest")));
            bw.write("人生不如意时常八九");
            bw.write("可与人说二三");
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
