package Arrays;

public class RotateArray {

	public static void main(String[] args) {
		int[] arr = { 7, 1, 5, 3, 6,8 };

		for (int i = 0; i < arr.length / 2; i++) {

			System.out.println(arr[i + arr.length / 2]);

		}

		for (int i = 0; i < arr.length / 2; i++) {

			System.out.println(arr[i]);

		}


	}

}
