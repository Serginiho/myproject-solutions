package com.homecompany.chapter9.exercise7;
// упражнение 16
import org.jetbrains.annotations.NotNull;

import java.nio.CharBuffer;
import java.util.Scanner;

class AdapterRandomChar extends RandomChar implements Readable{
    private int count;
    AdapterRandomChar (int count){
        this.count = count;
    }

    @Override
    public int read(@NotNull CharBuffer cb) {
        if (count-- ==0)
        return -1;
        String result = next() + " ";
        cb.append(result);
        return result.length();
    }
    public static void main (String[] args){
        Scanner s = new Scanner(new AdapterRandomChar(10));
        while (s.hasNext())
            System.out.print(s.next() + " ");
    }
}
