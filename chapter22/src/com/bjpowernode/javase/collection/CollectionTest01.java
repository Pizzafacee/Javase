package com.bjpowernode.javase.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class CollectionTest01 {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add(100);//实际上是放进去了一个对象的内存地址，自动装箱了。添加元素
        c.add(3.14);
        c.add(new Object());
        c.add(new Student());
        c.size();//获取集合中元素的个数；
        c.clear();//清空集合；
        c.add("Hello");
        c.add("World");
        c.add("wangkang");
        c.add("shengming");
        c.add("wangkang");
        c.add(3);
        c.add(3);
        c.add(3);
        c.add(new Integer(3));
        c.add(new Integer(3));


        boolean b = c.contains("wangkang");//判断是否包含某个元素
        System.out.println(b);
        System.out.println(c.contains("ssss"));
        c.remove("wangkang");//删除集合中的某个对象
        c.isEmpty();//判断集合是否为空；
        System.out.println(c.isEmpty());
        c.add("dddd");
        c.add("sjkgfjka");
        c.add(new Student());
        c.remove(new Integer(3));
        c.remove("wangkang");
        Iterator it = c.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

       /* Object[] obj = c.toArray();//转换成数组
        for (int i = 0; i < obj.length; i++) {
            System.out.println(obj[i]);

        }

        Collection c2 = new LinkedList();
        Object[] obj2 = c2.toArray();//链表也可以转换成数组
*/




    }
}
class Student{
    @Override
    public String toString() {
        return "student";
    }
}
