package com.bjpowernode.javase.set;
//Map集合的遍历
//获取所有的Key，通过Key来获取所有的values
//所有的KEy为set集合 keySet（）方法获取所有的key


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest01 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(2, "wangkang");
        map.put(1, "zhangsan");
        map.put(4, "lisi");
        map.put(9, "zhaoliu");
        Set<Integer> set = map.keySet();//该方法用来获取所有的key，
       /* Iterator<Integer> it = set.iterator();
        while (it.hasNext()) {
            Integer keys = it.next();
            System.out.println(keys + "= " + map.get(keys));
        }*/
        for (Integer keys :
                set) {
            System.out.println(keys + "=" + map.get(keys));//增强for循环也可以用来遍历，迭代器也可以
        }
    }

}
