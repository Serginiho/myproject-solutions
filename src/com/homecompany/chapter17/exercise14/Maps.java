package com.homecompany.chapter17.exercise14;

import com.homecompany.chapter17.exercise5.CountingMapData;

import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class Maps {
    public static <K,V> void printMapKey (Map<K,V> map) {
        System.out.print("Size " + map.size() + ", ");
        System.out.println("Keys: " + map.keySet());
    }
    public static void testMap(Map<Integer,String> map) {
        System.out.println(map.getClass().getSimpleName());
        System.out.println("First putAll:");
        map.putAll(new CountingMapData(25));
        printMapKey(map);
        //Map реализует поведение Set для ключей
        System.out.println("After second putAll:");
        map.putAll(new CountingMapData(25));
        printMapKey(map);
        System.out.print("Values: ");
        System.out.println(map.values());
        System.out.println(map);
        System.out.println("map.containsKey(11): "+ map.containsKey(11));
        System.out.println(map.get(11));
        System.out.println("map.containsValue(\"F0\"): " + map.containsValue("F0"));
        Integer key = map.keySet().iterator().next();
        System.out.println("First key in map is " + key);
        map.remove(key);
        printMapKey(map);
        map.clear();
        System.out.println("map.isEmpty(): " + map.isEmpty());
        map.putAll(new CountingMapData(25));
        map.keySet().removeAll(map.keySet());
        System.out.println("map.isEmpty(): " + map.isEmpty());
    }
    public static void testProperties(Properties properties) throws IOException {
        System.out.println(properties.getClass().getSimpleName());
        printMapKey(properties);
        System.out.print("Values: ");
        System.out.println(properties.values());
        System.out.println(properties);
        System.out.println("map.containsKey(0): "+ properties.containsKey(0));
        System.out.println(properties.get(0));
        System.out.println("map.containsValue(\"F0\"): " + properties.containsValue("F0"));
        Object key = properties.keySet().iterator().next();
        System.out.println("First key in map is " + key);
        properties.remove(key);
        printMapKey(properties);
        properties.clear();
        System.out.println("map.isEmpty(): " + properties.isEmpty());
    }

    public static void main(String[] args) throws IOException {
        testMap(new TreeMap<>());
        testMap(new HashMap<>());
        testMap(new LinkedHashMap<>());
        testMap(new IdentityHashMap<>());
        testMap(new WeakHashMap<>());
        testMap(new ConcurrentHashMap<>());
        Properties properties = new Properties();
        properties.load(new FileReader("/Applications/TomCat-9.0.38/webapps/examples/WEB-INF/classes/LocalStrings_ru.properties"));
        Map<Integer, String> mapOfKeysProperties = new HashMap<>();
        for (int i = 0; i < properties.size(); i++) {
            for (Object s:
                 properties.keySet()) {
                mapOfKeysProperties.put(i,(String)s);
            }
        }
        testProperties(properties);
        testMap(mapOfKeysProperties);
        printMapKey(mapOfKeysProperties);
        System.out.println("properties.values(): " + properties.values());
    }
}
