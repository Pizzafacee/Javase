package com.wangkang.javase.day23;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderTest02 {
    public static void main(String[] args) {
        FileReader fr = null;
        try {
            fr = new FileReader("src\\com\\wangkang\\javase\\day23\\emp");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        BufferedReader br = new BufferedReader(fr);
        try {
            String s =null;
            while ((s = br.readLine()) != null){
                System.out.println(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
