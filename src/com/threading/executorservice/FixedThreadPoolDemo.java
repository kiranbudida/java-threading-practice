package com.threading.executorservice;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.*;

public class FixedThreadPoolDemo {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        for (int i = 1; i <= 5; i++) {
            final int taskId = i;

            executor.execute(()->{
                System.out.println("Task "+taskId+" executed by "
                        +Thread.currentThread().getName());
            });
        }

        executor.shutdown();
    }
}
