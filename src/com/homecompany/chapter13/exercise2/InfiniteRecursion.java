package com.homecompany.chapter13.exercise2;

import java.util.ArrayList;
import java.util.List;

class InfiniteRecursion {
    @Override
    public String toString() {
        return "InfiniteRecursion address: " + super.toString() + "\n";
    }
    public static void main (String[] args){
        List<InfiniteRecursion> v = new ArrayList<>();
        for (int i=0; i<10; i++)
            v.add(new InfiniteRecursion());
        System.out.print(v);
    }
}
