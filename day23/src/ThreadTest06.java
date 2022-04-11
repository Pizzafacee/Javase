import java.util.ArrayList;
import java.util.List;

public class ThreadTest06 {
    public static void main(String[] args) {
        List list = new ArrayList();
        Thread producer = new Thread(new Producer(list));
        Thread customer = new Thread(new Customer(list));
        producer.setName("producer");
        customer.setName("customer");
        producer.start();
        customer.start();

    }
}

class Producer implements Runnable {
    List list;

    public Producer() {
    }

    public Producer(List list) {
        this.list = list;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (list) {

                if (list.size() == 0) {
                    Object obj = new Object();
                    list.add(obj);
                    System.out.println(Thread.currentThread().getName() + "生产了一个产品"+obj);
                    list.notify();

                }
                try {
                    list.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }





            }
        }


    }
}


class Customer implements Runnable {
    List list;

    public Customer() {
    }

    public Customer(List list) {
        this.list = list;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (list) {

                if (list.size() > 0) {
                    Object obj = list.remove(0);
                    System.out.println(Thread.currentThread().getName() + "消费了一个产品" + obj);
                    list.notify();
                }
                try {
                    list.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }




            }
        }
    }
}


