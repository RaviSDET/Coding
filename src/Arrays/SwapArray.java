package Arrays;

import java.util.Arrays;

public class SwapArray {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		int firstposition = 1;
		int finalposition = 3;
		int i;
		for (i = 0; i < arr.length; i++) {
			int temp = arr[firstposition];
			arr[firstposition] = arr[finalposition];
			arr[finalposition] = temp;

		}
		System.out.println(Arrays.toString(arr));

	}

}
