package com.bjpower.node.annotation;

import java.lang.annotation.Annotation;

public class Test {
    public static void main(String[] args)  {
        Class c = null;
        try {
            c = Class.forName("com.bjpower.node.annotation.AnnotationTest01");
            if(c.isAnnotationPresent(MyAnnotation.class)){
                MyAnnotation myAnnotation = (MyAnnotation)c.getAnnotation(MyAnnotation.class);

                String name = myAnnotation.value();
                System.out.println(name);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
