package com.wangkang.javase.day23;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Copy02 {
    public static void main(String[] args) {
        FileReader fr = null;
        FileWriter fw = null;
        try {
            fr = new FileReader("src\\com\\wangkang\\javase\\day23\\emp");
            fw = new FileWriter("src\\com\\wangkang\\javase\\day23\\emp2");
            char[] chars = new char[8];
            int readCount = 0;
            while ((readCount = fr.read(chars)) != -1) {
                fw.write(chars, 0, readCount);
            }
            fw.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fr != null) {
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fw != null) {
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
