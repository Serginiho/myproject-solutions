package com.homecompany.chapter14.exercise8_9;

import java.util.Arrays;

class HierarchyOfClasses {
    static void getHierarchy(Class c){
        while (c.getSuperclass() != null){
            System.out.println("Класс: " + c.getSimpleName() + ", поля класса: " + Arrays.toString(c.getDeclaredFields()));
            System.out.println("Родительский класс: " + c.getSuperclass().getSimpleName());
            c = c.getSuperclass();
        }
    }
    public static void main (String[] args){
        if (args.length < 1){
            System.out.println("Напишите класс для проверки иерархии");
            System.exit(0);
        }
        Object obj = null;
        try {
            obj = Class.forName(args[0]);
        } catch (ClassNotFoundException e) {
            System.out.println("Не удается найти класс: " + args[0]);
            System.exit(1);
        }
        getHierarchy((Class) obj);
    }
}
