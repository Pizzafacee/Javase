import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyTest01 {
    public static void main(String[] args) {
        //做一个文件的复制
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream("D:\\检测标准2\\迅雷下载\\DASD-521\\DASD-521.mp4");
            fos = new FileOutputStream("D:\\检测标准2\\迅雷下载\\DASD-521\\DASD-522.mp4");
            byte[] bytes = new byte[1024*1024];
            int readCount = 0;
            while (readCount != -1) {
                readCount = fis.read(bytes);
                fos.write(bytes,0,readCount);

            }
        fos.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } if (fis != null) {
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
