package com.threading.basics;

public class ThreadByExtending extends Thread {

    public void run() {
        System.out.println("Thread is running using the Thread class: "
        + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        ThreadByExtending thread = new ThreadByExtending();
        thread.setName("CustomThread-1");
        thread.start();
    }
}
