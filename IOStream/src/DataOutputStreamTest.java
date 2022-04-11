import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamTest {
    public static void main(String[] args) {
            DataOutputStream dos = null;
        try {
            dos = new DataOutputStream(new FileOutputStream("DataStreamTest"));
            byte b = 2;
            short s = 333;
            int i = 33;
            long l = 999L;
            float f = 333.3f;
            double d = 333.33;
            boolean bo = false;
            char c = 'w';
            dos.writeByte(b);
            dos.writeShort(s);
            dos.writeInt(i);
            dos.writeLong(l);
            dos.writeFloat(f);
            dos.writeDouble(b);
            dos.writeBoolean(bo);
            dos.writeChar(c);
            dos.flush();
            //写进去的文件包括数据类型，所以用一般方法打不开，只能用他的兄弟去打开
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (dos != null) {
                try {
                    dos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
