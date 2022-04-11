public class ThreaTest03 {
    //获取线程当前对象 static Thread.currentThread();
    //获取线程对象的名字
    //修改线程对象的名字

    public static void main(String[] args) {
        Thread currentThread = Thread.currentThread();//获取当前线程对象，出现在哪个线程里就获取哪个线程对象
        MyThread3 t = new MyThread3();
         t.setName("t1");//修改线程的名字
        //默认线程的名称为 Thread-0  Thread-1 等

        System.out.println(t.getName());
    }
}

class MyThread3 extends  Thread{
    public void run(){
        for (int i = 0; i < 1000; i++) {
            System.out.println("分支线程==>" + i);
        }
    }
}