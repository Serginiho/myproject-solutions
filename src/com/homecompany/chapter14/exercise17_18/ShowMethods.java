package com.homecompany.chapter14.exercise17_18;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.regex.Pattern;

class ShowMethods {
    private static Pattern p = Pattern.compile("(\\w+\\.)|\\s*native|\\s*final");
    public static void main(String[] arg){
        if (arg.length < 1){
            System.out.println("Введите имя класса или имя класса и наименование метода для поиска");
            System.exit(0);
        }
        int lines = 0;
        try {
            Class<?> c = Class.forName(arg[0]);
            Method[] methods = c.getMethods();
            Constructor<?>[] cons = c.getConstructors();
            System.out.println(Arrays.toString(methods));
            System.out.println(Arrays.toString(cons));
            if(arg.length == 1){
                for (Method method: methods)
                    System.out.println(p.matcher(method.toString()).replaceAll(""));
                for (Constructor<?> constructor: cons)
                    System.out.println(p.matcher(constructor.toString()).replaceAll(""));
                lines = methods.length + cons.length;
            }else {
                for (Method method: methods)
                    if (method.toString().contains(arg[1])){
                        System.out.println(p.matcher(method.toString()).replaceAll(""));
                        lines++;
                    }
                for (Constructor<?> constructor: cons)
                    if (constructor.toString().contains(arg[1])){
                        System.out.println(p.matcher(constructor.toString()).replaceAll(""));
                        lines++;
                    }
            }
        } catch (ClassNotFoundException e) {
            System.out.println("Нет такого класса: " + e);
        }
    }
}
