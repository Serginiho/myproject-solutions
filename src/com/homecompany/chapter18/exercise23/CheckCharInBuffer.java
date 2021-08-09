package com.homecompany.chapter18.exercise23;

import java.io.IOException;
import java.nio.CharBuffer;

public class CheckCharInBuffer {
    private static boolean isPrinted (char c) {
        return (c >= '!') && (c <= '~');
    }
    public static void check (CharBuffer cb) throws IOException {
        cb.rewind();
        while (cb.hasRemaining()) {
            char c = cb.get();
            if (isPrinted(c)){
                System.out.println(c);
            } else {
            System.out.println("Not readable element '"+ c + "' at position " + cb.position());
            }
        }
    }
    public static void main(String[] args) throws IOException {
        char[] ca = {(char)0x02, (char)0x07, (char)0x7F,'b','y','e'};
        CharBuffer cb = CharBuffer.wrap(ca);
        check(cb);
        System.out.println("--------------");
        cb.clear();
        ca = new char[]{'a', 'b',(char) 0x2C,'c','d','ô'};
        cb = CharBuffer.wrap(ca);
        check(cb);
    }
}
