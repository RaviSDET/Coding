package LeetCode;

import java.util.Arrays;

public class ArithmethicPro {

	public static void main(String[] args) {
		int[] arr = { 5, 3, 1 };
		int x = 2;

		//Arrays.sort(arr);

		System.out.println(Arrays.toString(arr));

		for (int i = 0; i < arr.length; i++) {
			if (arr[0] - arr[1] == x && (arr[1] - arr[2] == x)) {
				System.out.println("given arr is ap");
				break;

				
      
			}
		}
		int a = 2;
		int n = 5;
		int d=3;
		System.out.println(a);
		for(int y=1;y<=n;y++) {
			a=a+d;
			System.out.println(a);
		}

	}

}
