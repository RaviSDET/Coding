package LeetCode;

import java.util.Arrays;

public class XOROperationArray {

	public static void main(String[] args) {
//		Input: n = 5, start = 0
//				Output: 8
//				Explanation: Array nums is equal to [0, 2, 4, 6, 8] where (0 ^ 2 ^ 4 ^ 6 ^ 8) = 8.
//				Where "^" corresponds to bitwise XOR operator.

		// [3, 5, 7, 9]
		
	//	n = 4, start = 3
		int n = 4;
		int start = 3;
		int temp =start;
		int[] total = new int[n];

		for (int i = 0; i < n; i++) {
			 start = start + 2 * i;
			

			total[i] = start;

			start = 3;
		}
		//System.out.println(Arrays.toString(total));

	}

}
