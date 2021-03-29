package LeetCode;

import java.util.Arrays;

public class ShuffletheArray {

	public static void main(String[] args) {
		int[] arr = { 2, 5, 1, 3, 4, 7 };
		for (int i = 0; i < arr.length /2; i++) {
			System.out.println(arr[i]);

			System.out.println(arr[i + arr.length / 2]);
		}
		System.out.println("-------------------------------------------------------------");
		
		
		//int []  total = new int[arr.length];

		for (int i = arr.length - 1; i >= 0; i--) {
			if (arr[i] % 2 == 0) {
				//total[i]=arr[i];
				System.out.println(arr[i]);
			}
			
		}
		
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				//total[i]=arr[i];
				System.out.println(arr[i]);
			}
		}
            
	}

}
