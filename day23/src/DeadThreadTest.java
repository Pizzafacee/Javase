public class DeadThreadTest {
    public static void main(String[] args) {
        Object o1 = new Object();
        Object o2 = new Object();
        DeadThread t1 = new DeadThread(o1,o2);
        DeadThread2 t2 = new DeadThread2(o1,o2);
        t1.setName("t1");
        t2.setName("t2");
        t1.start();
        t2.start();
    }
}
