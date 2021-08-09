package com.homecompany.chapter14.exercise20;

import java.util.Arrays;
import java.util.regex.Pattern;

public class ClassInfo {
    private static Pattern p = Pattern.compile("\\w+\\.");
    public static void main(String[] args){
        if(args.length < 1){
            System.out.println("Укажите полное имя класса");
            System.exit(0);
        }

        try {
            Class<?> c = Class.forName(args[0]);
            System.out.println(c.getSimpleName());
            System.out.println(c.getCanonicalName());
            System.out.println(c.getPackageName());
            System.out.println(c.getFields().length < 1 ? "none Fields" : Arrays.toString(c.getFields()));
            System.out.println(c.getAnnotations().length < 1 ? "none Annotations" : Arrays.toString(c.getAnnotations()));
            System.out.println(c.getInterfaces().length < 1 ? "none Interface" : Arrays.toString(c.getInterfaces()));
            System.out.println(c.getConstructors().length < 1 ? "none public Constructors" : Arrays.toString(c.getConstructors()));
            System.out.println(c.getDeclaredConstructors().length < 1 ? "none Constructors" : Arrays.toString(c.getDeclaredConstructors()));
            System.out.println(c.getDeclaredMethods().length < 1 ? "none Methods" : Arrays.toString(c.getDeclaredMethods()));
            System.out.println(c.getComponentType() != null ? c.getComponentType() : "none Component Type" );
            System.out.println(c.getClasses().length < 1 ? "none Classes" : Arrays.toString(c.getClasses()));
            System.out.println(c.getModifiers());
            System.out.println(c.getModule());
            System.out.println(c.getNestHost());
            System.out.println(Arrays.toString(c.getNestMembers()));
            System.out.println(c.getTypeName());
            System.out.println(Arrays.toString(c.getTypeParameters()));
            System.out.println(c.getEnclosingClass());
        } catch (ClassNotFoundException e) {
            System.out.println("Нет такого класса: " + e);
        }

    }
}
