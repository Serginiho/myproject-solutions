package com.homecompany.chapter11.exercise14;

import java.util.LinkedList;
import java.util.ListIterator;

class MyLinkedList {
    static void addMidl (LinkedList<Integer> l, Integer [] ia){
        for (Integer i: ia){
            ListIterator<Integer> iterator = l.listIterator((l.size()) / 2);
            iterator.add(i);}
        System.out.print(l);
    }
    public static void main(String[] args) {
        LinkedList<Integer> integers = new LinkedList<>();
        Integer [] i = {1,2,3,4,5,6,7,8,9,10};
        MyLinkedList.addMidl(integers, i);
    }
}