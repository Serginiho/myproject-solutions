package com.homecompany.chapter17.exercise12;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

class MapTest {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        Map<String, String> map1 = new TreeMap<>();
        Map<String, String> map2 = new LinkedHashMap<>();
        map.put("sky", "blue");
        map1.put("sky", "blue");
        map2.put("sky", "blue");
        map.put("grass", "green");
        map1.put("grass", "green");
        map2.put("grass", "green");
        map.put("ocean", "dancing");
        map1.put("ocean", "dancing");
        map2.put("ocean", "dancing");
        map.put("tree", "tall");
        map1.put("tree", "tall");
        map2.put("tree", "tall");
        map.put("earth", "brown");
        map1.put("earth", "brown");
        map2.put("earth", "brown");
        map.put("sun", "warm");
        map1.put("sun", "warm");
        map2.put("sun", "warm");
        map.put("extra", "object");
        map1.put("extra", "object");
        map2.put("extra", "object");
        System.out.println(map);
        System.out.println(map1);
        System.out.println(map2);
        System.out.println(map.get("ocean"));
        System.out.println(map1.get("ocean"));
        System.out.println(map2.get("ocean"));
    }
}
