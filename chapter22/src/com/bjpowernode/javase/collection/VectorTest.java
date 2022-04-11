package com.bjpowernode.javase.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

/*底层是一个数组
* 初始容量是10
* 扩容后是原容量的2倍
* 线程安全
* 线程同步
* 效率较低
* 使用较少*/
public class VectorTest {
    public static void main(String[] args) {
        List list = new Vector();
        list.add(2);
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(9);

        //遍历用迭代器
        List myList = new ArrayList();
        Collections.synchronizedList(myList);//该方法可以将非线程安全的转化成线程安全的。
    }
}
