package LeetCode;

import java.util.HashSet;
import java.util.Set;

public class CommonChar {

	public static void main(String[] args) {
		String s="bella";
		String s1="bella";
		String []  s2=s.split(" ");
		char[] c = s.toCharArray();
		char[] c1 = s1.toCharArray();


		Set set = new HashSet();
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; i < c1.length; j++) {
				if (c[i] == c1[j]) {
					set.add(c[i]);
					break;
				}
			}
		}

		System.out.println(set);
		
		
		
		
		
		

	}

}
