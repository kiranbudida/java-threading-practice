package com.threading.executorservice;

import java.util.concurrent.*;

/*
    Handles multiple tasks and return the results as they complete, not necessarily in the order of submission
 */
public class CompletionServiceExample {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executor = Executors.newFixedThreadPool(3);
        CompletionService<String> completionService = new ExecutorCompletionService<>(executor);

        for (int i = 1; i <= 3; i++) {
            int id = i;

            completionService.submit(()->{
                Thread.sleep(1000 * id);
                return "Task "+ id +" Completed";
            });
        }

        for (int i = 1; i <= 3; i++) {
            Future<String> future = completionService.take();
            System.out.println("Result: "+future.get());
        }

        executor.shutdown();
    }
}
