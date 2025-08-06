package com.threading.executorservice;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutorDemo {
    public static void main(String[] args) {
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

        scheduler.schedule(()->{
            System.out.println("Task executed after 3 seconds");
        }, 3, TimeUnit.SECONDS); //Schedules a one-time task to run after a delay of 3 seconds

        scheduler.scheduleAtFixedRate(()->{
            System.out.println("Repeating task at " + System.currentTimeMillis());
        },1,2, TimeUnit.SECONDS); //start after 1 second(initialDealy = 1), then repeat every 2 seconds
    }
}
