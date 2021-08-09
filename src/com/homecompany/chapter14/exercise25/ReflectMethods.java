package com.homecompany.chapter14.exercise25;

import com.homecompany.chapter14.exercise24.NullPart;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class ReflectMethods {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Method [] m = NullPart.class.getDeclaredMethods();
        System.out.println(Arrays.toString(m));
        for (Method a: m){
            a.setAccessible(true);
            a.invoke(new NullPart());
        }

    }
}
