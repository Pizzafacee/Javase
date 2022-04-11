package com.wangkang.javase.day23;
//线程的阻塞过程
//static void sleep(long millis)
//静态方法：Thread.sleep(1000);
//参数是毫秒
// 作用：让当前的线程进入休眠，进入“阻塞状态”，放弃占有cpu时间片，让给其他线程使用
//出现在哪个线程哪个线程休眠
public class ThreadTest03 {
    public static void main(String[] args) {
        try {
            Thread.sleep(1000*5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Hello World!");
        Thread currentThread = Thread.currentThread();
        for (int i = 0; i < 1000; i++) {
            System.out.println(currentThread.getName() + "==>" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
