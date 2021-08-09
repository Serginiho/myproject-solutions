package com.homecompany.chapter18.exercise16;

import java.io.IOException;
import java.io.RandomAccessFile;

public class UsingRandomAccessFile {
    static String file = "rtest.dat";
    static void display() throws IOException {
        RandomAccessFile rf = new RandomAccessFile(file, "r");
        for(int i = 0; i < 7; i++)
            System.out.println(
                    "Value " + i + ": " + rf.readDouble());
        System.out.println(rf.read());
        System.out.println(rf.readBoolean());
        System.out.println(rf.readByte());
        System.out.println(rf.readShort());
        System.out.println(rf.readInt());
        System.out.println(rf.readFloat());
        System.out.println(rf.readLong());
        System.out.println(rf.readUTF());
        rf.close();
    }
    public static void main(String[] args)
            throws IOException {
        RandomAccessFile rf = new RandomAccessFile(file, "rw");
        for(int i = 0; i < 7; i++)
            rf.writeDouble(i*1.414);
        rf.write(1);
        rf.writeBoolean(true);
        rf.writeByte(8);
        rf.writeShort(5);
        rf.writeInt(256);
        rf.writeFloat(25.78F);
        rf.writeLong(1L);
        rf.writeUTF("The end of the file");
        rf.close();
        display();
        rf = new RandomAccessFile(file, "rw");
        rf.seek(5*8);
        rf.writeDouble(47.0001);
        rf.close();
        display();
    }
}
