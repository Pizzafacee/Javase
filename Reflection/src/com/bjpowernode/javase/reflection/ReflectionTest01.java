package com.bjpowernode.javase.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class ReflectionTest01 {
    public static void main(String[] args) {
        Class c;

        {
            try {
                c = Class.forName("com.bjpowernode.javase.reflection.Student");//获取字节码文件
                String name = c.getName();//获取类的名字
                System.out.println(name);
                Field[] fields = c.getFields();//获取可以访问的属性
                Field field = fields[0];//获取Field数组第一个属性
                String fieldName = field.getName();//获取属性的名字
                System.out.println(fieldName);
                Class<?> type = field.getType();//获取属性的类型
                String typeName = type.getName();//获取属性的类型的名字
                System.out.println(typeName);
                Field[] declaredFields = c.getDeclaredFields();//获取所有的属性
                for (Field fd :
                        declaredFields) {
                    System.out.println(fd.getType() + "  " + fd.getName());//获取所有的属性的名字和类型名字
                    int modifiers = fd.getModifiers();//返回的修饰符是一个数字，该数字是修饰符的代号。如int是4
                    System.out.println(modifiers);
                    String s = Modifier.toString(modifiers);
                    System.out.println(s);
                    System.out.println("+++++++++++++++++");
                }

            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }

}
