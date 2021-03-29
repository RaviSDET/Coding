package Strings;

import java.util.HashSet;
import java.util.Set;

import javax.print.attribute.HashAttributeSet;

public class OccurenceCount {

	public static void main(String[] args) {

		String s = "Testing is Testing";
		String s1 = "Testing";
		String[]  s2=s.split(" ");
		Set set = new HashSet();
		int count=0;
		for(int i=0;i<s2.length;i++) {
			if(s1.equals(s2[i]))
				count++;
		}
	
		
		System.out.println(count);
		
	}

}
