import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataInputStreamTest {
    public static void main(String[] args) {
        DataInputStream dis = null;
        try {
            dis = new DataInputStream(new FileInputStream("DataStreamTest"));
            System.out.println(dis.readByte());
            System.out.println(dis.readShort());
            System.out.println(dis.readInt());
            System.out.println(dis.readLong());
            System.out.println(dis.readFloat());
            System.out.println(dis.readDouble());
            System.out.println(dis.readBoolean());
            System.out.println(dis.readChar());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (dis != null) {
                try {
                    dis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
    //数据专属流
    //用记事本打不开,只能用字节数据输入流才能读，并且知道数据

}
