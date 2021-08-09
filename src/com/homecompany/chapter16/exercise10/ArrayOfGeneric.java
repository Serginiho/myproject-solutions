package com.homecompany.chapter16.exercise10;

import com.homecompany.chapter16.exercise1.BerylliumSphere;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class ArrayOfGeneric {
    public static void main(String[] args) {
        List<List<String>> ls;
        ls = new ArrayList<>();
        ls.add(new ArrayList<>(Arrays.asList("d","f","g")));
        System.out.println(ls);
        List<List<Object>> obj = new ArrayList<>();
 //       obj = ls;
        obj.add(Collections.singletonList(new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6))));
        System.out.println(obj);
        obj.add(Collections.singletonList(new ArrayList<String>(Arrays.asList("a","b","c"))));
        System.out.println(obj);
        obj.add(Collections.singletonList(ls));
        System.out.println(obj);
        for (List<Object> o:
             obj) {
            for (Object p:
                 o) {
                System.out.println(p + " " + p.getClass().getSimpleName());
                }
            }
        List<BerylliumSphere> berylliumSpheres = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            berylliumSpheres.add(new BerylliumSphere());
        }
        System.out.println(berylliumSpheres);
    }
}
