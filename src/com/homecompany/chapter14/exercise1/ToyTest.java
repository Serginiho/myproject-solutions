package com.homecompany.chapter14.exercise1;

public class ToyTest {
    static void printInfo (Class cc){
        System.out.println("Имя класса: " + cc.getName() + " является интерфейсом? [" + cc.isInterface() + "]");
        System.out.println("Простое имя: " + cc.getSimpleName());
        System.out.println("Каноничное имя: " + cc.getCanonicalName());
    }
    public static void main (String[] args){
        Class c = null;
        try {
            c = Class.forName("com.homecompany.chapter14.exercise1.FancyToy");
        } catch (ClassNotFoundException e) {
            System.out.println("Не удается найти класс");
            System.exit(1);
        }
        printInfo(c);
        for (Class face: c.getInterfaces()){
            printInfo(face);
        }
        Class up = c.getSuperclass();
        Object obj = null;
        try {
            obj = up.newInstance();
        } catch (InstantiationException e) {
            System.out.println("Не удалось создать экземпляр");
            System.exit(1);
        } catch (IllegalAccessException e) {
            System.out.println("Отказано в доступе");
            System.exit(1);
        }
        printInfo(obj.getClass());
    }
}
