package pt.adrz.myjavatutorial.generics;

public class Generics {

	public Generics() { }
	
	/**
	 * Add an object of one type to box and retrieve the same object referencing witch 
	 * type he has.
	 */
	public void tryBox1() {
		
		// add only Integers here
		Box intBox = new Box();
		
		// We add a integer to be stored as Object
		intBox.add(new Integer(10));
		
		// (Casting) we tell to compiler that the object we are going to 
		// receive is of type Integer.If he has another type ... KABUMMM
		Integer someInt = (Integer)intBox.get();
		
		System.out.println(someInt);
	}
	
	/**
	 * Add an object of one type and retrieving the same object as another type
	 * will crash the application with ClassCastException.
	 * If the Box class had been designed with Generics in mind, 
	 * this mistake would have been caught by the compiler
	 * instead of crashing the application at runtime.
	 */
	public void tryBox2() {
		
		// only Integers should be place here ... and if we place an object with 
		// other type? Generics are good for that ... lets find out
		Box intBox = new Box();
		
		// lets try inserting a String :P
		intBox.add("10");
		
		// ... and lets try to get an Integer
		Integer someInt = (Integer)intBox.get();
		
		// with this we are going to have an exception
		System.out.println(someInt);
	}
	
	/**
	 * Now we are going to use BoxGenerics, we define witch type of that this obj 
	 * if going to receive.
	 */
	public void tryBox3() {
		
		BoxGeneric<Integer> intBox = new BoxGeneric<Integer>();
		
		// if we try to add a String here we will get a runtime error. Try it ...
		intBox.add(new Integer(10));
		
		// no cast needed
		Integer someInt = intBox.get();
		System.out.println(someInt);
	}
}
