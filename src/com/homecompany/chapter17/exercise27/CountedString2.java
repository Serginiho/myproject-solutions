package com.homecompany.chapter17.exercise27;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class CountedString2 {
    private static List<String> created = new ArrayList<>();
    private String s;
    public CountedString2 (String str) {
        s = str;
        created.add(s);
    }

    @Override
    public String toString() {
        return "String: " + s + ", hashcode: " + hashCode();
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof CountedString2 && s.equals(((CountedString2) o).s);
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 37*result + s.hashCode();
        return result;
    }
    public static void main(String[] args) {
        Map<CountedString2, Integer> map = new HashMap<>();
        CountedString2[] cs = new CountedString2[5];
        for (int i = 0; i < cs.length; i++) {
            cs[i] = new CountedString2("hi");
            map.put(cs[i], i); // если в hashcode() не учитывать id, то при размещении в map объекты считаются как одинаковые
            // и помещаются один раз.
        }
        System.out.println(map);
        for (CountedString2 csString: cs){
            System.out.println("Looking up: " + csString);
            System.out.println(map.get(csString));
        }
    }
}
