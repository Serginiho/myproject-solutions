package com.homecompany.chapter11.chapterexemple;

import java.util.ArrayList;

public class ApplesAndOrangesWithoutGenerics {
 //   @SuppressWarnings("unchecked")
    public static void main (String[] args){
/*        ArrayList apples = new ArrayList();
        for (int i = 0; i < 3; i++)
            apples.add(new Apple());
        apples.add(new Orange());
        for (int i = 0; i < apples.size(); i++)
            ((Apple)apples.get(i)).id();*/ // ClassCastException: Orange не возможно возвести к Apple
        ArrayList <Apple> apples = new ArrayList<>();
        for (int i = 0; i < 3; i++)
            apples.add(new Apple());
 //       apples.add(new Orange()); // не возможно, так как тип не совпадает
        for (Apple c:
             apples) {
            System.out.println(c.id());
        }
    }
}
