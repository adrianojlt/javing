package pt.adrz.samples.concurrency;

public class SimpleMultithreadingExample {

    static class DownloadAndProcessTask implements Runnable {

        private final String url;
        private final int id;

        public DownloadAndProcessTask(String url, int id) {
            this.url = url;
            this.id = id;
        }

        @Override
        public void run() {

            System.out.println("Thread " + id + " STARTED (downloading: " + url + ")");

            // Simulate I/O delay (e.g., network call)
            try { Thread.sleep(2000); }
            catch (InterruptedException e) { Thread.currentThread().interrupt(); }

            // Simulate CPU-bound processing
            long sum = 0;
            for (int i = 0; i < 10_000_000; i++) {
                sum += i;
            }

            System.out.println("Thread " + id + " DONE (result checksum: " + (sum % 1000) + ")");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        String[] urls = {
                "https://api.example.com/data1",
                "https://api.example.com/data2",
                "https://api.example.com/data3",
                "https://api.example.com/data4"
        };

        System.out.println("=== SEQUENTIAL (using run()) ===");
        long start = System.currentTimeMillis();
        for (int i = 0; i < urls.length; i++) {
            // by Calling run() directly it runs in MAIN thread (NO concurrency!)
            new DownloadAndProcessTask(urls[i], i).run();
        }
        System.out.println("Total time (sequential): " + (System.currentTimeMillis() - start) + " ms\n");

        System.out.println("=== PARALLEL (using start()) ===");
        start = System.currentTimeMillis();
        Thread[] threads = new Thread[urls.length];
        for (int i = 0; i < urls.length; i++) {
            // ✅ Calling start() → launches NEW thread
            threads[i] = new Thread(new DownloadAndProcessTask(urls[i], i));
            threads[i].start();
        }

        // Wait for all threads to finish
        for (Thread t : threads) {
            t.join();
        }

        System.out.println("Total time (parallel): " + (System.currentTimeMillis() - start) + " ms");
    }
}
