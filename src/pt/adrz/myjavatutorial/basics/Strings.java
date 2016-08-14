package pt.adrz.myjavatutorial.basics;

import java.text.MessageFormat;

public class Strings {

	public static void main(String[] args) {
		//messageFormatExample();
		//stringMemory();
		compareStrings();
	}
	
	public static void messageFormatExample() {

		String[] vals1 = new String[] {"cenas","cenadas"};
		String[] vals2 = new String[] {"hello","thereee"};
		StringBuffer buffer = new StringBuffer();
		MessageFormat formatter = new MessageFormat("something here: {0} and here {1}");

		formatter.format(vals1, buffer,null );
		System.out.println(buffer);
		buffer.setLength(0);
		formatter.format(vals2, buffer,null );
		System.out.println(buffer);
	}
	
	public static void stringMemory() {
		
		// String literal stored in runtime constant pool (string pool)
		String s1 = "asdf";
		String s2 = "asdf";

		// allocated in the heap memory
		String s3 = new String("asdf");
		String s4 = new String("asdf");

		System.out.println(s1==s2); // true
		System.out.println(s3==s4); // false
	}
	
	public static void compareStrings() {

		String x = "100";
		String y = x;
		x += 5;
		
		StringBuffer s1 = new StringBuffer("100");
		StringBuffer s2 = s1;
		s1.append("5");
		
		System.out.println(x==y);	// false
		System.out.println(y);
		System.out.println(s1==s2); // true
		System.out.println(s1);
	}
}
