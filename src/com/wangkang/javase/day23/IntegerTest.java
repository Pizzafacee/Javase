package com.wangkang.javase.day23;

import org.w3c.dom.ls.LSOutput;

public class IntegerTest {
    public static void main(String[] args) {
        Integer a = 100;
        int b = a;
        String c = "222222";
        int d = Integer.parseInt(c)+255;
        System.out.println(d);
        String e = new String("ssssss") ;
        System.out.println(Integer.valueOf(a));
        Integer f = 55555;
        int g = f;
        System.out.println(f);

    }


}



