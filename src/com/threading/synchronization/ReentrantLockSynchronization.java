package com.threading.synchronization;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockSynchronization {
    private int count = 0;

    private final ReentrantLock lock = new ReentrantLock(); //Explicit lock

    public void increment() {
        lock.lock(); //Acquire the lock
        try {
            for (int i = 0; i < 1000; i++) {
                count++;
            }
        } finally {
            lock.unlock(); //Always release the lock
        }
    }

    public int getCount() {
        return count;
    }

    public static void main(String[] args) throws InterruptedException {
        ReentrantLockSynchronization counter = new ReentrantLockSynchronization();

        Thread thread1 = new Thread(counter::increment);
        Thread thread2 = new Thread(counter::increment);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("Final count: "+counter.getCount());
    }
}
