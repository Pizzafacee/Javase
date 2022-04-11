package com.wangkang.javase.day23;

public class ThreadTest02 {
    public static void main(String[] args) {
        MyThread2 myThread2 = new MyThread2();
        MyThread2 myThread21 = new MyThread2();
        Thread t = new Thread(myThread2);
        Thread t2 = new Thread(myThread21);
        t.setName("t");
        t2.setName("t2");

        //Thread tMain = Thread.currentThread();

        t.start();
        t2.start();
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName()+ "==>" + i);

        }
    }
}
class MyThread2 implements Runnable{

    @Override
    public void run() {
        //Thread currentThread = Thread.currentThread();
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName()+"==>" + i);
        }
    }
}