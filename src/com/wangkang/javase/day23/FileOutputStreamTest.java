package com.wangkang.javase.day23;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("src\\com\\wangkang\\javase\\day23\\temp.txt",true);
            byte[] bytes = {97,98,98,97};
            fos.write(bytes);
            String s = "王康是无敌的";
            byte[] bytes1 = s.getBytes();
            for (byte b :
                    bytes1) {
                System.out.println(b);
            }

            fos.write(bytes1);

            fos.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
