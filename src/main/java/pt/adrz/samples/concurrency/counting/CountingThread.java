package pt.adrz.samples.concurrency.counting;

import java.util.concurrent.atomic.AtomicInteger;

public class CountingThread extends Thread {
	
	private Counter counter;
	private AtomicInteger aInteger;

	public CountingThread(Counter counter) {
		this.counter = counter;
	}

	public CountingThread(AtomicInteger aInteger) {
		this.aInteger = aInteger;
	}
	
	public void run() {

		for (int x = 0; x < 50000; x++) {
			if (counter != null) {
				counter.increment();
			}
			else {
				aInteger.incrementAndGet();
			}
		}
	}
}
