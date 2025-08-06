package com.threading.basics;

public class ThreadByImplementing implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread is running using Runnable: "
                +Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new ThreadByImplementing(), "Runnable-1");
        thread.start();
    }
}
