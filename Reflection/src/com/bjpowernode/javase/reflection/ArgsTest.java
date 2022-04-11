package com.bjpowernode.javase.reflection;
//可变长度参数
/*
* int... args 这就是可变长参数
* 语法是：类型... 标识符 (注意：一定是三个点)
* 长度是0~N个
* 可变长参数必须是形式参数列表的最后一个
**/

public class ArgsTest {
    public static void main(String[] args) {
        m1("wo","shi","zhong","guo","ren");

    }


    public static void m1(String... args){
        for (String s :
                args) {
            System.out.println(s);//可变长参数其实是一个数组，可以用进行遍历
        }

    }
}
