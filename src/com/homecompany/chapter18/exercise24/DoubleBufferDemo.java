package com.homecompany.chapter18.exercise24;

import java.nio.ByteBuffer;
import java.nio.DoubleBuffer;

public class DoubleBufferDemo {
    public static void main(String[] args) {
        ByteBuffer bb = ByteBuffer.allocate(1024);
        DoubleBuffer db = bb.asDoubleBuffer();
        db.put(new double[]{2.1,2.2,2.3,2.4,2.5,1024.1});
        System.out.println(db.get(3));
        db.put(3,200.2);
        db.flip();
        while (db.hasRemaining()) {
            double d = db.get();
            System.out.println(d);
        }
    }
}
