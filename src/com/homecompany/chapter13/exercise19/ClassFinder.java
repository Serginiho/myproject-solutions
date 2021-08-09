package com.homecompany.chapter13.exercise19;

import util.TextFile;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class ClassFinder {
    public static void main (String[] args){
        if(args.length<1){
            System.out.println("Not enough arguments");
            System.exit(0);
        }
        Pattern p = Pattern.compile("class \\w+\\s");
        Matcher m = p.matcher("");
        int index = 0;
        for (String line : new TextFile(args[0])){
            m.reset(line);
            while (m.find()){
                System.out.println(index++ + ": " + m.group() + " at start position - " + m.start());
            }
        }
    }
}
