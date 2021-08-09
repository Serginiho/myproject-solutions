package com.homecompany.chapter15.exercise13;

import com.homecompany.generics.Coffee;
import com.homecompany.generics.CoffeeGenerator;
import util.Generator;

import java.util.*;

public class Generators {
    public static <T> List<T> fill (List<T> list, Generator<T> gen, int n){
        for(int i=0; i<n; i++)
            list.add(gen.next());
        return list;
    }
    public static <T> Set<T> fill (Set<T> set, Generator<T> gen, int n) {
        for (int i = 0; i < n; i++)
            set.add(gen.next());
        return set;
    }
    public static <T> Queue<T> fill (Queue<T> queue, Generator<T> gen, int n) {
        for (int i = 0; i < n; i++)
            queue.add(gen.next());
        return queue;
    }
    public static void main(String[] args) {
        List<Coffee> cl = fill(new ArrayList<>(), new CoffeeGenerator(), 5);
        Set<Coffee> cs = fill(new HashSet<>(), new CoffeeGenerator(), 5);
        Queue<Coffee> qp = fill(new ArrayDeque<>(), new CoffeeGenerator(), 5);
        for (Coffee c: cl)
            System.out.print(c + " ");
        System.out.println();
        for (Coffee c: cs)
            System.out.print(c + " ");
        System.out.println();
        for (Coffee c: qp)
            System.out.print(c + " ");
    }
}
