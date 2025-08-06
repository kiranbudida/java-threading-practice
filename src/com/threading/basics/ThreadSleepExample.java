package com.threading.basics;

public class ThreadSleepExample extends Thread {
    public void run() {
        try{
            Thread.sleep(1000);
            System.out.println("Thread woke up after 1 second :"
                + Thread.currentThread().getName());
        }
        catch(InterruptedException e) {
            System.out.println("Thread interrupted");
        }
    }

    public static void main(String[] args) {
        ThreadSleepExample thread = new ThreadSleepExample();

        thread.start();
    }
}
