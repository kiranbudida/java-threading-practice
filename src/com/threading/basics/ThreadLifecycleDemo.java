package com.threading.basics;

public class ThreadLifecycleDemo {
    public static void main(String[] args) {

        Thread thread = new Thread(() -> {
            System.out.println("Thread is running: "+Thread.currentThread().getName());
            try{
                Thread.sleep(2000);
                System.out.println("Thread woke up:"+Thread.currentThread().getName());
            }
            catch(InterruptedException e) {
                System.out.println("Thread is interrupted :"+Thread.currentThread().getName());
            }
        });

        System.out.println("Thread state before start:"+thread.getState());
        thread.start();
        System.out.println("Thread state after start:"+thread.getState());

        try {
            Thread.sleep(1000);
            System.out.println("Thread state during sleep:"+thread.getState());
            thread.join();
        }
        catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }

        System.out.println("Thread state after completion:"+thread.getState());
    }
}
