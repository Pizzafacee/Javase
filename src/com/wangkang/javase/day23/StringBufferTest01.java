package com.wangkang.javase.day23;
/*
进行字符串拼接操作的话可以使用
    java.lang.StringBuffer
    intia
 */
public class StringBufferTest01 {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer();
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer.append(3);
        stringBuffer.append("jjj");
        stringBuffer.append(2344.22);
        System.out.println(stringBuffer.toString());



        StringBuilder sb = new StringBuilder();
        sb.append(333);
        sb.append("ssss");
        sb.append("ssssjii");
        System.out.println(sb);

        int a = 11;
        int b = 11;
        System.out.println(a==b);

        String i  = "zhangsan";
        String j = "zhangsan";
        System.out.println(i == j);

        String str = new String("zhangsan");
        String strs = new String("zhangsan");
        System.out.println(str == strs);
        System.out.println(str.equals(strs));

        String s = "abs";
        s = "xus";
        Integer x = 100;
        int y = x;

        Integer z = 100;
        System.out.println(x ==z);
//                自动装箱

    }


}
