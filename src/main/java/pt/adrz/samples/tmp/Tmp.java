package pt.adrz.samples.tmp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.IntStream;

public class Tmp {
	
	public static void main(String[] args) {
		
		//example();
		//tmp();
		//increment();
		//invert();
		//testPairs();
		//teste();
		//input();
		//testSherlock();
		//testMinMax();
		testBalancedBrackets();
	}
	
	public static void testBalancedBrackets() {
		
		String ex01 = "()";
		String ex02 = "({})";
		String ex03 = "({}])";
		String ex04 = "()[]";
		String ex05 = "((())())";
		String ex06 = "{[(])}";
		String ex07 = "{[";
		
		
		//System.out.println(balancedBrackets(ex06));
		System.out.println(balancedBracketsWithStack(ex05));
	}
	
	public static String balancedBracketsWithStack(String expression) {
		//if (expression.length() == 1)
		char[] brackets = expression.toCharArray();
		Stack<Character> s = new Stack<>();
		for (char b : brackets)
			switch (b) {
				case '{': s.push('}'); break;
				case '(': s.push(')'); break;
				case '[': s.push(']'); break;
					
	
				default:
					if (s.empty() || b != s.pop())
						return "NO";
			}
	
 		if ( s.empty() )
 			return "YES";
 		
		return "NO";
	}
	
	public static boolean match(String a, String b) {

		if ( a.equals("(") && b.equals(")"))
			return true;
		if ( a.equals("[") && b.equals("]"))
			return true;
		if ( a.equals("{") && b.equals("}")) 
			return true;
			
		return false;
	}
	
	public static String balancedBrackets(String test) {
		
		String[] brackets = test.split("");
		
		//int i = 0;
		//int j = brackets.length-1;
		
		int round = 0;
		int curly = 0;
		int square = 0;
		
		for (int k = 0 ; k < brackets.length ; k++ ) {
			
			if ( brackets[k].equals("(")) {
				round++;
			}
			
			if ( brackets[k].equals(")")) {
				round--;
			}
			
			if ( brackets[k].equals("{")) {
				curly++;
			}
			
			if ( brackets[k].equals("}")) {
				curly--;
			}
			if ( brackets[k].equals("[")) {
				square++;
			}
			if ( brackets[k].equals("]")) {
				square--;
			}
		}
		
		if ( round == 0 && curly == 0 && square == 0)
			return "YES";
		
		return "NO";
		
		/*
		while ( i < j ) {
			if (match(brackets[i],brackets[j])) {
				i++;
				j--;
			}
			else {
				i++;
				j = i+1;
			}
		}
		System.out.println(i);
		System.out.println(j);
		
		if ( i > j )
			return "YES";
		
		return "NO";
		*/
	}
	
	static void testMinMax() {
		int arr01[] = {1,2,3,4,5};
		int arr02[] = {5,5,5,5,5};
		long arr03[] = {256741038, 623958417, 467905213, 714532089, 938071625};
		minMax(arr03);
		
	}
	
	static void minMax(long[] a) {
		long sum = 0;
		long min = a[0];
		long max = a[0];
		
		for (int i = 0 ; i < a.length ; i++ ) {
			sum += a[i];
			
			if ( a[i] < min )
				min = a[i];
			
			if ( a[i] > max )
				max = a[i];
			
			
			
		}
		System.out.println("min: " + min);
		System.out.println("max: " + max);
		System.out.println((sum-max) + " " + (sum - min));
	}
	
	
	public static void testSherlock() {
		int arr[] = {2,2,4,2,2};
		int arr02[] = {1,2,3,4};
		int arr03[] = {2,2,4,4};
		int arr04[] = {10};
		int arr05[] = {1,1,1};
		//System.out.println(sherlock(arr05));
		System.out.println(solve(arr02));
	}
	
	static String solve(int[] a) {
        int len =a.length;
        int j=len-1;
        int i=0, sum1=0, sum2=0;
        while(i<len && j>=0){
            if(sum1==sum2 && ((i-j)==0)){
                return "YES";
            }else if(sum1<sum2){
                sum1+=a[i++];
            }else{
                sum2+=a[j--];
            }
        }
        return "NO";
    }
	
	public static String sherlock(int[] a) {
		
		int left[] = null;
		int right[] = null;
		int total = IntStream.of(a).sum();
		
		for (int i = 1 ; i < a.length - 1 ; i++ ) {
			
			left = Arrays.copyOfRange(a, 0, i);
			right = Arrays.copyOfRange(a, i + 1, a.length);
			
			int leftSum = 0;
			int rightSum = 0;
			
			if ( left.length <= right.length ) {
				leftSum = IntStream.of(left).sum();
				rightSum = total - leftSum - a[i];
			}
			else {
				rightSum = IntStream.of(right).sum();
				leftSum = total - rightSum - a[i];
			}
			
			
			System.out.println(Arrays.toString(left));
			System.out.println(Arrays.toString(right));
			
			//int leftSum = IntStream.of(left).sum();
			//int rightSum = IntStream.of(right).sum();
			
			System.out.println("left: " + leftSum);
			System.out.println("right: " + rightSum);
			System.out.println("a[i]: " + a[i]);
			
			if ( leftSum == rightSum )
				return "Yes";
		}
		
		return "No";
		
		//System.out.println(Arrays.toString(left));
		//System.out.println(Arrays.toString(right));
		
		
		
		
		
		//System.out.println("left: " + leftSum);
		//System.out.println("right: " + rightSum);
		
		
		
	}
	
	public static void testPairs() {
		int arr[] = {1,5,3,4,2};
		
		int res = pairs(2, arr);
		System.out.println(res);
	}
	
	public static int pairsWhile(int k, int[] arr) {
			
		int total = 0;
		Arrays.sort(arr);
	
		int i = 0;
		int j = 1;
		
		while ( j <arr.length ) {
			int diff = arr[j] - arr[i];
	        if (diff == k) {
	            total++;
	            j++;
	        } else if (diff > k) {
	            i++;
	            if (i == j) {
	                j++;
	            }
	        } else if (diff < k) {
	            j++;
	        }
		}
		
		return total;
	}
	
	public static int pairs(int k, int[] arr) {
		
		int total = 0;
		Arrays.sort(arr);
		
		for (int i = 0 ; i < arr.length ; i++ ) {
			for (int z = i + 1 ; z < arr.length ; z++ ) {
				
				int diff = arr[z] - arr[i];
				
				if ( diff == k ) {
					total++;
					break;
				}
				
			}
		}

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