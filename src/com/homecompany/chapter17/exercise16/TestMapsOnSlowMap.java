package com.homecompany.chapter17.exercise16;

import com.homecompany.chapter17.exercise14.Maps;
import com.homecompany.chapter17.exercise15.SlowMap;

class TestMapsOnSlowMap {
    public static void main(String[] args) {
        Maps.testMap(new SlowMap<>());
        Maps.testMap(new SlowMap2<>());
    }
}
