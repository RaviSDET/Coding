package T;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Practise {

	public static void main(String[] args) {
		String s="mytest";
		int lenth=s.length();
		String revrse="";
		for(int i=lenth-1; i>=0;i--) {
			revrse=revrse+s.charAt(i);
		}
		System.out.println(revrse);
		

	}

}
