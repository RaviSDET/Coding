package LeetCode;

import java.util.Arrays;

public class Anagrams {

	public static void main(String[] args) {
		String s="ABC";
		String r="CAB";
		if(s.length()!=r.length()) {
			System.out.println("Given string is not anagram");
		}
		char[] c=s.toLowerCase().toCharArray();
		char[] b=r.toLowerCase().toCharArray();
		Arrays.sort(c);
		Arrays.sort(b);
		System.out.println(c);
		System.out.println(b);
		
		if(Arrays.equals(c, b)) {
			System.out.println("Given string is anagram");
		}
		
	}

}
