package com.homecompany.chapter17.exercise7;

import util.Countries;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

class ListTest {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>(Countries.names(10));
        LinkedList<String> linkedList = new LinkedList<>(Countries.names(10));
        Iterator<String> it = arrayList.iterator();
        System.out.println("arrayList:");
        while (it.hasNext())
            System.out.print(it.next() + " ");
        Iterator<String> itl = linkedList.iterator();
        System.out.println();
        System.out.println("linkedList:");
        while (itl.hasNext())
            System.out.print(itl.next() + " ");
        ListIterator<String> listItAL = arrayList.listIterator();
        ListIterator<String> listItLL = linkedList.listIterator();
        while (listItAL.hasNext()){
                listItAL.add(listItLL.next());
                listItAL.next();
        }
        System.out.println();
        System.out.println(arrayList);
        arrayList = new ArrayList<>(Countries.names(10));
        ListIterator<String> listItALR = arrayList.listIterator(arrayList.size());
        ListIterator<String> listItLLR = linkedList.listIterator();
        while (listItLLR.hasNext()){
            listItALR.add(listItLLR.next());
            listItALR.previous();
        }
        System.out.println(arrayList);
    }
}
