import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Copy {
    //需要定义一个拷贝目录的方法
    void copyDir() {
        //先read某个地址的目录
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("");//读取目录
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        //需要获得目录文件
        File fl = new File("F:\\001-JavaSE课堂笔记+思维导图");
        File[]  files = fl.listFiles();
        System.out.println(files);

    }
}
