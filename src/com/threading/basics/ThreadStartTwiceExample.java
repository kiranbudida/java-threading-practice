package com.threading.basics;

public class ThreadStartTwiceExample extends Thread {

    public void run() {
        System.out.println("Thread is running...");
    }

    public static void main(String[] args) {
        ThreadStartTwiceExample thread = new ThreadStartTwiceExample();
        thread.start();

        try {
            thread.start();
        }
        catch(IllegalThreadStateException e) {
            System.out.println("Thread cannot be started twice!");
        }
    }
}
