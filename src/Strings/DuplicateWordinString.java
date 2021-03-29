package Strings;

import java.util.HashSet;
import java.util.Set;

import javax.print.attribute.HashAttributeSet;

public class DuplicateWordinString {

	public static void main(String[] args) {
		String s="Testing is Testing is ravi ";
		String[] s1=s.split(" ");
	
		Set<String> set = new HashSet<String>();
		for(String y:s1) {
			if(!set.add(y)==false) {
				System.out.println(y);
			}
		}

	}

}
