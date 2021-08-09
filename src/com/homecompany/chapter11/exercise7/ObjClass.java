package com.homecompany.chapter11.exercise7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ObjClass {
    ObjClass (int i){
        System.out.println("ObjClass: " + i);
    }
    public static void main (String[] args){
        ObjClass[] objClasses = {
                new ObjClass(1),
                new ObjClass(2),
                new ObjClass(3),
                new ObjClass(4)
        };
        System.out.println(Arrays.toString(objClasses));
        List<ObjClass> oc = new ArrayList<>(Arrays.asList(objClasses));
        System.out.println(oc);
        List<ObjClass> sub = oc.subList(1,3);
        System.out.println(sub);
        oc.removeAll(sub);
        System.out.println(oc);
    }
}
