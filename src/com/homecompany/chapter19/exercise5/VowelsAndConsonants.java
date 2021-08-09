package com.homecompany.chapter19.exercise5;

import java.util.Random;

class VowelsAndConsonants {
    public static void main(String[] args) {
        TypeOfWord type = TypeOfWord.CONSONANT;
        Random rand = new Random();
        for (int i = 0; i < 100; i++) {
            int c = rand.nextInt(26) + 'a';
            System.out.print((char) c + ", " + c + ": ");
            for (TypeOfWord t:
                 TypeOfWord.values()) {
                if (t.contain(c,t))
                    type = t;
            }
                switch (type) {
                    case CONSONANT:
                        System.out.println(TypeOfWord.CONSONANT);
                        break;
                    case VOWEL:
                        System.out.println(TypeOfWord.VOWEL);
                        break;
                    case SOMETIMES_A_VOWEL:
                        System.out.println(TypeOfWord.SOMETIMES_A_VOWEL);
                        break;
                }
            }
    }
}