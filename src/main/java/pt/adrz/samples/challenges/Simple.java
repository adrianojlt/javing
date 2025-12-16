package pt.adrz.samples.challenges;

import java.util.*;

public class Simple {


	public static Map<String, List<String>> getAnagrams(List<String> words) {

		Map<String, List<String>> map = new HashMap<>();

		for (String word : words) {

			char[] chars = word.toCharArray();
			Arrays.sort(chars);
			String key = new String(chars);

			if (!map.containsKey(key)) {
				map.put(key, new ArrayList<>());
			}

			map.get(key).add(word);
		}

		return map;
	}
	
	/**
	 * Write a function that takes two parameters, a string and an integer. 
	 * The function will return another string that is similar to the input string, but with certain characters removed. 
	 * It's going to remove characters from consecutive runs of the same character, 
	 * where the length of the run is greater than the input parameter.
	 * 
	 * Ex: "aaab",2 	=> "aab"
	 * Ex: "aabb", 1 	=> "ab"
	 * Ex: "aabbaa",1 	=> "aba"
	 * 
	 * @param str 
	 * @param max_chars
	 * @return
	 */
	public static String removeExtraConsecutive(String str, int max_chars ) {
		return null;
	}
	
	/**
	 * given an array with N numbers, find the missing one
	 */
	public static void findMissedWithSet(Integer[] args) {
		
		Collection<Integer> setCollections = new HashSet<Integer>(Arrays.asList(args));
		Integer number = 0;
		while ( !setCollections.add(++number) && number < 99 );
		System.out.println(number);
	}
	
	public static void findMissedWithArray(Integer[] args) {
		
		int i = 0; int temp = 0;

		for (  ; i < args.length ; i++ ) { 
			try {
				temp = args[i];
			}
			catch(Exception e) {
				//System.err.println(e);
				System.out.println(i);
			}
		}
	}
	
	public static void testArray() {
		
		Integer[] arr = new Integer[100];

		for (int i = 0 ; i < 100 ; i++ ) {
			if ( i != 94 && i != 49 && i != 84) arr[i] = i;
		}

		//Simple.findMissedWithSet(arr);
		Simple.findMissedWithArray(arr);
	}
	
	/*** 
	 * A general method to find missing values from an integer array in Java. 
	 * This method will work even if array has more than one missing element. 
	 */ 
	private static void printMissingNumber(int[] numbers, int count) {

		int missingCount = count - numbers.length;
		BitSet bitSet = new BitSet(count);

		for (int number : numbers) {
			bitSet.set(number - 1);
		}

		System.out.printf("Missing numbers in integer array %s, with total number %d is %n", Arrays.toString(numbers), count);

		int lastMissingIndex = 0;

		for (int i = 0; i < missingCount; i++) {
			lastMissingIndex = bitSet.nextClearBit(lastMissingIndex);
			System.out.println(++lastMissingIndex);
		}
	}
	
	private static int getMissingNumber(int[] numbers, int totalCount) {

		int expectedSum = totalCount * ((totalCount + 1) / 2);
		int actualSum = 0;
		for (int i : numbers) {
			actualSum += i;
		}
		return expectedSum - actualSum;
	}	
	
	private static void findDuplicates() {

		Integer[] arr = {1,2,3,3,4,5,2};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	/**
	 * Check if a list of words has anagrams for the first parameter word
	 * @param word the word to be checked
	 * interview for skyllacore
	 * @param words the list to check if this are anagram of the first one
	 */
	private static void isAnagram(String word,List<String> words) {
		
	}
	
	public static void main(String[] args) {

		findDuplicates();
		//Simple.testArray();
		//Simple.printMissingNumber(new int[]{1,3,4}, 4);
		//int missing = Simple.getMissingNumber(new int[]{1,2,3,4,6}, 6);

		//System.out.println( new BitSet().nextClearBit(11));
	}
}
