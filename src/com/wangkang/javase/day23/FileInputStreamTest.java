package com.wangkang.javase.day23;
/*主要掌握的几种IO流
1、FileInputStream 字节输入流
* */

import java.awt.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("D:\\培训学习\\质量手册J1-2015\\0.1发布令.doc");
            /*int i = fis.read();
            System.out.println(i);
            i = fis.read();
            System.out.println(i);
            i = fis.read();
            System.out.println(i);
            i = fis.read();
            System.out.println(i);
            i = fis.read();
            System.out.println(i);*/
            while (fis.read() !=-1){
                System.out.println(fis.read());//这种方式效率比较低，一次只能读一个字节。

        }
    } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
