package com.bjpowernode.javase.reflection;

import javax.management.modelmbean.ModelMBean;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

//通过反射机制，反编译一个类的Field
public class ReflectionTest02 {
    public static void main(String[] args) {
        try {
            Class c = Class.forName("java.lang.Class");
            StringBuilder s = new StringBuilder();
            int modifiers = c.getModifiers();
            String s1 = Modifier.toString(modifiers);
            Field[] declaredFields = c.getDeclaredFields();
            s.append(s1 + " " + "class" + " " + c.getSimpleName() + "{");
            s.append("\n");
            for (Field fd :
                    declaredFields) {
                s.append("\t");
                s.append(Modifier.toString(fd.getModifiers()));
                s.append(" ");
                s.append(fd.getType().getSimpleName());
                s.append(" ");
                s.append(fd.getName());
                s.append(";");
                s.append("\n");
            }
            s.append("}");
            System.out.println(s);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
