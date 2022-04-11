package com.bjpowernode.javase.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class ArrayListTest01 {
    public static void main(String[] args) {
        //ArrayList集合初始化容量是10；在add第一个元素的时候初始化容量  扩容的话为原容量的1.5倍
        //
        //底层是一个数组
        //构造方法可以新建一个集合.将set转化成list

        Collection c = new HashSet();
        c.add(100);
        c.add(200);
        c.add(200);
        c.add(200);
        List list = new ArrayList(c);
        //System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}
