import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

public class PrintStreamTest {
    public static void main(String[] args) {
        //标准字节输出流，默认输出到控制台标准输出流不需要关闭

        System.out.println("HelloWorld");
        PrintStream ps = System.out;
        ps.println("hello wangkang");;
        ps.println("hello zhngsan");
        ps.println("hangshi");
        //改变标准输出流的输出方向
        try {
            PrintStream ps2 = new PrintStream(new FileOutputStream("Log_PrintStreamTest"));
            //修改输出方向，往文件中输出
            //这个就是日志框架的原理

            System.setOut(ps2);
            ps2.println("-----------");
            ps2.println("zheshiyige");
            ps2.println("网站");
            ps2.println("的世界");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
