import java.io.File;

public class FileTest03 {
    public static void main(String[] args) {
        //File[] listFiles()
        //获取当前目录下的所有子文件
        File fl = new File("D:\\检测标准2\\检测标准");
        File[] files = fl.listFiles();//搜集该目录下所有文件，并返回一个文件类型的数组
        for (File file :
                files) {
            System.out.println(file);

        }
    }
}
