package com.homecompany.chapter17.exercise26;

import util.ConvertTo;
import util.Generated;
import util.RandomGenerator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountedString {
    private static List<String> created = new ArrayList<>();
    private String s;
    private int id = 0;
    private char c;
    public CountedString (String str, Character c) {
        this.c = c;
        s = str;
        created.add(s);
        for (String str2: created)
            if (str2.equals(s))
                id++;
    }

    @Override
    public String toString() {
        return "String: " + s + ", id: " + id + ", Character: " + c + ", hashcode: " + hashCode();
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof CountedString && s.equals(((CountedString) o).s) && id == ((CountedString) o).id
                && c == ((CountedString) o).c;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 37*result + s.hashCode();
        result = 37*result + (int)c;
        result = 37*result + id;
        return result;
    }
    public static void main(String[] args) {
       Map<CountedString, Integer> map = new HashMap<>();
       CountedString[] cs = new CountedString[5];
       char[] chars = ConvertTo.primitive(Generated.array(new Character[5], new RandomGenerator.Character()));
        for (int i = 0; i < cs.length; i++) {
            cs[i] = new CountedString("hi" , chars[i]);
            map.put(cs[i], i);
        }
        System.out.println(map);
        for (CountedString csString: cs){
            System.out.println("Looking up: " + csString);
            System.out.println(map.get(csString));
        }
    }
}
