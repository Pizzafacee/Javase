package com.bjpowernode.javase.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionTest03 {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add(3);
        c.add(2);
        c.add(1);
        c.add(2);
        c.add(3);
        c.add(4);
        c.add(5);
        c.add(6);
        c.add(7);
        c.add("wk");
        c.add("wk");
        c.remove("wk");
        c.remove(2);
        Iterator it = c.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println(c.size());
    }
}
