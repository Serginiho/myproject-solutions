package com.homecompany.chapter17.exercise40;

import org.jetbrains.annotations.NotNull;
import util.RandomGenerator;

import java.util.*;

public class StringClass implements Comparable<StringClass>{
    String string1;
    String string2;
    public StringClass (String s1, String s2){
        string1 = s1;
        string2 = s2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StringClass that = (StringClass) o;
        return Objects.equals(string1, that.string1) && Objects.equals(string2, that.string2);
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 37*result + string1.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return  string1 + "=" + string2;
    }

    @Override
    public int compareTo(@NotNull StringClass o) {
        return  this.string1.compareTo(o.string1);
    }
    static class SCComparator implements Comparator<StringClass>{

        @Override
        public int compare(StringClass o1, StringClass o2) {
            Comparable<String> s2 = o1.string2;
            return s2.compareTo(o2.string2);
        }
    }
    public static void main(String[] args) {
        StringClass [] sc = new StringClass[5];
        List<StringClass> list = new ArrayList<>();
        RandomGenerator.String rg = new RandomGenerator.String();
        for (int i = 0; i < sc.length; i++) {
            String s1 = rg.next();
            String s2 = rg.next();
            sc[i] = new StringClass(s1,s2);
            list.add(new StringClass(s1,s2));
        }
        System.out.println("Before sort:");
        System.out.println("Array: " + Arrays.toString(sc));
        System.out.println("List: " + list);
        Arrays.sort(sc);
        Collections.sort(list);
        System.out.println("-----------");
        System.out.println("After sort:");
        System.out.println("Array: " + Arrays.toString(sc));
        System.out.println("List: " + list);
        System.out.println("-----------");
        System.out.println("After sort with comparator:");
        SCComparator comp = new SCComparator();
        Arrays.sort(sc, comp);
        list.sort(comp);
        System.out.println("Array: " + Arrays.toString(sc));
        System.out.println("List: " + list);
        System.out.println("-----------");
        System.out.println("Binary search with comparator:");
        StringClass key = sc[3];
        int index = Arrays.binarySearch(sc, key, comp);
        System.out.println(sc[index]);
        index = Collections.binarySearch(list, key, comp);
        System.out.println(list.get(index));
    }
}
