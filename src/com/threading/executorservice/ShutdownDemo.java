package com.threading.executorservice;

import java.util.TreeMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ShutdownDemo {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        for (int i = 1; i <= 5; i++) {
            final int taskId = i;
            executor.execute(()->{
                System.out.println("Task "+taskId+" running by "
                        + Thread.currentThread().getName());
            });
        }

        executor.shutdown();

        System.out.println("All tasks submitted.");
    }
}
