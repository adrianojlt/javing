package pt.adrz.myjavatutorial.concurrency.counting;

/**
 * To fix the Counter accidental unpredictability (non-determinism), 
 * the program must have control of the thread intertwining. 
 * When one thread is in the method increase another thread must not be in the same method until the first comes out of it. 
 * In that way we serialize access to the method increase.
 * @author adriano
 *
 */
public class SyncCounter implements Counter {
	
	int counter = 0;

	public synchronized void increment() {
		counter++;
	}

	public synchronized int get() {
		return counter;
	}
}
