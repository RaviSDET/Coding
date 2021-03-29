package Arrays;

public class Product {

	public static void main(String[] args) {
		int[] arr = { 9, 5, 3, 1, 2 ,55,56};
		int a = arr[0], b = arr[1];

		int max = 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] * arr[j] > a * b) {
					a = arr[i];
					b = arr[j];
					max = a * b;
				}

			}
		}

		System.out.println(max);

	}

}
