package com.homecompany.chapter16.exercise25;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class MyList extends ArrayList<Integer> {
    private ArrayList<Integer> arrayList;
    MyList (ArrayList<Integer> arrayList){
        this.arrayList = arrayList;
    }
     ArrayList<Integer> getReversed () {
         ArrayList<Integer> reversed = new ArrayList<>(this.arrayList);
         reversed.sort(Comparator.reverseOrder());
         return reversed;
    }
    public static void main(String[] args) {
        ArrayList<Integer> aList = new ArrayList<>();
        System.out.println(aList.getClass().getSimpleName());
        aList.addAll(Arrays.asList(1,2,3,4,5));
        System.out.println(aList);
        System.out.println(aList.get(4));
        aList.add(6);
        aList.addAll(Arrays.asList(7,8));
        System.out.println(aList);
        List<Integer> subAList = aList.subList(2,4);
        System.out.println(subAList);
        MyList list2 = new MyList(aList);
        System.out.println(list2.getClass().getSuperclass().getSimpleName());
        System.out.println(list2.getReversed());
    }
}
