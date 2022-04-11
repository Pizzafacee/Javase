import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TimerTest {
    //使用定时器指定定时任务
    public static void main(String[] args) {
        MyTask myTask = new MyTask();
        Timer timer = new Timer();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date firstTime = null;
        try {
            firstTime = sdf.parse("2022-01-03 22:27:55");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        timer.schedule(myTask,firstTime,1000*10);
    }
}

class MyTask extends TimerTask{

    @Override
    public void run() {
        Date nowTime = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String s = sdf.format(nowTime);
        System.out.println(s + ":" + "完成了一次记录");
    }
}


