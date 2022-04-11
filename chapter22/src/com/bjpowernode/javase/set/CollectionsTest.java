package com.bjpowernode.javase.set;

import java.util.*;



/*
* Collections 工具类
* Collections.sort 将list进行排序，要求list中的元素继承comparable接口
* collections.syncronizedlist()  对list集合进行线程安全化
* */
public class CollectionsTest {
    private static java.lang.Object Object;

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("wangkang");
        list.add("zhangpeng");
        list.add("fuqiang");
        list.add("zhengxuelong");
        list.add("zhangkun");
        Collections.sort(list);
        for (String s :
                list) {
            System.out.println(s);
        }

        Set<User> set = new HashSet<User>();
        set.add(new User(10));
        set.add(new User(12));
        set.add(new User(15));
        set.add(new User(55));
        set.add(new User(14));
        List myList = new ArrayList<>(set);
        Collections.sort(myList);




    }

}
class User{
    private int age;

    public User(int age) {
        this.age = age;
    }

    public User() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                '}';
    }
}

class UserComparator implements Comparator<User>{



    

    @Override
    public int compare(com.bjpowernode.javase.set.User o1, com.bjpowernode.javase.set.User o2) {
        return o1.getAge() - o2.getAge();
    }
}
