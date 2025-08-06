package com.threading.executorservice;

import java.util.concurrent.*;

public class CallableFutureDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newSingleThreadExecutor();

        Callable<Integer> task = () -> {
            Thread.sleep(1000);
            return 42;
        };

        Future<Integer> future = executor.submit(task);

        System.out.println("Waiting for the result...");
        Integer result = future.get();
        System.out.println("Result: "+result);
    }
}
