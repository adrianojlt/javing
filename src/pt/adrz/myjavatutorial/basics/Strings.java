package pt.adrz.myjavatutorial.basics;

import java.text.MessageFormat;

public class Strings {

	public static void main(String[] args) {
		//messageFormatExample();
		stringMemory();
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
		
		// String literal stored in runtime constant pool
		String s1 = "asdf";
		String s2 = "asdf";

		// allocated in the heap memory
		String s3 = new String("asdf");
		String s4 = new String("asdf");

		System.out.println(s1==s2); // true
		System.out.println(s3==s4); // false
	}
}
