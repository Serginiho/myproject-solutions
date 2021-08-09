package com.homecompany.chapter11.exercise15;

import java.util.Arrays;

class StackTest {
    public static void main (String[] args) {
        Stack<Character> stack = new Stack<>();
        String str = "+U+n+c---+e+r+t---+a-+i-+n+t+y---+ -+r+u--+l+e+s---";
        char [] strChar = str.toCharArray();
        System.out.println(Arrays.toString(strChar));
        for (int i = 0; i< strChar.length; i++){
            if (strChar[i] == '+'){
                stack.push(strChar[i+1]);
            } else if (strChar[i] == '-'){
                System.out.print(stack.pop());
            }
        }
    }
}
