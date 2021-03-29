package Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddingWordToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list = new ArrayList<String>(Arrays.asList("test", "develop", "read"));
		List<String> l = new ArrayList<String>();
		for (String s : list) {
			String n = s + "ing";
			l.add(n);
		}
		System.out.println(l);
		
		
		List<Integer> y = new ArrayList<Integer>(Arrays.asList(1,2,3,4));
		List<Integer> r = new ArrayList<Integer>();
		for(Integer a :y) {
			Integer t = a+2;
			r.add(t);
		}
		System.out.println(r);
		
		
		

	}

}
