package com.homecompany.chapter13.exercise16;
/* comment4 */
/*
comment5
*/

import util.TextFile;

import java.io.File;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
// comment2
class JGrep {
    public static void main (String[] args) throws Exception{
        if(args.length < 2){
            System.out.println("Добавьте аргументы");
            System.exit(0);
        }
        int flag = 0;
        if (args[2]!=null){
            flag = Integer.parseInt(args[2]);
        }
        Pattern p = Pattern.compile(args[1],flag);
        Matcher mInput = Pattern.compile("\\w+\\.\\w+").matcher(args[0]); // comment3
        if (mInput.find()){
            int index = 0;
            Matcher m = p.matcher("");
            System.out.println(args[0]);
            for (String line : new TextFile(args[0])) {
                m.reset(line);
                while (m.find()){
                    System.out.println(index++ + ": " + m.group() + ": " + m.start());
                }
            }
        }
        Matcher m2Input = Pattern.compile("/\\w*[^.]$").matcher(args[0]);
        if (m2Input.find()){
            File[] files = new File(args[0]).listFiles();
            if(files != null){
            System.out.println("root dir of files: " + Arrays.asList(files));
            for (File f: files) {
                int index = 0;
                Matcher m = p.matcher("");
                for (String line : new TextFile(f.getAbsolutePath())) {
                    m.reset(line);
                    while (m.find()) {
                        System.out.println(f.getName() + ": " + index++ + ": " + m.group() + ": " + m.start());
                    }
                }
                System.out.println();
            }
            } else {System.out.println("Нет такой директории или файла " + args[0]);
                System.exit(0);
            }
        }
        mInput.reset();
        m2Input.reset();
        if(!(m2Input.find() || mInput.find())){
            System.out.println("Нет такой директории или файла " + args[0]);
            System.exit(0);
        }
    }
}

