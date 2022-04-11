package com.bjpowernode.javase.collection;

import java.util.ArrayList;
import java.util.List;

public class ListTest02 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("e");
        list.add("f");


        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        for (Object obj: list) {
            System.out.println(obj);


        }

        //
        System.out.println(list.indexOf("e"));
        System.out.println(list.lastIndexOf("e"));

        list.remove(3);
        System.out.println(list);

        list.set(3,"wangkang");
        System.out.println(list);

    }
}
