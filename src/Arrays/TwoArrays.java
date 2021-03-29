package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import javax.print.attribute.HashAttributeSet;

public class TwoArrays {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5 };
		int[] b = { 2, 4, 5, 6, 7 };

		Set set = new HashSet();

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {
					set.add(a[i]);
					break;
				}
			}
		}
		//System.out.println(set);

		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));

		ArrayList<Integer> list1 = new ArrayList<Integer>(Arrays.asList(1, 4, 3, 11, 18));

		list.retainAll(list1);

		list1.removeAll(list);

		System.out.println(list);

	}

}
