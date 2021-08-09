package com.homecompany.chapter17.exercise11;

import java.util.PriorityQueue;

class TestIntQueue {
    public static void main(String[] args) {
        PriorityQueue<IntQueue> priorityQueue = new PriorityQueue<>();
        for (int i = 0; i < 20; i++) {
            priorityQueue.add(new IntQueue());
        }
        System.out.println(priorityQueue);
        while (!priorityQueue.isEmpty())
            System.out.print(priorityQueue.poll() + " ");
    }
}
