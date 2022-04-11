package com.bjpowernode.javase.set;

import java.util.Properties;

//该类是一个Map集合，其key和value都是String类型。
//properties被称为属性类对象
//有两个比较重要的方法 setProperty() 和getProperty() 存和取
public class PropertiesTest01 {
    public static void main(String[] args) {
        Properties p = new Properties();
        p.setProperty("url", "sjksjgfksjfkg");
        p.setProperty("driver","comn.mysql.jdbk.Driver");
        p.setProperty("wakngkang","ssjgksjfk");//存数据

        //通过key取value
        String s =p.getProperty("url");
        String s2 = p.getProperty("driver");
        String s3 = p.getProperty("wakngkang");
        System.out.println(s);
        System.out.println(s2);
        System.out.println(s3);
    }
}
