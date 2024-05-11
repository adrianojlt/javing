package pt.adrz.samples.polymorphism;

public class Overrided {
	
	void callprint() {
		System.out.println("callprint in A");
		print();
	}
	
	public void print() {
		System.out.println("print in A");
	}

	public static void main(String[] args) {
		B b = new B();
		b.callprint();
	}
}

class B extends Overrided {
	
	void callprint() {
		System.out.println("callprint in B");
		super.callprint();
	}
	
	@Override
	public synchronized void print() {
		System.out.println("print in B");
		super.print();
	}
}

