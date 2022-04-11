package com.wangkang.javase.day23;

public class ThreadTest04 {
    public static void main(String[] args) {
    Thread t = new Thread(new MyRunner());
       t.start();
       t.setName("t");
        System.out.println("HelloWorld");
        try {
            Thread.sleep(1000*5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t.interrupt();
    }


}

class MyRunner implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "==>begin");
        try {
            Thread.sleep(60*60*24*1000*30*12);
        } catch (InterruptedException e) {
            //e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "==>end");
    }
}
