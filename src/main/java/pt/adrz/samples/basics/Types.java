package pt.adrz.samples.basics;

public class Types {

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
		Integer g = Integer.valueOf(127);
		Integer h = Integer.valueOf(127);

		System.out.println(a==b);			// false
		System.out.println(a.equals(b));	// true
		System.out.println(c==d);			// true
		System.out.println(e==f);			// true
		System.out.println(e==f);			// true
		System.out.println(g==h);			// true
		
		System.out.println(Long.valueOf(0L).equals(0L));	// true
		System.out.println(Long.valueOf(0L).equals(0));		// false
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
	
	public static void numericPromotion() {

		int h = 1;
		long z = 33L;
		long result = h*z;
		System.out.println(result);

		short x = 10;
		short y = 3;
		int t;
		t=x/y;
		
		short s = 14; 	// promoted to int because it is a short used in an arithmetic operation
		float f = 13; 	// promoted to float so it can be multiplied by f
		double d = 30; 	// promoted to double so it can be divided by an double
		double all = s*f/d;
		
		// Java will automatically promote from smaller to larger types
		// trying to convert from larger to smaller data types results in a compilation error
		// A cast is needed 
		int xx = (int)1.0;
		short yy = (short)1234332; // this value is to large to fit in a short. Numeric overflow 
		System.out.println("Numeric overflow: " + yy);
		int zz = (int)9f;
		long tt = 1234343282377L;
		
		long aa = 10;
		int bb = 5;
		aa = aa * bb;
		
	}
	
	public static void incDec() {
		int x = 3;
		int y = ++x * 5 / x-- + --x;
		System.out.println("x is " + x);
		System.out.println("y is " + y);
	}
	
	public static void playWithString() {
		String s1 = "1";
		String s2 = s1.concat("2");
		s2.concat("3"); // remember ... String is immutable
		System.out.println(s2);
		
		StringBuilder sb = new StringBuilder("start");
		sb.append("+middle");
		System.out.println("sb = " + sb);
		StringBuilder same = sb.append("+end");
		System.out.println(sb == same);
		System.out.println("same = " + same);
		
		StringBuilder one = new StringBuilder();
		StringBuilder two = new StringBuilder();
		StringBuilder three = one.append("a");
		System.out.println( one == two); 	// false
		System.out.println( one == three); 	// true

	}
	
	public static void temp() {
		
	}
}
