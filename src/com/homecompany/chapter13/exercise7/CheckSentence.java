package com.homecompany.chapter13.exercise7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class CheckSentence {
    static boolean sentenceAnalise (String s){
        Pattern pattern = Pattern.compile("^[А-Я].+\\.$");
        Matcher matcher = pattern.matcher(s);
        return matcher.matches();
    }
    public static void main (String[] args){
        System.out.println(sentenceAnalise("Первый второй третий."));
    }
}
