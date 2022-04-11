public class ThreadTest05 {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread t = new Thread(myRunnable);
        t.start();
        try {
            Thread.sleep(1000*5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //这种中断方法，依靠了Java的异常处理机制
        t.interrupt();


    }
}

class MyRunnable implements Runnable{
//中止线程的睡眠
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "==>begin");
        try {
            Thread.sleep(1000*60*60*24*30*12);
        } catch (InterruptedException e) {
//            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "==>over");
    }

}