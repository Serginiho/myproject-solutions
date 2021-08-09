package com.homecompany.chapter18.exercise26;

import java.io.File;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JGrepWithNIO {
    public static void main(String[] args) throws Exception {
        if (args.length < 2) {
            System.out.println("Usage: java JGrep file regex");
            System.exit(0);
        }
        File file = new File(args[0]);
        Pattern p = Pattern.compile(args[1]);
        MappedByteBuffer mbb = new RandomAccessFile(file, "r").getChannel().map(FileChannel.MapMode.READ_ONLY, 0, file.length());
        String[] lines = StandardCharsets.UTF_8.decode(mbb).toString().split("\n");
        int index = 0;
        Matcher m = p.matcher("");
        for (String line:
             lines) {
            m.reset(line);
            while (m.find())
                System.out.println(index++ + ": " +
                        m.group() + ": " + m.start());
        }
    }
}