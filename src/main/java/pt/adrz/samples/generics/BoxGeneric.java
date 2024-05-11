package pt.adrz.samples.generics;

public class BoxGeneric<T> {

	// T from Type
	private T t;
	
	public void add(T t) {
		this.t = t;
	}
	
	public T get() {
		return t;
	}
}
