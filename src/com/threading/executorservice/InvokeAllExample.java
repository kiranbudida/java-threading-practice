package com.threading.executorservice;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class InvokeAllExample {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        List<Callable<String>> tasks = Arrays.asList(
                ()->"Task 1 result",
                ()->"Task 2 result",
                ()->"Task 3 result"
        );

        List<Future<String>> futures = executor.invokeAll(tasks);

        for (Future<String> future : futures) {
            System.out.println("Received: "+future.get());
        }

        executor.shutdown();
    }
}
