package com.threading.concurrency;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Solves the race condition using AtomicInteger — a lock-free, thread-safe counter.
 */
public class AtomicDemo {

    private static AtomicInteger counter = new AtomicInteger(0);
    public static void main(String[] args) throws InterruptedException {

        Runnable task = () -> {
            for (int i = 0; i<1000; i++) {
                counter.incrementAndGet();// atomic operation
            }
        };

        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        //always prints 2000
        System.out.println("Final Counter: "+counter.get());
    }
}
