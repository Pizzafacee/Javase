package com.wangkang.javase.day23;

import java.io.PrintStream;

public class PrintStreamTest {
    public static void main(String[] args)throws Exception {
        PrintStream ps = System.out;
        ps.println("wankgang");
        ps.println("wangkwu");
        ps.println("sjkgjsg");
        System.setOut(new PrintStream("src\\com\\wangkang\\javase\\day23\\log"));
        System.out.println("hello worls");
        System.out.println("hello zhangsan");
        System.out.println("hello kitty");

    }
}
