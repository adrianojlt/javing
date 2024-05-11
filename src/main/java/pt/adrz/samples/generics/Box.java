package pt.adrz.samples.generics;

/**
 * 
 * @author adriano
 *
 */
public class Box {
	
	private Object obj;
	
	/**
	 * Add an Object ... any type is allowed
	 * @param obj
	 */
	public void add(Object obj) {
		this.obj = obj;
	}
	
	
	/**
	 * Return an object ... it should have the same type as the 
	 * one that was added.
	 * @return
	 */
	public Object get() {
		return this.obj;
	}
}
