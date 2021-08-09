package com.homecompany.chapter19.exercise5;

import java.util.Locale;

public enum TypeOfWord {
    VOWEL('a', 'e', 'i', 'o', 'u' ),
    SOMETIMES_A_VOWEL('y', 'w'),
    CONSONANT('s', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm',
            'n','b', 'v', 'c', 'x', 'z', 'q', 'r', 't', 'p'),
    NOT_FOUND ('-');
    char[] type;
    TypeOfWord (char...args) {
        type = new char[args.length];
        System.arraycopy(args, 0, type, 0, type.length);
    }
    public boolean contain (int c, TypeOfWord t) {
            for (char a:
                 t.type) {
                if ((char)c == a)
                    return true;
            }
        return false;
    }

    @Override
    public String toString() {
        String type = name();
        String lower = type.substring(1).toLowerCase(Locale.ROOT);
        return type.charAt(0) + lower;
    }
}

