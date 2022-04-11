package com.bjpowernode.javase.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*list接口特有的方法
* void add
* Object get
* int indexOf
* Object remove
* int LastIndexOf
* Object set*/
public class ListTest01 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add(1,"wangkang");
        System.out.println(list);
        Iterator it = list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
