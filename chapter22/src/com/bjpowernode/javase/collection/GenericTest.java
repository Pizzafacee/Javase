package com.bjpowernode.javase.collection;

public class GenericTest <ssfksajg>{
    public void add(String o){}
    public static void main(String[] args) {
        GenericTest<Integer> g = new GenericTest();
        g.add("s");
        MyIterator<String> mi = new MyIterator();
        String string = mi.get();

    }
}

class MyIterator<T>{
    public T get(){
        return null;
    }

}
