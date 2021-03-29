package Strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Countchar {

	public static void main(String[] args) {
		String str = "sdfasdfafkasd234asda12344@#$%";
		Map<Character, Integer> charMap = new HashMap<Character, Integer>();
		char[] arr = str.toCharArray();

		for (Character value : arr) {

			if (Character.isAlphabetic(value)) {
				if (charMap.containsKey(value)) {
					charMap.put(value, charMap.get(value) + 1);

				} else {
					charMap.put(value, 1);
				}

			}
		}

		System.out.println(charMap);

	}

}
