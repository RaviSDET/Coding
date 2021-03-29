package Strings;

import java.util.HashMap;

public class C {

	public static void main(String[] args) {
	String s="ewyrareufhdcywedswasdew11";
	char [] c=s.toCharArray();
	HashMap<Character, Integer> map = new HashMap<Character, Integer>();
	for(char value :c) {
		if(Character.isAlphabetic(value)) {
			if(map.containsKey(value)) {
				map.put(value, map.get(value)+1);
			}
			else {
				map.put(value, 1);
			}
		
			
		}
		
		
	}
	      System.out.println(map);
	}

}
