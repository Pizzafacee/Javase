public class ThreadTest02 {
    public static void main(String[] args) {
        Runnable myThread02 = new MyThread02();
        Thread t = new Thread(myThread02);
        t.start();
        for (int i = 0; i < 1000; i++) {
            System.out.println("主线程执行==>" + i );
        }
    }
}

class MyThread02 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("副线程执行==>"+ i);
        }
    }
}