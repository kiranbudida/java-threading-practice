package com.threading.basics;

public class ThreadJoinExample extends Thread{

    public void run() {
        System.out.println("Thread running: "+Thread.currentThread().getName());
    }

    public static void main(String[] args) throws InterruptedException {

        ThreadJoinExample thread1 = new ThreadJoinExample();
        thread1.start();

        thread1.join(); //wait for thread1 to finish

        System.out.println("Main thread after thread1 is done");
    }
}
