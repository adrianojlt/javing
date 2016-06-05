package pt.adrz.myjavatutorial.basics;

public class Types {
	
	/**
	 * Whenever you create a string object using string literal, 
	 * that object is stored in the string constant pool and whenever you create a string object using new keyword 
	 * such object is stored in the heap memory.
	 */
	public static void stringInMemory() {
		
		// Creating string objects using literals
		String s1 = "abc";
		String s2 = "abc";

		System.out.println(s1 == s2); // Output : true

		// Creating string objects using new operator
		String s3 = new String("abc");
		String s4 = new String("abc");

		System.out.println(s3 == s4); // Output : false
	}
	
	public static void operationOverloaded() {

		int one = 1;
		String three= "3";
		System.out.println(one + 2 + three); // output: 33
		
		String str1 = "Hello";
		String str2 = null;
		 
		System.out.println(str1 + str2);
	}
	
	/**
	 * values between -128 to 127 are cached witch makes it being the same
	 * object returned, the same happens with the stringInMemory example
	 */
	public static void intWrapper() {

		Integer a = 128;
		Integer b = 128;
		Integer c = 127;
		Integer d = 127;
		int e = 128;
		int f = 128;
		Integer g = new Integer(127);
		Integer h = new Integer(127);

		System.out.println(a==b);			// false
		System.out.println(a.equals(b));	// true
		System.out.println(c==d);			// true
		System.out.println(e==f);			// true
		System.out.println(e==f);			// true
		System.out.println(g==h);			// true
		
		System.out.println(new Long(0L).equals(0L));	// true
		System.out.println(new Long(0L).equals(0));		// false
	}
	
	public static void typeRange() {
		
		int init;
		byte minByte = -128;
		byte maxByte = 127;
		byte overflowByte = (byte)130;
		System.out.println(overflowByte);

		int readable = 10_000_000;
		int overfInt = Integer.MAX_VALUE + 1;
		System.out.println(readable);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(overfInt);
		
		System.out.println(0b11011101);
		System.out.println(0xF);
	}
	
	public static void promotions() {

		int x = 1;
		long y = 33L;
		long result = x*y;
	}
	
	public static void main(String[] args) {
		//stringInMemory();
		//operationOverloaded();
		//intWrapper();
		typeRange();
		//promotions();
	}
}
