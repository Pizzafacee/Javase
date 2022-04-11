public class ThreadTest04 {
    //关于线程的Sleep方法
    //static void sleep（long millis）
    //1、//静态方法：Threa.sleep(1000);
    //作用：让当前线程进入休眠，进入”阻塞状态“，放弃占有CPU时间，让给其他线程使用
    //这行代码出现在A线程中，A线程就会进入休眠
    //这行代码出现在B线程中，B线程就就会进入休眠
    //Thread.sleep()

    public static void main(String[] args) {

        try {
            Thread.sleep(1000*5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("HelloWorld");
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
