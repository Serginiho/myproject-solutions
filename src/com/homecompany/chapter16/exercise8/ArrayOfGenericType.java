package com.homecompany.chapter16.exercise8;

import java.util.Arrays;

public class ArrayOfGenericType {
    static Object[] makeArray (int size){
        return new Object[size];
    }

    public static void main(String[] args) {

        Object[] strings = makeArray(10);
        System.out.println(Arrays.toString(strings));
        for (int i = 0; i < strings.length; i++) {
 //           strings[i] = new BerylliumSphere(); //не возможно осущетсвляется проверка времени компеляции
            strings[i] = "a";
        }
        System.out.println(Arrays.toString(strings));
        for (int i = 0; i < strings.length; i++) {
            strings[i] = i;
        }
        System.out.println(Arrays.toString(strings));
        Object[] obj = new Object[]{1,2,3,4,5};
        System.out.println(Arrays.toString(obj));
    }
}
