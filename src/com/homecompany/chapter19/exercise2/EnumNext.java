package com.homecompany.chapter19.exercise2;

public class EnumNext {
    static void printNextCartoonCharacter() {
        System.out.println(CartoonCharacters.next() + ", ");
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            printNextCartoonCharacter();
        }
    }
}
