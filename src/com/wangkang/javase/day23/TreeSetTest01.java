package com.wangkang.javase.day23;

import java.util.TreeSet;

public class TreeSetTest01 {
    public static void main(String[] args) {
        TreeSet<Person> ts = new TreeSet<>();
        ts.add(new Person(20));
        ts.add(new Person(50));
        ts.add(new Person(10));
        ts.add(new Person(55));
        ts.add(new Person(66));
        for (Person p :
                ts) {
            System.out.println(p);
        }
    }
}

class Person implements Comparable<Person>{
    int age;

    public Person(int age) {
        this.age = age;
    }

    public Person() {
    }


    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                '}';
    }

    @Override
    public int compareTo(Person p) {
        return this.age - p.age;
    }



}
