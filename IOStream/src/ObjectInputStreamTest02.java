import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;
//如果一个类的某个属性 不想序列化，可以添加关键字 transient，表示游离的
public class ObjectInputStreamTest02 {
    public static void main(String[] args) {
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream("Users"));
            Object obj = ois.readObject();
            //System.out.println(obj instanceof List);
            List<User> list = (List<User>) obj;
            for (User u :
                    list) {
                System.out.println(u);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        if (ois != null) {
            try {
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
