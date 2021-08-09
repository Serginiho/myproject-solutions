package com.homecompany.chapter11.exercise22;

import java.util.LinkedHashMap;
import java.util.Map;

class MapWords {
    private Integer countWords;
    private Map<String, Integer> mapOfW = new LinkedHashMap<>();
    void put (String s){
        countWords = mapOfW.get(s);
        mapOfW.put(s, countWords == null ? 1 : countWords+1);
    }
    @Override
    public String toString() {
        return mapOfW.toString();
    }
}
