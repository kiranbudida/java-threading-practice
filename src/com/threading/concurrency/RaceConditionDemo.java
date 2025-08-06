package com.threading.concurrency;

/**
 * Demonstrates a race condition when multiple threads modify a shared variable without synchronization.
 */
public class RaceConditionDemo {

    private static int counter = 0;

    public static void main(String[] args) throws InterruptedException {

        Runnable task = () -> {
            for (int i=0; i<1000; i++) {
              counter++;//not thread safe
            }
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        //Expected 2000, but due to race condition actual may be < 2000
        System.out.println("Final counter: "+counter);
    }
}
