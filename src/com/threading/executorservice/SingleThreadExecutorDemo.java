package com.threading.executorservice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadExecutorDemo {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newSingleThreadExecutor();

        for (int i = 1; i <= 5; i++) {
            final int taskId = i;

            executor.execute(() -> {
                System.out.println("Task "+taskId+" is executed by "
                        +Thread.currentThread().getName());
            });
        }
    }
}
