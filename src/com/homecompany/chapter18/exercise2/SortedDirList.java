package com.homecompany.chapter18.exercise2;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.regex.Pattern;

public class SortedDirList {
    private File path;
    private String[] fileList;
    public SortedDirList(String dir) {
        path = new File(dir);
        fileList = path.list();
        if (fileList != null)
           Arrays.sort(fileList, String.CASE_INSENSITIVE_ORDER);
    }
    public String [] getFileList () {
        return fileList;
    }
    public String [] getFileList (String regex) {
        return path.list(new FilenameFilter() {
            private Pattern p = Pattern.compile(regex);
            @Override
            public boolean accept(File dir, String name) {
                return p.matcher(name).matches();
            }
        });
    }

    public static void main(String[] args) {
        SortedDirList sdl = new SortedDirList("/Users/serginiho/IdeaProjects/myproject/src/com/homecompany/chapter18/exercise1/");
        System.out.println(Arrays.toString(sdl.getFileList()));
        System.out.println(Arrays.toString(sdl.getFileList("T.*\\.java")));
    }
}
