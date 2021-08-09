package com.homecompany.chapter18.exercise6;

import util.ProcessFiles;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileFinder {
    public static void findFiles (String d, String[] args) {
        new ProcessFiles(new ProcessFiles.Strategy() {
            @Override
            public void process(File file) {
                try {
                    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                    Date date1 = dateFormat.parse(d);
                    Date date2 = new Date(file.lastModified());
                if (date1.before(date2))
                    System.out.println(file);
                }catch (ParseException e) {
                    e.printStackTrace();
                }
            }
        }, "java").start(args);
    }

    public static void main(String[] args) {
        findFiles("2021-06-01 17:05:00", args);
    }
}
