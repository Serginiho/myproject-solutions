package com.homecompany.chapter11.exercise27;

import java.util.LinkedList;
import java.util.Queue;

class QueueClass {
    private Queue<Command> queue;
    QueueClass() {
        this.queue = new LinkedList<>();
    }
      Queue<Command> makeQ (Command... c){
          for (Command v:
               c) {
              queue.offer(v);
          }
          return queue;
    }
}
