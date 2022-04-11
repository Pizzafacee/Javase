package com.wangkang.javase.day23;

public class ExceptionTest {
    public static void main(String[] args) {
        System.out.println(m());
        final int d = 2;

        System.out.println(d);

    }

    public static  int m() {
        int i = 1;
        try {

            return i;
        } finally {
            ++i;


        }
    }
}
