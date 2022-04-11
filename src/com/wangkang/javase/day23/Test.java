package com.wangkang.javase.day23;

public class Test {
    int i = 23;
    public void doSome(){
        i++;
        System.out.println(i);
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.doSome();
        t.doSome();
        t.doSome();
        t.doSome();
    }

}
