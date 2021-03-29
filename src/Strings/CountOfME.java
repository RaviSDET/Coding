package Strings;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CountOfME {

	public static void main(String[] args) {

	String s ="welcome me to helome me ";
	
	int count=0;
	
//	for(int i=0;i<s.length();i++ ) {
//		if((s.charAt(i)=='m')&&(s.charAt(i+1)=='e')) {
//			count++;
//		}
//	}
	
	String y= "wyggw dgdmeuygmeioiumej ufgme";
	char s1[] =y.toCharArray();
	
	for(int i=0;i<s1.length;i++ ) {
		if((s1[i]=='m')&&(s1[i+1]=='e')){
			count++;
		}
	}
	System.out.println(count);
	

	}

}
