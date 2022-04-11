package com.bjpowernode.javase.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

//集合的迭代 为collection的通用方法，map中不能用
public class CollectionTest02 {
    public static void main(String[] args) {
        Collection  c = new ArrayList();
        c.add("wangkang");
        c.add("shi");
        c.add("sheng");
        c.add(3333);
        c.add(new Object());
        Iterator it = c.iterator();
        while(it.hasNext()){
            Object obj = it.next();
            System.out.println(obj);
        }
    }
}
