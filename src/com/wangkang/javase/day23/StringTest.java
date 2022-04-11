package com.wangkang.javase.day23;

import java.nio.charset.StandardCharsets;

public class StringTest {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append(99);
        sb.append("wangkang");
        char[] c = {'a', 'a', 's', 's', 'a', 'g', 'j', 's'};
        sb.append(c);
        System.out.println(sb);

        String str = "SSSSSSSSSSS";
        char a = str.charAt(4);
        System.out.println(a);
        String str2 = "255664548";
        int b = str.compareTo(str2);
        int d = str.compareToIgnoreCase(str2);
        System.out.println(b);
        System.out.println(d);
        String str3 = str.concat("wangkang");
        System.out.println(str3);
        String str4 = String.copyValueOf(c);
        System.out.println(str4);
        System.out.println(str.endsWith("sss"));
        System.out.println(str.hashCode());
        System.out.println(str2.indexOf('k'));
        System.out.println(str2.indexOf("sjg"));
        System.out.println(str2.length());
        System.out.println(str2.replace("sjk", "mnk"));
        char[] array = str2.toCharArray();
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);


        }
        System.out.println(String.valueOf(c));
        System.out.println(String.valueOf(88776676));
        System.out.println(String.valueOf(true));
        System.out.println(String.valueOf(c));
        System.out.println(str2.contains("555"));
        byte[] bt = str2.getBytes();
        for (int i = 0; i < bt.length; i++) {
            System.out.println(bt[i]);

        }
    }

}

