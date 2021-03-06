public class DeadLock {
    //死锁
    public static void main(String[] args) {
        Object o1 = new Object();
        Object o2 = new Object();
        Thread t1 = new MyThread4(o1, o2);
        Thread t2 = new MyThread5(o1, o2);
        t1.setName("t1");
        t2.setName("t2");
        t1.start();
        t2.start();

    }


}

class MyThread4 extends Thread {
    Object o1;
    Object o2;

    public MyThread4() {
    }

    public MyThread4(Object o1, Object o2) {
        this.o1 = o1;
        this.o2 = o2;
    }

    /*@Override
    public void run() {
        synchronized (o1) {
            *//*try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*//*
            synchronized (o2) {
                System.out.println(Thread.currentThread().getName() + "线程1执行");
            }
            System.out.println(Thread.currentThread().getName() + "线程2执行");
        }
        synchronized (o2) {
           *//* try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*//*
            synchronized (o1) {
                System.out.println(Thread.currentThread().getName() + "线程3执行");
            }
        }
        System.out.println(Thread.currentThread().getName() + "线程4执行");
    }*/

    @Override
    public void run() {
        synchronized (o1) {
            System.out.println(Thread.currentThread().getName() + "线程执行");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (o2) {
                System.out.println(Thread.currentThread().getName() + "线程执行");

            }
        }
    }
}

class MyThread5 extends Thread {
    Object o1;
    Object o2;

    public MyThread5() {
    }

    public MyThread5(Object o1, Object o2) {
        this.o1 = o1;
        this.o2 = o2;
    }

    @Override
    public void run() {
        synchronized (o2) {
            System.out.println(Thread.currentThread().getName() + "线程执行");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (o1) {
                System.out.println(Thread.currentThread().getName() + "线程执行");
            }
        }
    }
}