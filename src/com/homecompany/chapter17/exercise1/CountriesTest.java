package com.homecompany.chapter17.exercise1;

import util.Countries;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

class CountriesTest {
    public static void main(String[] args) {
        List<String> cAList = new ArrayList<>(Countries.names());
        List<String> cLList = new LinkedList<>(Countries.names());
        System.out.println("cAList size(" + cAList.size()+ "): " + cAList);
        System.out.println("cLList size(" + cLList.size()+ "): " + cLList);
        Collections.shuffle(cAList);
        Collections.shuffle(cLList);
        System.out.println("After 1 shuffle:");
        System.out.println("cAList size(" + cAList.size()+ "): " + cAList);
        System.out.println("cLList size(" + cLList.size()+ "): " + cLList);
        Collections.shuffle(cAList);
        Collections.shuffle(cLList);
        System.out.println("After 2 shuffle:");
        System.out.println("cAList size(" + cAList.size()+ "): " + cAList);
        System.out.println("cLList size(" + cLList.size()+ "): " + cLList);
        Collections.shuffle(cAList);
        Collections.shuffle(cLList);
        System.out.println("After 3 shuffle:");
        System.out.println("cAList size(" + cAList.size()+ "): " + cAList);
        System.out.println("cLList size(" + cLList.size()+ "): " + cLList);
        for (int i = 4; i < 11; i++) {
            Collections.shuffle(cAList);
            Collections.shuffle(cLList);
            System.out.println("After " + i + " shuffle:");
            System.out.println("cAList size(" + cAList.size()+ "): " + cAList);
            System.out.println("cLList size(" + cLList.size()+ "): " + cLList);
        }
    }
}
