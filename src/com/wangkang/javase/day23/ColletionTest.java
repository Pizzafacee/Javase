package com.wangkang.javase.day23;

import java.util.ArrayList;
import java.util.Collection;

public class ColletionTest {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add("sss");
        c.add("ssddgf");
        c.add("sdjjjjsk");
        c.add(22222);
        Object[] objects = c.toArray();
        for (int i = 0; i < objects.length; i++) {
            System.out.println(objects[i]);


        }


    }
}

