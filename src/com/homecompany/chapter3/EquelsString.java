package com.homecompany.chapter3;

public class EquelsString {

    public void equelString (String x, String z){
        System.out.println("Проверка на равенство: " + (x == z));
        System.out.println("Проверка на неравенство: " + (x != z));
        System.out.println("Проверка через equals: " + x.equals(z));
    }
    public static void main (String[] args){
        EquelsString es = new EquelsString();
        String r = "Проверка";
        String h = "Проверка";
        String l = "Ошибка";
        System.out.println("Проверка для пары r и h:");
        es.equelString(r,h);
        System.out.println("Проверка для пары r и l:");
        es.equelString(r,l);
    }
}

