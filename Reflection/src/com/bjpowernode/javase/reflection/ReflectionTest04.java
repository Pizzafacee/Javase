package com.bjpowernode.javase.reflection;

import java.lang.reflect.Field;

//获取属性的值 方法2 常用方法
public class ReflectionTest04 {
    public static void main(String[] args) {
        try {
            Class c = Class.forName("com.bjpowernode.javase.reflection.Student");
            Object o = c.newInstance();
            Field name = c.getDeclaredField("name");
            name.set(o,"jackson");
            System.out.println(name.get(o));
            //如果想要访问私有属性，需要打破封装
            //打破封装的方法为
           // name.setAccessible(true); 打破封装
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }
}
