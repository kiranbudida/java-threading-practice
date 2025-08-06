package com.threading.concurrency;

/**
 * Demonstrates how volatile ensures visibility, but not atomicity.
 */
public class VolatileExample {
    private static volatile boolean isRunning = true;

    public static void main(String[] args) throws InterruptedException {
        Thread worker = new Thread(()-> {

            System.out.println("Worker thread started");
            while(isRunning) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println("Thread interrupted");
                }
                System.out.println("Executing the task");
            }
            System.out.println("Worker thread stopped");
        });

        worker.start();

        Thread.sleep(1000);

        isRunning = false;

        worker.join();

        System.out.println("Main thread is finished.");
    }
}
