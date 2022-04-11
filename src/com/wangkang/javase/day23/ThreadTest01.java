package com.wangkang.javase.day23;

public class ThreadTest01 {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.setName("父线程");
        myThread.start();
        for (int i = 0; i < 100; i++) {

        System.out.println("主线程执行" + i);
        }
    }

}


class MyThread extends  Thread{
    @Override
    public void run() {
        Thread currentThread = Thread.currentThread();
        for (int i = 0; i < 100; i++) {

        System.out.println(this.getName() + i);
        }
    }
}