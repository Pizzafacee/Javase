import java.io.File;
import java.io.IOException;

public class FileTest01 {
    //File类个四大家族没有关系，和文件的读写没有关系
    //表示文件和路径名的抽象表现形式
    //一个File可能是一个目录，也可能是一个文件
    //需要掌握常用方法
    public static void main(String[] args) {
        File fl  = new File("/log2.txt");
        /*System.out.println(fl.exists());//判断文件是否存在
        if(!fl.exists()){
            try {
                fl.createNewFile();//创建文件
            } catch (IOException e) {
                e.printStackTrace();
            }
        }*/
//        fl.mkdir();//创建目录
        fl.mkdirs();//创建多重目录
        System.out.println(fl.getParent());//获取文件上一级路径
        System.out.println(fl.getAbsolutePath());//获取文件的绝对路径
    }
}
