package com.wangkang.javase.day23;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class DataOutputStreamTest {
    public static void main(String[] args) throws Exception {
        FileOutputStream fos = new FileOutputStream("src\\com\\wangkang\\javase\\day23\\emp3");
        DataOutputStream dps = new DataOutputStream(fos);
        dps.writeBytes("ssssdfsjg");
        dps.writeBoolean(true);
        dps.writeChar('s');
        dps.flush();
        dps.close();
    }
}
