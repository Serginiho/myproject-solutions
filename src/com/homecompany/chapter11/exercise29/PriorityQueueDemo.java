package com.homecompany.chapter11.exercise29;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

class PriorityQueueDemo {
    public static void main (String[] args) {
        List<PriorityQueueDemo> demoList = new ArrayList<>(Arrays.asList(new PriorityQueueDemo(), new PriorityQueueDemo(), new PriorityQueueDemo()));
        PriorityQueue<PriorityQueueDemo> queueDemos = new PriorityQueue<>(demoList); // не возможно добавить - ClassCastException
        System.out.println(queueDemos);
    }
}
