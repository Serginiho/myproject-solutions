package com.homecompany.chapter9.exercise5;

class Changestr {
    protected String changeStr (String s){
        char[] strArray = new char[s.length()];
        if (s.length()%2==0){
            for (int i = 0; i<s.length();i+=2){
                strArray[i] = s.charAt(i+1);
                strArray[i+1] = s.charAt(i);
 /*               strArray[i+2] = s.charAt(i);
                strArray[i+3] = s.charAt(i+1);*/
            }
        } else {
            for (int i = 0; i<s.length()-1;i+=2){
                strArray[i] = s.charAt(i+1);
                strArray[i+1] = s.charAt(i);
 /*               strArray[i+2] = s.charAt(i);
                strArray[i+3] = s.charAt(i+1);*/
            }
            strArray[s.length()-1] = s.charAt(s.length()-1);
        }
        return new String(strArray);
    }
}
