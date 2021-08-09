package com.homecompany.chapter13.exercise15;

import util.TextFile;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Grep {
    public static void main (String[] args) throws Exception{
        if (args.length < 2) {
            System.out.println("Добавьте аргументы");
            System.exit(0);
        }
        int flag = Integer.parseInt(args[2]);
        Pattern p = Pattern.compile(args[1], flag);
        int index = 0;
        Matcher m = p.matcher("");
        for (String line: new TextFile(args[0])){
 //           System.out.println(line);
            m.reset(line);
            while (m.find()){
                System.out.println(index++ + ": " + m.group() + ": " + m.start());}
        }
    }
}
