package com.wangkang.javase.day23;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest02 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("E:\\emp.txt");
            byte[] bytes = new byte[1024];
            int readCount = fis.read(bytes);
            System.out.println(readCount);
            String s = new String(bytes,0,readCount);//读了多少个字节就转换多少个字节。
            System.out.println(s);



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(fis != null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
