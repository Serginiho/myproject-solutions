package com.homecompany.chapter11.exercise11;

import java.util.*;

class MyIterator {
    public static void display(Collection<Object> collection){
        Iterator<Object> objectIterator = collection.iterator();
        while (objectIterator.hasNext()){
            Object o = objectIterator.next();
            System.out.print(o.toString() + " ");
        }
        System.out.println();
    }
    public static void main (String[] args){
        ArrayList<Object> stringArrayList = new ArrayList<>();
        stringArrayList.add("pop");
        stringArrayList.add("chop");
        stringArrayList.add("mpop");
        stringArrayList.add("bpop");
        stringArrayList.add("npop");
        stringArrayList.add("lpop");
        display(stringArrayList);
        stringArrayList.add("pip - pop");
        LinkedList<Object> stringLinkedList = new LinkedList<>(stringArrayList);
        display(stringLinkedList);
        stringLinkedList.add("jip - bip - pop");
        HashSet<Object> objectHashSet = new HashSet<>(stringLinkedList);
        display(objectHashSet);
        TreeSet<Object> objectTreeSet = new TreeSet<>();
        Random rand = new Random();
        for (int i = 0; i<10; i++)
            objectTreeSet.add(rand.nextInt(10));
        display(objectTreeSet);
    }
}
