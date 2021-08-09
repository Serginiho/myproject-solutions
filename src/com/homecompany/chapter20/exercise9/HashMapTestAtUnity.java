package com.homecompany.chapter20.exercise9;

import util.atunit.AtUnit;
import util.atunit.Test;

import java.util.HashMap;
import java.util.Map;

public class HashMapTestAtUnity {
    static String key = "";
    static int value = 1;
    Map<String,Integer> map = new HashMap<>();
    @Test
    boolean _methodPut () {
        map.put(key,value);
        return map.get(key) == value;
    }
    @Test
    boolean _methodContainsKey () {
        map.put(key, value);
        return map.containsKey(key);
    }
    @Test
    boolean _methodContainsValue () {
        map.put(key,value);
       return map.containsValue(value);
    }

    public static void main(String[] args) {
        try {
            AtUnit.main(args);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
