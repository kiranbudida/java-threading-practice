package com.threading.executorservice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CachedThreadPoolDemo {
    public static void main(String[] args) {
        /*
            Cached thread pools:
            Create new threads as needed.
            Reuse previously constructed threads if available.
            Ideal for short-lived asynchronous tasks.
            If a thread is idle for 60 seconds, it is terminated and removed from the pool.
         */
        ExecutorService executor = Executors.newCachedThreadPool();

        for (int i = 1; i <= 5; i++) {
            final int taskId = i;

            executor.execute(()->{
                System.out.println("Task "+taskId+" executed by "
                        + Thread.currentThread().getName() );
            });
        }

        executor.shutdown();
    }
}
