package com.homecompany.chapter14.exercise7;

class SweetShop {
    public static void main(String[] args){
        if(args.length < 1){
            System.out.println("Напишите класс для загрузки");
            System.exit(0);
        }
        Class c = null;
        try {
            c = Class.forName(args[0]);
            System.out.println("Класс: " + c.getSimpleName() + "-интерфейс? [" + c.isInterface() + "]");
        } catch (ClassNotFoundException e) {
            System.out.println("Не удается найти класс: " + args[0]);
            System.exit(1);
        }
    }
}
