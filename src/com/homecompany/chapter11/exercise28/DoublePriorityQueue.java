package com.homecompany.chapter11.exercise28;

import java.util.PriorityQueue;
import java.util.Random;

class DoublePriorityQueue {
    public static void main (String[] args){
        Random rand = new Random(100);
        PriorityQueue<Double> doubles = new PriorityQueue<>();
        for (int i = 0; i < 10; i++) {
            doubles.offer(rand.nextDouble());
        }
        while (doubles.peek()!=null){
        System.out.println(doubles.poll());}
    }
}
