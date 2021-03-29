package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class RemoveDuplicateInArraylist {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 2, 4, 1, 5, 6, 7, 7));

		Set<Integer> set = new HashSet<Integer>(list);

		ArrayList<Integer> l = new ArrayList<Integer>(set);

		System.out.println(l);

		ArrayList<Integer> a = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 2, 4, 1, 5, 6, 7, 7));

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (Integer i : a) {
			if (map.containsKey(i)) {
				map.put(i, map.get(i) + 1);
			} else {
				map.put(i, 1);
			}
		}
		System.out.println(map);
		
//		Set<Integer> y = map.keySet();
//		System.out.println(y);

	}

}
