package com.threading.basics;

public class ThreadRunVsStart extends Thread {

    public void run() {
        System.out.println("run() called by : "+Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        ThreadRunVsStart thread = new ThreadRunVsStart();
        thread.start(); //creates a new thread

        thread.run(); //runs on main thread
    }
}
