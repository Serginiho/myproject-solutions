package com.homecompany.chapter11.exercise27;

import java.util.Queue;

class QueuePrint {
    static void showQ (Queue<Command> q){
        for (Command c:
             q) {
            c.operation();
        }
    }
    public static void main (String[] args){
        QueueClass qc = new QueueClass();
        showQ(qc.makeQ(new Command("This first element"), new Command("First string"), new Command("Second String"), new Command("Third String")));
    }
}
