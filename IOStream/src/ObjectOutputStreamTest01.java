import java.io.*;


public class ObjectOutputStreamTest01  {
    //对象的序列化和反序列化
    //可以将创建的对象序列化到硬盘上Serialize
    //反序列化，//Deserialize 将硬盘上的数据恢复到内存中，恢复成java对象j
    //参与序列化和反序列的对象，必须实现Seralizable接口
    //Serializable为一个标志性接口，这种接口是给jvm参考的，会自动生成一个序列化版本号。
    //序列化版本号有什么用呢；
    public static void main(String[] args) {
        Student s = new Student(111, "zhangsan");
        ObjectOutputStream oos = null;
        try {
            //序列化
            oos = new ObjectOutputStream(new FileOutputStream("student"));
            //序列化对象
            oos.writeObject(s);//NotSerializableException 如果不实现Serializable接口会报错
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



