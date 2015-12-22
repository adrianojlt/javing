package pt.adrz.myjavatutorial.basics;

public class Basics {

	public Basics() { }
	
	public void reference() {
		
		Foo f = new Foo("f");
		
		// reference wont be changed
		changeReference(f);
		
		// it will change the object that the reference variable "f" refers to
		modifyReference(f);
	}
	
	public void changeReference(Foo a) {
		Foo b = new Foo("b");
		a = b;
	}
	
	public void modifyReference(Foo c) {
		c.setAttribute("c");
	}
	
}

class Foo {
	
	private String attribute;
	
	public Foo(String a) {
		this.attribute = a;
	}
	
	public String getAttribute() {
		return attribute;
	}
	
	public void setAttribute(String attribute) {
		this.attribute = attribute;
	}
}
