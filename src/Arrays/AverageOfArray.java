package Arrays;

public class AverageOfArray {

	public static void main(String[] args) {
		int[] arr = { 11, 24, 3, 4, 57 };

		int sum = 0;
		int i;
		for (i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
			
		}
		System.out.println(sum);
		float average = sum / arr.length;
	
		System.out.println(average);

	}

}
