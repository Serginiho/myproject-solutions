package com.homecompany.chapter15.exercise24;

import com.homecompany.chapter15.exercise21.*;

import java.util.HashMap;
import java.util.Map;

class ClassTypeCapture2<T> {
    private Map<String, FactoryInterface<T>> map;
    public <F extends FactoryInterface<T>> ClassTypeCapture2 (String typename, F factory){
        this.map = new HashMap<>();
        map.put(typename, factory);
    }
    <F extends FactoryInterface<T>> void addFactory(String typename, F factory){
        map.put(typename, factory);
    }
    T createNew (String typename){
        if (map.containsKey(typename))
            return map.get(typename).create();
        System.out.println("Factory not available");
        return null;
    }

    public static void main(String[] args) {
        ClassTypeCapture2<Building> capture1 = new ClassTypeCapture2<Building>("Building", new BuildingFactory());
        ClassTypeCapture2<House> capture2 = new ClassTypeCapture2<House>("House", new HouseFactory());
        System.out.println("capture1: " + capture1.map);
        System.out.println("capture2: " + capture2.map);
        Building b = capture1.createNew("Building");
        House h2 = (House) capture1.createNew("House");
        House h = capture2.createNew("House");
        System.out.println(h instanceof Building);
        System.out.println(b instanceof Building);
        System.out.println(b instanceof House);
        System.out.println(h instanceof House);
    }
}
