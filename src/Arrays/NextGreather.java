package Arrays;

public class NextGreather {

	public static void main(String[] args) {
		int[] arr = { 4, 6,1, 7, 13, 12 };
		int next;
		int i;
		int j;
		for (i = 0; i < arr.length; i++) 
		{
			next = -1;
			for (j = 0; j < arr.length; j++) 
			{
				if (arr[i] < arr[j]) {
					next = arr[j];
					break;
				}

			}
			System.out.println(arr[i] + "  ---  " + next);
		}

	}

}
