package com.homecompany.chapter11.exercise4;

import java.util.*;

public class NameGenerator {
    private int count = 0;
    public String next (){
        switch (count) {
            default:
            case 0:
                count++;
                return "Bob";
            case 1:
                count++;
                return "Garry";
            case 2: count++; return "Marry";
            case 3: count++; return "Pet";
            case 4: count++; return "Stewie";
            case 5: count++; return "Mag";
            case 6: count++; return "Brain";
            case 7: count = 0; return "Lous";
        }
    }
    public static Collection fill (Collection<String> collection, int n){
        NameGenerator ng = new NameGenerator();
        for (int i=0; i<n; i++){
            collection.add(ng.next());
        }
        return collection;
    }
    public static void main (String[] args){
        String[] array = new String[8];
        NameGenerator ng2 = new NameGenerator();
        for (int i = 0; i < array.length; i++){
            array[i] = ng2.next();}
            System.out.println("Array: " + Arrays.toString(array));

        System.out.println("ArrayList: " + fill(new ArrayList<String>(), 10));
        System.out.println("LinkedList: " + fill(new LinkedList<String>(), 25));
        System.out.println("HashSet: " + fill(new HashSet<String>(), 9));
        System.out.println("LinkedHashSet: " + fill(new LinkedHashSet<String>(), 9));
        System.out.println("TreeSet: " + fill(new TreeSet<String>(), 9));
    }
}
