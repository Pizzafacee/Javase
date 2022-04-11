package com.bjpowernode.javase.set;

import java.util.Objects;
import java.util.TreeSet;

//对自定义的对象进行排序,可以自动排序吗？不行，需要写比较方法或者比较器；
//在TreeSet或TreeMap中，如果对象没有比较方法，在加入第二个元素的时候会出错
//报错为class com.bjpowernode.javase.set.Person cannot be cast to class java.lang.Comparable
// 无法转化为Comparable,需要自定义类实现comparable接口
public class TreeSetTest02 {
    public static void main(String[] args) {
        Person p1 = new Person(10,"zhangsan");
        Person p2 = new Person(20,"lisi");
        Person p3 = new Person(30,"zhangsi");
        Person p4 = new Person(40,"liwu");
        Person p5 = new Person(30,"zhangwu");
        TreeSet<Person> ts = new TreeSet<>();
        ts.add(p1);
        ts.add(p2);
        ts.add(p3);
        ts.add(p4);
        ts.add(p5);
        for (Person p :
                ts) {
            System.out.println(p);
        }

    }
}


class Person implements Comparable<Person>{
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Person person = (Person) o;
//        return age == person.age && Objects.equals(name, person.name);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(age, name);
//    }

    int age;
    String name;

    public Person() {
    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Person(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }



    @Override
    public int compareTo(Person o) {
        if (this.age - o.age == 0 ) {
            return this.name.compareTo(o.name);
        }
        return this.age - o.age;




    }
}
