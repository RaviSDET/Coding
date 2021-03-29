package Strings;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class CommonChar {

	public static void main(String[] args) {
//		String[] s1 = { "Testing", "qa" };
//		String[] s2 = { "Testing" };
		Set set = new LinkedHashSet();
//		for (int i = 0; i < s1.length; i++) {
//			for (int j = 0; j < s2.length; j++) {
//				if (s1[i] == s2[j]) {
//					set.add(s1[i]);
//					break;
//				}
//			}
//
//		}

		// System.out.println(set);

		String s = "TesTing is";
		char[] y = s.toCharArray();
		for (char t : y) {
			if (set.add(t) == false) {
				System.out.println(t);
			}
		}

	}
}
