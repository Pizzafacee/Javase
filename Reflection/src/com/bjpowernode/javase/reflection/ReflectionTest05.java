package com.bjpowernode.javase.reflection;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/*
 * 作为了解内容
 * 反射method*/
public class ReflectionTest05 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class c = Class.forName("java.lang.Integer");
        Method[] declaredMethods = c.getDeclaredMethods();//取得方法对象数组
        StringBuilder str = new StringBuilder();
        for (Method method :
                declaredMethods) {

            int modifiers = method.getModifiers();//取得方法的修饰符
            String modifierName = Modifier.toString(modifiers);//将修饰符转换为字符砖
            String simpleName = method.getReturnType().getSimpleName();//得到返回值类型的名字
            String methodName = method.getName();//得到方法的名字
            str.append(modifierName + " " + simpleName + " " + methodName + "(");
            Class<?>[] parameterTypes = method.getParameterTypes();//得到形式参数列表
            for (Class pt :
                    parameterTypes) {
                String parameterName = pt.getSimpleName();//得到形参的名字
                str.append(parameterName + "" + ")");
            }

            str.append("{}");
            str.append("\n");
            System.out.println(str);


        }
    }
}
