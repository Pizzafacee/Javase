package com.bjpowernode.javase.reflection;

import javax.crypto.spec.PSource;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

//反射机制调用方法 这个是重点
public class ReflectionTest06 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        Class c = Class.forName("com.bjpowernode.javase.reflection.Student");
        Object o = c.newInstance();//先创建对象
        //获取方法
        Method[] declaredMethods = c.getDeclaredMethods();
        for (Method method :
                declaredMethods) {
            Object invoke = method.invoke(o, 10, 20);
            System.out.println(invoke);
        }//以上是循环遍历来获取方法，还可以根据方法名来获取方法如下

        Method sum = c.getDeclaredMethod("sum", int.class, int.class);
        Object invoke = sum.invoke(o, 20, 50);
        System.out.println(invoke);


    }
}
