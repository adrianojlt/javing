package pt.adrz.samples.concurrency.counting;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * https://www.toptal.com/software/introduction-to-concurrent-programming 
 * @author adriano
 */
public class CountingMain {

	public static void main(String[] args) throws InterruptedException {

		myCounter(new SimpleCounter());
		myCounter(new SyncCounter());
		countingBetter(new AtomicInteger());
	}

	public static void myCounter(final Counter counter) throws InterruptedException {

		CountingThread t1 = new CountingThread(counter);
		CountingThread t2 = new CountingThread(counter);
		
		doCounter(t1,t2,counter);
	}

	public static void countingBetter(AtomicInteger counter) throws InterruptedException {

		CountingThread t1 = new CountingThread(counter);
		CountingThread t2 = new CountingThread(counter);
		
		doCounter(t1, t2, counter);
	}

	public static void doCounter(CountingThread t1, CountingThread t2, Counter counter) throws InterruptedException {

		t1.start();
		t2.start();

		t1.join();
		t2.join();

		System.out.println(counter.get());
	}

	public static void doCounter(CountingThread t1, CountingThread t2, AtomicInteger counter) throws InterruptedException {

		t1.start();
		t2.start();

		t1.join();
		t2.join();

		System.out.println(counter.get());
	}
}
