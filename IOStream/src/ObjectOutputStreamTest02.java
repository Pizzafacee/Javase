import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ObjectOutputStreamTest02 {
    //一次性序列化多个对象
    //将对象放到集合之中，再序列化集合
    public static void main(String[] args) {
        ObjectOutputStream oos = null;
        try {
            List<User> list = new ArrayList<>();
            list.add(new User(101,"zjangsan"));
            list.add(new User(121,"lisi"));
            list.add(new User(988,"wangwu"));
            list.add(new User(887,"zhaoliu"));
            oos = new ObjectOutputStream(new FileOutputStream("Users"));
            oos.writeObject(list);
            oos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (oos != null) {
            try {
                oos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


}
