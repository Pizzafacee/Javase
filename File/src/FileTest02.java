import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileTest02 {
    public static void main(String[] args) {
        File fl = new File("D:\\检测标准2\\检测标准\\DSC\\GBT19466\\GBT19466.1.pdf");
        System.out.println(fl.isFile());//判断是否是个文件
        System.out.println(fl.isDirectory());//判断是否是个目录
        System.out.println(fl.getName());//获得文件名
        Long haomiao = fl.lastModified();//获得最后一次修改日期，返回值为毫秒
        Date lastTime = new Date(haomiao);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String str = sdf.format(lastTime);
        System.out.println(str);
        System.out.println(fl.length());//获取文件的大小
    }
}
