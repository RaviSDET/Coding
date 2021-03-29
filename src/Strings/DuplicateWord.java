package Strings;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicateWord {

	public static void main(String[] args) {
		String[] arr= {"Testing","QA","QA","Testing"};
		Set<String> s = new LinkedHashSet<String>();
		for(String s1:arr) {
			if(s.add(s1)==false) {
				System.out.println(s1);
			}
		}

	}

}
