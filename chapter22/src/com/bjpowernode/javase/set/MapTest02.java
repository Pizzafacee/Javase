package com.bjpowernode.javase.set;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

//遍历Map集合的第二种方式
//使用 Set<Map.Entry<>> entrySet();来获取
public class MapTest02 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(2, "wangkang");
        map.put(1, "zhangsan");
        map.put(4, "lisi");
        map.put(9, "zhaoliu");

        Set<Map.Entry<Integer,String>> set = map.entrySet();//通过该方法取得set集合
        //遍历Set集合
        for (Map.Entry<Integer, String> node:set
        ){
            System.out.println(node);
        }//使用for循环可以
        Iterator<Map.Entry<Integer,String>> it = set.iterator();
        while (it.hasNext()) {
            Integer keys = it.next().getKey();
            String values = it.next().getValue();//需要注意的是，Map.Entry有getKey()和getValue()的方法
            System.out.println(keys + "=" + values );
        }//使用迭代器可以

    }

}
