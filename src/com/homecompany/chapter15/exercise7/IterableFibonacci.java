package com.homecompany.chapter15.exercise7;

import com.homecompany.generics.Fibonacci;
import org.jetbrains.annotations.NotNull;

import java.util.Iterator;

public class IterableFibonacci implements Iterable<Integer>{
    private int n;
    public IterableFibonacci (int cont) {n=cont;}
    @NotNull
    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            Fibonacci fb = new Fibonacci();
            @Override
            public boolean hasNext() {
                return n>0;
            }

            @Override
            public Integer next() {
                n--;
                return fb.next();
            }
        };
    }
    public static void main (String[] args){
        for (int i: new IterableFibonacci(18))
            System.out.print(i + " ");
    }
}
