package com.wangkang.javase.day23;

import java.util.Random;

public class RandomTest {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[5];

       /* for (int i = 0; i < arr.length; i++) {
            //arr[i] = num;
            int num = random.nextInt(6);
            System.out.println("出現的隨機數是" + num);
            if (!contains(arr, num)) {
                arr[i] = num;
            }
            这里不方便用for循环，应为如果if不执行，for会执行下一步，
            也就是i++,此时的数组默认会值会不变，而while不会有这种情况；
        }*/
        int index = 0;
        while (index < arr.length){

            int num = random.nextInt(10);
            System.out.println("输出的随机数为" + num);
            if (!contains(arr,num)) {
                arr[index++] = num;
            }

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
    public static boolean contains(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return true;
            }
        }
        return false;
    }
}
