package T;

import java.util.HashMap;
import java.util.Map;

public class A2 extends A1 {

	public static void m1() {
		System.out.println("Tested");
	}

	public static void main(String[] args) {
		String s = "qrqqwrewewfdrefd";
		char[] c = s.toCharArray();
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (Character ch : c) {
			if (Character.isAlphabetic(ch)) {
				if (map.containsKey(ch)) {
					map.put(ch, map.get(ch) + 1);
				} else {
					map.put(ch, 1);
				}
			}
		}
		System.out.println(map);
	}
}
