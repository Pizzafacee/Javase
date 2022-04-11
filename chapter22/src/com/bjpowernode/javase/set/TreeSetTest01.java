package com.bjpowernode.javase.set;
//TreeSet底层是一个TreeMap
//TreeMap底层是一个二叉树
//TreeSet无序不可重复，但可排序，按照元素的大小排序

import java.util.TreeSet;

public class TreeSetTest01 {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();
        set.add("wangwu");
        set.add("zhaoliu");
        set.add("lisi");
        set.add("zhngsan");
        set.add("jiuqi");
        set.add("zhngpeng");
        for (String s :
                set) {
            System.out.println(s);//可以自动排序；
        }

    }
}
