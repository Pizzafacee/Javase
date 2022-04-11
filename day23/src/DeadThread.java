public class DeadThread extends Thread {
    Object o1;
    Object o2;

    public DeadThread() {
    }

    public DeadThread(Object o1, Object o2) {
        this.o1 = o1;
        this.o2 = o2;
    }

    @Override
    public void run() {
        synchronized (o1) {
            System.out.println(o1.toString() + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (o2) {
                System.out.println(o2.toString() + Thread.currentThread().getName());

            }
        }
    }
}

class DeadThread2 extends Thread {
    Object o1;
    Object o2;

    public DeadThread2() {
    }

    public DeadThread2(Object o1, Object o2) {
        this.o1 = o1;
        this.o2 = o2;
    }

    @Override
    public void run() {
        synchronized (o2) {
            System.out.println(o1.toString() + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (o1) {
                System.out.println(o1.toString() + Thread.currentThread().getName());

            }
        }
    }

}
