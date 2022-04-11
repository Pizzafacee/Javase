package com.bjpowernode.javase.set;
//初始化容量是16，建议是2的次幂，扩容之后是原容量的2倍。
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class HashSetTest01 {
    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap();
        hashMap.put(3, "zhangsan");
        hashMap.put(2, "lisi");
        hashMap.put(4, "wangwu ");
        hashMap.put(9, "zhaoliu");
        String string = hashMap.get(4);
        System.out.println(string);
        System.out.println(hashMap.size());
        hashMap.remove(2);
        System.out.println(hashMap.size());
        hashMap.put(8, "wangkang");
        hashMap.put(33, "zhangpeng");
        System.out.println(hashMap.containsKey(8));
        System.out.println(hashMap.containsValue("wanagkang"));
        Collection<String> values = hashMap.values();
        System.out.println(values);
        for (String s : values
        ) {
            System.out.println(s);

        }


    }
}
