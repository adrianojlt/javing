package pt.adrz.samples.basics;

import java.text.MessageFormat;

public class Strings {

	public static void messageFormatExample() {

		String[] vals1 = new String[] {"first","second"};
		String[] vals2 = new String[] {"hello","there"};
		MessageFormat formatter = new MessageFormat("something here: {0} and here {1}");
		StringBuffer buffer = new StringBuffer();

		formatter.format(vals1, buffer,null );
		System.out.println(buffer);
		buffer.setLength(0);
		formatter.format(vals2, buffer,null );
		System.out.println(buffer);
	}
}
