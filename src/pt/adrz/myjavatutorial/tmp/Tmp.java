package pt.adrz.myjavatutorial.tmp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Tmp {
	
	public static void main(String[] args) {
		
		//example();
		//tmp();
		//increment();
		//invert();
		testPairs();
		//teste();
		//input();
		
		
	}
	
	public static void testPairs() {
		int arr[] = {1,5,3,4,2};
		
		int res = pairs(2, arr);
		System.out.println(res);
	}
	
	//static 
	public static int pairs(int k, int[] arr) {
		
		HashMap<Integer, Integer> hm = new HashMap<Integer,Integer>();
		
		//hm.containsKey(arg0)
		//hm.put(2, 3);
		int total = 0;
		
		for (int i = 0 ; i < arr.length ; i++ ) {
			for (int z = i + 1 ; z < arr.length ; z++ ) {
				
				int diff = Math.abs(arr[i] - arr[z]);
				
				if ( diff == k ) {
					total++;
				}
				
				//if ( hm.containsKey(diff) ) {
					//hm.put(diff, hm.get(diff) + 1);
				//}
				//arr[i] - arr[z];
			}
		}
		
		//System.out.println(Arrays.asList(hm)); 
		
		/*
		for (int i : arr) {
			
		}*/
		
		return total;
	}
	
	public static void invert() {
		Integer[] arr = {1,4,3,2};
		System.out.println(Arrays.toString(arr));
	}
	
	public static void streams() {
		List<Integer> numeros = Arrays.asList(new Integer(10),new Integer(3));
	}
	
	public static void increment() {
		int a = 10;
		System.out.println("the value of a " + a++ );
		System.out.println("now a is " + a );
	}
	
	public static void input() {
		
		BufferedReader br = null;
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			String xStr = br.readLine();
			String yStr = br.readLine();
			Integer result = Integer.parseInt(xStr)/Integer.parseInt(yStr);
			System.out.println(result);
		}
		catch (NumberFormatException ne) {
			System.out.println("java.util.InputMismatchException");
		}
		catch (ArithmeticException ae) {
			System.out.println("java.lang.ArithmeticException: / by zero");
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
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
		
		int a  = 100;
		String b = "110";
		
		boolean c =  b.equals(a+"");
		System.out.println(c);
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