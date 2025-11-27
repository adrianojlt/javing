package pt.adrz.samples.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyExecutor {

    public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(3);

        for (int i = 1; i <= 5; i++) {
            int taskId = i;
            executor.submit(() -> System.out.println("Executing Task " + taskId + " by " + Thread.currentThread().getName()));
        }

        executor.shutdown();
    }
}
