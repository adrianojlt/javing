package pt.adrz.myjavatutorial.polymorphism;

public class Overloaded {
	
	public static void aMethod(int val) 	{	System.out.println("int"); 		}
	public static void aMethod(short val) 	{	System.out.println("short"); 	}
	public static void aMethod(Object val) 	{	System.out.println("Object"); 	}
	public static void aMethod(String val) 	{	System.out.println("String"); 	}

	public static void main(String[] args) {
		byte b = 9;
		
		// overload resolution
		aMethod(b);
		aMethod(9);
		aMethod(new Integer(9));
		aMethod("9");
	}
}
