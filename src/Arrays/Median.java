
package Arrays;

import java.util.Arrays;

public class Median {

	public static void main(String[] args) {
		int[] arr = { 90, 100, 78, 89, 67, 4 };
		Arrays.sort(arr);
		if (arr.length % 2 != 0) {
			for (int i = 0; i < arr.length / 2; i++) {
				System.out.println(arr[i + arr.length / 2]);
				break;
			}
		} else {
			for (int i = 0; i < arr.length / 2; i++) {
				float z = arr[(i + arr.length / 2) - 1];
				float y = arr[i + arr.length / 2];
				System.out.println((z + y) / 2);
				break;
			}
		}

	}

}
