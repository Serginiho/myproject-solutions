package com.homecompany.chapter18.exercise1;
//{Args: 100}


import util.TextFile;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Pattern;

public class DirList {
    public static FilenameFilter filter (final String regex) {
        return new FilenameFilter() {
            private Pattern pattern = Pattern.compile(regex);
            @Override
            public boolean accept(File dir, String name) {
                List<String> text = new LinkedList<>(new TextFile(name));
                for (String s:
                     text) {
                    if (pattern.matcher(s).matches())
                      return true;
                }
                return false;
            }
        };
    }

    public static void main(String[] args) {
        File path = new File("/Users/serginiho/IdeaProjects/myproject/src/com/homecompany/chapter18/exercise1/");
        String [] list;
        list = path.list();
        System.out.println(Arrays.toString(list));
        list = path.list(filter("//\\{Args:.*}"));
        for (String file:
             list) {
            System.out.println(file);
        }

    }
}
