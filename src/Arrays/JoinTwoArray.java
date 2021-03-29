package Arrays;

import java.util.Arrays;

public class JoinTwoArray {

	public static void main(String[] args) {
		int[] arr1 = { 1, 3, 4, 2 };
		int[] arr2 = { 5, 8, 6, 7 };
		int length = arr1.length + arr2.length;
		int[] result = new int[length];
		int pos = 0;
		for (int element : arr1) {
			result[pos] = element;
			pos++;
		}
		for (int element : arr2) {
			result[pos] = element;
			pos++;
		}

		Arrays.sort(result);
		System.out.println(Arrays.toString(result));

	}

}
