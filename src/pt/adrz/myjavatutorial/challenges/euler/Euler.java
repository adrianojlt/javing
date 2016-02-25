package pt.adrz.myjavatutorial.challenges.euler;

public class Euler {

	public Euler() { }
	
	public static void tmp() {
		
		int max = 10;
		
		for (int i = 1 ; i < max ; i++ ) {
			
		}
	}
	
	/**
	 * If we list all the natural numbers below 10 that are multiples of 3 or 5, * we get 3, 5, 6 and 9. 
	 * The sum of these multiples is 23. 
	 * Find the sum of all the multiples of 3 or 5 below 1000.
	 */
	public static void p001_multiples_of_3_and_5() {
		
		int max = 1000;
		
		int sum = 0;
		
		for (int i = 0 ; i < max ; i++ ) { 
			if ( i % 3 == 0 || i % 5 == 0) {
				sum += i;
			}
		}
		
		System.out.println("sum: " + sum);
	}

	public static void p004_largest_palindrome_product() {
		
		int header = 999;
		
		int decrement = header;
		
		int result = 0;
		
		int dec = header;

		
		//for ( int i = header ; i > 0 ; i-- ) { result = header*i; }
		
		
		
		boolean found = false;
		
		String resultString = "";
		
		while ( !found && header > 0 ) {
			
			result = header*dec;
			resultString = Integer.toString(result);
			
			if ( resultString.equals(new StringBuffer(resultString).reverse().toString()) ) {
				found = true;
			}
			
			dec--;
			//dec = header - 1;
			
			//result = header*dec;
			//resultString = Integer.toString(result);
			
			//if ( resultString.equals(new StringBuffer(resultString).reverse().toString()) ) { found = true; }

			//header--;
		}
		System.out.println((header) + " X " + ++dec + " = " + resultString);
	}
	
	private static long fib(int n) {
		if ( n < 2 ) return n;
		else return fib(n-1) + fib(n-2);
	}
}
