package com.wangkang.javase.day23;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest01 {
    public static void main(String[] args) {
        FileReader fr = null;
        try {
            fr = new FileReader("E:\\emp.txt");
            char[] c = new char[4];
            int readCount = 0;
            while ((readCount= fr.read(c)) != -1){
                for (char c1:
                        c) {
                    System.out.println(c1);
            }



            }
            /*int readCount = 0;
            while ((readCount = fr.read(c))!= -1){
                System.out.print(new String(c,0,readCount));
            }*/



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fr != null){
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
