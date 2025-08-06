package com.threading.executorservice;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class SubmitVsExecuteDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(1);

        executor.execute(()->{
            System.out.println("Execute: No return values");
        });

        Future<String> future = executor.submit(()->{
            return "Submit: return values";
        });

        System.out.println(future.get());

        executor.shutdown();
    }
}
