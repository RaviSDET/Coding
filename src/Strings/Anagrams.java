package Strings;

import java.util.*;

public class Anagrams {

	public static void main(String[] args) {

		String s = "listen";
		String s1 = "silen";
		if (s.length() != s1.length()) {
			System.out.println("provided strings are not anagram");
		}
		char[] c1 = s.toCharArray();
		char[] c2 = s1.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);

		if (Arrays.equals(c1, c2)) {
			System.out.println("provided strings are  anagram");
		}

	}

}
