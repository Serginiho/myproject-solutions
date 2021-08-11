package com.homecompany.chapter21.exercise3;

import com.homecompany.chapter21.exercise1.TaskA;
import com.homecompany.chapter21.exercise1.TaskB;
import com.homecompany.chapter21.exercise1.TaskC;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TaskInSingleThreadPool {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.execute(new TaskA());
        executorService.execute(new TaskB());
        executorService.execute(new TaskC());
        executorService.shutdown();
    }
}
