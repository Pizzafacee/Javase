public class ThreadTest01 {
    //实现线程的第一种方式：
    //编写一个类，直接继承java.lang.Thread,重写run方法
    public static void main(String[] args) {
      MyThread myThread = new MyThread();
        myThread.start();//start方法的作用是：启动一个分支线程，在JVM中开辟一个新的栈空间，这段代码就完成任务了，瞬间就结束了；
        //线程启动后，会自动调用run方法，并且run方法在栈底部，与main方法为同等地位

        for (int i = 0; i <1000; i++) {
            System.out.println("主线程==>" + i);

        }
    }
}

class MyThread extends Thread{
    @Override
    public void run() {
        //编写程序，这段程序运行在分支线程中（分支栈）
        for (int i = 0; i < 1000; i++) {
            System.out.println("分支线程==>" + i);
            
        }
    }
}