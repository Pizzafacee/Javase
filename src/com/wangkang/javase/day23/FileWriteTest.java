package com.wangkang.javase.day23;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriteTest {
    public static void main(String[] args) {
        FileWriter fw = null;
        try {
            fw = new FileWriter("src\\com\\wangkang\\javase\\day23\\ttxs");
            char[] chars = {'我','是','中','国','人'};
            fw.write(chars);
            fw.write("sssdgjsjgskajgk我是王康");

            fw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
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
