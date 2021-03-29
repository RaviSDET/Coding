package Strings;

import java.util.HashMap;

public class CountWord {

	public static void main(String[] args) {
		String[] arr = { "india", "china" };
		HashMap<String, Integer> hm = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			if (hm.containsKey(arr[i])) {
				hm.put(arr[i], hm.get(arr[i]) + 1);
			} else {
				hm.put(arr[i], 1);
			}

		}
		System.out.println(hm);

	}

}
