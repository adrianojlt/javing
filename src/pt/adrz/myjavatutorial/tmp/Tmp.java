package pt.adrz.myjavatutorial.tmp;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Tmp {
	
	public static void main(String[] args) {
		
		//example();
		//tmp();
		teste();
	}
	
	public static void teste() {
		
		String text = ",_! ! _@?'  !?_,'! '_'_@.... ''?. ?_ !?. ..!'!?@,?@',?_@'!, !!?_,@?,'@@',, !.? @@@@!!?' _, @???_,@ !_@!'!!!__!??'!. _. ,@! !.?'@,' '_!@@,'?' '?' ''_? '!!'?_?,._!..@_,_', ',',, !!__!_@,.! '?...  ?_? ._ ?' _! '?_..,,''.'@'??.??' @'.?' ?'_.'.'_ .'??@',_@_ , ?! , ._ . ',_'@..' ?,?,!_'',',,,?,..',.?,?_',..@?.,_ .@_?_ ,',.?_!'.??'_@__!!!'._!!__'? .?,._'', @@?!@ '?_ .@  .!!!' .'.', _!''!_@.@..@',@? @?. .@'.,@ , !'! @,@.@. ?,'_!,_'_,'! @_,_@._'?'',!_@ ,'?.@ _!__@'. '?_, ?@_,,.,.@',@!!!@ !?!@ '@_'_ _'  @_? ,_. .@@@ '.  '!@  ._ ,__!__', '._?.,,, ,!.,!?? ??. ?@_  ,@'_@'!.,@@. @@,, ?_??!' !,@'?@!!@@'_ ?'@!.@', !?.'@' _'! @ ?.,., ?' ''@ ?_ __! ! '! . ,.@,'?.?__'__@..@'!@.@ _  .!! !?_ _.?,  ''_._! ? !,_ ,, ,@!?@,@?,. _@ @_'?!._,'_?!,??.?@,.!!' .!..',._'?  '_,'?@ _!.,_,.!?_ ?,,'@!!?@ @@!@.?_'!_.?!@ ??!' ,,,.,!_?.?.,!_ _ _.,?!_.'_ ,@'? !_.?@!',.?_@ _? ? ,@!', .,??!@??? @,!_.@ !. ''!,'?  ?,!'_.,@,@!_@ ''_._@_!@.!'@ ?@!@!,_@@ . @@_.@_??!!!@, ??'!., _ !'@'_@?_.!, ''?? ..''.,,.?@@??'.,_?'?'.' '' @,?'''@@.";
		String pattern01 = "[A-Za-z0-9]";
		String pattern02 = "\\w+";
		int count = 0;
		
		List<String> allMatches = new ArrayList<String>();
		Matcher m = Pattern.compile(pattern01).matcher(text);

		while (m.find()) {
			count++;
			allMatches.add(m.group());
		}

		System.out.println(count);
		
		for (String elem : allMatches) {
			System.out.println(elem);
		}
	}
	
	public static void tmp() {
		String isit = "TRUEi";
		
		
		if (Boolean.parseBoolean(isit))  {
			System.out.println("isit");
		}
	}
	
	public static void example() {
		Object message = "0605040B8423F0000603AEAF8201056A0045C60C036E756C6C267375623D3138333239383734353000080103417373696E617475726120646F207365727669636F20576F726C64204B69647A2072656E6F766164612E2056616C6F723A205253342C39392F73656D616E612E000101";
		String test = "message test";
		
		String novo = new String((byte[])message);
		System.out.println(novo);
		try {
			//System.out.println(URLDecoder.decode(message,"ISO-8859-1"));
			System.out.println(URLEncoder.encode(test,"ISO-8859-1"));
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}