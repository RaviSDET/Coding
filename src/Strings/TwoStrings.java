package Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import javax.print.attribute.HashAttributeSet;

public class TwoStrings {
	public static void main(String[] args) {
		String s1 = "ahceclwlxo";
		String s2 = "hello";
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		Set set = new HashSet();
		for (int i = 0; i < c1.length; i++) {
			for (int j = 0; j < c2.length; j++) {
				if (c1[i] == c2[j]) {
					set.add(c1[i]);
				}
			}
		}
		String s3 = set.toString();
		//System.out.println(s3);
		
		
		ArrayList<String> list = new ArrayList<String>(Arrays.asList("testing","qa","sdet"));
		
		ArrayList<String> list1 =new ArrayList<String>(Arrays.asList("qa","sdet","dev"));
		
		list.retainAll(list1);
		
		System.out.println(list);
		
		list1.removeAll(list);
		
		System.out.println(list1);


	}
}
