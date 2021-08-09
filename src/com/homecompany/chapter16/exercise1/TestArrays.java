package com.homecompany.chapter16.exercise1;

import java.util.Arrays;

class TestArrays {
    public static void testArray (BerylliumSphere[] spheres){
        System.out.println(Arrays.toString(spheres));
    }
    public static <T> void testArray (T[] t){
        System.out.println(Arrays.toString(t));
    }

    public static void main(String[] args) {
        //Динамическая группавая инициализация работает в аргумнете метода:
        testArray(new BerylliumSphere[]{new BerylliumSphere(), new BerylliumSphere(), new BerylliumSphere()});
        //Обычная группа инициаилизация не работает в аргументе метода:
 //       testArray(BerylliumSphere[] d = {new BerylliumSphere(), new BerylliumSphere()});
        BerylliumSphere[] d = {new BerylliumSphere(), new BerylliumSphere(), new BerylliumSphere()};
        testArray(d);
        testArray(new Integer[]{1, 2, 3});
        Integer[] ia;
        ia = new Integer[]{1,2,3,};
        testArray(ia);
        Object[] o = {1,2,3,4,5};
        testArray(new Object[]{1,2,3,4});
        testArray(o);
    }
}
