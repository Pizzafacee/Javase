package com.wangkang.javase.day23;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferedWriterTest {
    public static void main(String[] args) throws Exception{
        BufferedWriter bw = new BufferedWriter(new FileWriter("src\\com\\wangkang\\javase\\day23\\copy03"));
        bw.write("我是最强的");
        bw.write("热水早");
        bw.write("\n");
        bw.write("认识不容易");
        bw.flush();
        bw.close();

    }

}
