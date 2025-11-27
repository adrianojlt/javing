package pt.adrz.samples.concurrency;

import java.util.concurrent.*;

public class MyCallable implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        Thread.sleep(1000);
        return 42;
    }

    public static void main(String[] args) {

        ExecutorService executor = Executors.newSingleThreadExecutor();
        MyCallable task = new MyCallable();

        Future<Integer> future = executor.submit(task);

        try {
            Integer result = future.get();
            System.out.println("Task Result: " + result);
        } catch (InterruptedException | ExecutionException e) {
            System.out.println("Error: " + e.getMessage());
        }

        executor.shutdown();
    }
}
