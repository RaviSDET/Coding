package Strings;

import java.util.HashSet;
import java.util.Set;

public class CommonCharInTwoStrings {

	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = "aui";

		for (int i = 0; i < s1.length(); i++) {
			char c = s1.charAt(i);
			String s3 = Character.toString(c);

			if (!s2.contains(s3)) {
				System.out.println(s3);
			}

		}
	}

}
