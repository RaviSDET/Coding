package LeetCode;

import java.util.HashMap;

public class PrintAllCharWithCount {

	public static void main(String[] args) {
		String s="fdushishduiweo";
		char [] c =s.toCharArray();
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for(Character r:c) {
			if(Character.isAlphabetic(r)) {
				if(map.containsKey(r)){
					map.put(r, map.get(r)+1);
				}else {
					map.put(r, 1);
				}
			}
		}
		
		System.out.println(map);

	}

}
