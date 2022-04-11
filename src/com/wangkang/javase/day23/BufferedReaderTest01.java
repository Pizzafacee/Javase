package com.wangkang.javase.day23;

import java.io.*;

public class BufferedReaderTest01 {
    public static void main(String[] args) {
        BufferedReader br = null;
        try {
            FileReader fr = new FileReader("src\\com\\wangkang\\javase\\day23\\emp");
            br = new BufferedReader(fr);
            char[]  chars = new char[6];
            int readCount = 0;
            while ((readCount = br.read(chars)) != -1){
                System.out.print(new String(chars,0,readCount));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
