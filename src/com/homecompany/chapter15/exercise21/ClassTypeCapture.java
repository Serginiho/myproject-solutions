package com.homecompany.chapter15.exercise21;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

class ClassTypeCapture {
//    Class<?> kind;
    private Map<String, Class<?>> map;
//    public ClassTypeCapture (Class<?> kind, Map<String, Class<?>> map)
    public ClassTypeCapture(String typename, Class<?> kind){
        this.map = new HashMap<>();
        map.put(typename, kind);
    }
    void addType (String typename, Class<?> kind){
        map.put(typename, kind);
    }
     Object createNew (String typename) {
        if (map.containsKey(typename))
        try {
            return map.get(typename).getDeclaredConstructor().newInstance();
        } catch (NoSuchMethodException | IllegalAccessException | InstantiationException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
        System.out.println(typename + " class not available");
         return null;
     }

    public static void main(String[] args) {
        ClassTypeCapture ctc = new ClassTypeCapture("Building", Building.class);
        ClassTypeCapture ctc2 = new ClassTypeCapture("House", House.class);
        ctc.addType("House", House.class);
//        ctc.addType("Building", Building.class);
//        ctc2.addType("House", House.class);
        ctc2.addType("Building", Building.class);
        ctc2.addType("String", String.class);
        System.out.println("ctc.map:  " + ctc.map);
        System.out.println("ctc2.map:  " + ctc2.map);
        Building b = (Building) ctc.createNew("Building");
        House h = (House) ctc.createNew("House");
        Building b2 = (Building) ctc2.createNew("House");
        House h2 = (House) ctc2.createNew("House");
        String s = (String)ctc2.createNew("String");
        ctc2.createNew("Coffee");
        System.out.println("s: " + s.getClass().getSimpleName());
        System.out.println("b: " + b.getClass().getSimpleName());
        System.out.println("h: " + h.getClass().getSimpleName());
        System.out.println("b2: " + b2.getClass().getSimpleName());
        System.out.println("h2: " + h2.getClass().getSimpleName());
        System.out.println(b instanceof House);
        System.out.println(h instanceof Building);
        System.out.println(b2 instanceof House);
        System.out.println(h2 instanceof Building);
    }
}
