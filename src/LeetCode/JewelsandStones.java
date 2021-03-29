package LeetCode;

import java.util.HashSet;
import java.util.Set;

import javax.print.attribute.HashAttributeSet;

public class JewelsandStones {

	public static void main(String[] args) {
		String s= "testing";
		char [] c=s.toCharArray();
		Set set= new HashSet();
		for(char e:c) {
			if(set.add(e)==false) {
				System.out.println(e);
			}
		}
		
	}

}
