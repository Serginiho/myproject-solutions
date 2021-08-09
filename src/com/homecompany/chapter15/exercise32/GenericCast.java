package com.homecompany.chapter15.exercise32;

import com.homecompany.chapter15.exercise33.FixedSizeStack2;

public class GenericCast {
    public static final int SIZE = 15;

    public static void main(String[] args) {
        FixedSizeStack<String> stringStack = new FixedSizeStack<>(SIZE);
        FixedSizeStack2<String> stringStack2 = new FixedSizeStack2<>();
        for (String s: "A B C D E F G H J K L M N O P".split(" ")) {
            stringStack.push(s);
            stringStack2.push(s);
        }
        System.out.println("stringStack: ");
        for (int i = 0; i < SIZE; i++) {
            System.out.print(stringStack.pop() + " ");
        }
        System.out.println();
        System.out.println("stringStack2: ");
        for (int i = 0; i < SIZE; i++) {
            System.out.print(stringStack2.pop() + " ");
        }
    }
}
