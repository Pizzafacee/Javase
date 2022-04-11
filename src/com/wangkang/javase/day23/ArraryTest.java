package com.wangkang.javase.day23;

import javax.swing.*;
import java.util.Arrays;
import java.util.Random;

public class ArraryTest {


    public static void main(String[] args) {
        int[] arrary = new int[20];
        Random random = new Random();
        for (int i = 0; i < arrary.length; i++) {
            arrary[i] = random.nextInt(28);
        }
        for (int i = 0; i < arrary.length; i++) {
            System.out.println(arrary[i]);

        }
        Arrays.sort(arrary);
        System.out.println(Arrays.binarySearch(arrary,20));

        int[] arrary2 = Arrays.copyOf(arrary,25);
        for (int i = 0; i < arrary2.length; i++) {
            System.out.println(arrary2);

        }


//        for (int i = 0; i < arrary.length - 1; i++) {
//            for (int j = i + 1; j < arrary.length; j++) {
//                {arrary[j] = random.nextInt(8);
//                }
//                while (arrary[i] == arrary[j])
//            }
//        }
//        for (int i = 0; i < arrary.length; i++) {
//            System.out.println(arrary[i]);
//        }
    }
}
