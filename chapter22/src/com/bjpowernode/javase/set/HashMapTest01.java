package com.bjpowernode.javase.set;
//HashMap集合底层是哈希表的数据结构
//他是一个数组和单向链表的结合

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

//hashmap的初始化容量是16，，扩容是原来的两倍，默认加载因子是0.75，即达到容量的75%是就开始扩容
//所以需要同时重写hascode和equals方法

//在JdK8中HashMap中做出了一些改进，如果单向链表的节点node数量大于8个时，会变成红黑树的数据结构，（
//（树的结构类似于红黑树）为了提高检索效率， 如果＜6个node，会再变成单向链表。
//hashMap的key值可以为null，value也可以为null，但key只能有一个null，
// 其实map可以理解成数学中的函数，映射。一个key只能有一个value，但一个value可以对应多个key。

public class HashMapTest01 {
    public static void main(String[] args) {
        Student s1 = new Student("zhangsan",22);
        Student s2 = new Student("zhangsan",22);
        System.out.println(s1.equals(s2));
        System.out.println("s1的Hashcode" + s1.hashCode());
        System.out.println("s2的Hashcode" + s2.hashCode());
        Set<Student> set = new HashSet<>();
        set.add(s1);
        set.add(s2);
        System.out.println(set.size());

    }
}


class Student{
    String name;
    int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}