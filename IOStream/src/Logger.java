import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {
    //生成一个日志方法，要求显示在什么时间发生了什么事情；
    public static void log(String s){
        //建立标准输出流
        try {
            PrintStream printStream = new PrintStream(new FileOutputStream("log.txt",true));
                    //记录时间发生的时间
            Date nowTime = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String str = sdf.format(nowTime);
            System.setOut(printStream);
            printStream.println(str + ":" + s);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}
class Test{
    public static void main(String[] args) {
        Logger.log("蓝屏了");
        Logger.log("电脑爆炸了");
        Logger.log("电脑更换了战术核显卡");
    }
}


