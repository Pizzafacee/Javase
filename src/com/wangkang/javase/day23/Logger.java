package com.wangkang.javase.day23;

import javax.xml.crypto.Data;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {
    public static void log(String msg) throws Exception{
        PrintStream printStream = new PrintStream("src\\com\\wangkang\\javase\\day23\\log2");
        System.setOut(printStream);
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String s = sdf.format(date);
        System.out.println(s + ":" + msg);

    }
}
