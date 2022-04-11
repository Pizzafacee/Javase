public class ThreadTest06 {
    //在java中强行中止一个程序
    //t.stop  //该方法会杀死一个线程 不推荐使用，一过时
    //合理中止一个线程的方法为 打boolean标记
    public static void main(String[] args) {
        MyRunnerable3 myRunnerable3 = new MyRunnerable3();
        Thread t = new Thread(myRunnerable3);
        t.setName("t");
        t.start();
        try {
            Thread.sleep(1000 * 5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        myRunnerable3.run = false;

    }


}

class MyRunnerable3 implements Runnable {
    boolean run = true;

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            if (run) {
                System.out.println(Thread.currentThread().getName() + "==>" + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }else return;
        }
    }
}