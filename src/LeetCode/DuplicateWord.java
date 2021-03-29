package LeetCode;

import java.util.HashSet;
import java.util.Set;

import javax.print.attribute.HashAttributeSet;

public class DuplicateWord {

	public static void main(String[] args) {
		String s="Testing is Testing";
		String[]  s1= s.split(" ");
		Set set = new HashSet();
		int count=0;
		for(String r:s1) {
			if(!set.add(r)==false) {
				count++;
				
				System.out.println(r);
			}
		}
		System.out.println(count);
	}

}
