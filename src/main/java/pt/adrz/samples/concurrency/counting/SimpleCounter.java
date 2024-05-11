package pt.adrz.samples.concurrency.counting;

public class SimpleCounter implements Counter {
	
	int counter = 0;

	public void increment() {
		counter++;
	}

	public int get() {
		return counter;
	}
}
