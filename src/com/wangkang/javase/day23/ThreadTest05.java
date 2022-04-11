package com.wangkang.javase.day23;

public class ThreadTest05 {
    public static void main(String[] args) {
        MyRunner2 myRunner2 = new MyRunner2();
        Thread t = new Thread(myRunner2);
        t.setName("t");
        t.start();
        try {
            Thread.sleep(1000 * 5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        myRunner2.run = false;
    }
}

class MyRunner2 implements Runnable {
    boolean run = true;

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            if (run) {
                System.out.println(Thread.currentThread().getName() + "===>" + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else return;


        }
    }
}