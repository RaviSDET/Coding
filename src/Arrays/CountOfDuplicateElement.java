package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CountOfDuplicateElement {

	public static void main(String[] args) {

		int[] arr = { 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765 };

		Map<Integer, Integer> map = new HashMap<>();

		for (Integer r : arr) {
			if (map.containsKey(r)) {
				map.put(r, map.get(r) + 1);
			}
			else {
				map.put(r, 1);
			}
		}
		Set<Map.Entry<Integer, Integer>> e = map.entrySet();
		for (Map.Entry<Integer, Integer> entry : e) {

			System.out.println(entry.getKey() + " :  " + entry.getValue());

		}
		
	}
}
