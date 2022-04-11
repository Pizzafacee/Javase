package com.bjpowernode.javase.reflection;

import java.lang.reflect.Field;

//通过反射机制获得属性的值 方法一
public class ReflectionTest03 {
    public static void main(String[] args) {
        try {
            Class c = Class.forName("com.bjpowernode.javase.reflection.Student");
            Object o = c.newInstance();
            Field[] declaredFields = c.getDeclaredFields();
            //System.out.println(declaredFields.length);
            Field declaredField = declaredFields[0];
            declaredField.set(o,"wangkang");

            System.out.println(declaredField.get(o));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

    }
}
