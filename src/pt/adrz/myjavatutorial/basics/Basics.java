package pt.adrz.myjavatutorial.basics;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

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
	
	public static void main(String[] args) { 
		try {
			Foo foo  = new Foo("asdf");
			Method method = foo.getClass().getMethod("getAttribute", null);
			Field field = foo.getClass().getFields()[0];
			method.setAccessible(true);
			String output = (String) method.invoke(foo, null);
			System.out.println(output);
		} catch (Exception e) {
			e.printStackTrace();
		}
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
