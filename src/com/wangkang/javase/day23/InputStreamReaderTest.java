package com.wangkang.javase.day23;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class InputStreamReaderTest {
    public static void main(String[] args) throws Exception {
        /*FileInputStream fis = new FileInputStream("src\\com\\wangkang\\javase\\day23\\emp");
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);*/
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("src\\com\\wangkang\\javase\\day23\\emp")));
        String s = null;
        while ((s = br.readLine()) != null){
            System.out.println(s);
        }
    }
}
