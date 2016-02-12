package pt.adrz.myjavatutorial.basics;

import java.text.MessageFormat;

public class Strings {

	public static void main(String[] args) {
		messageFormatExample();
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
}
