package LeetCode;

public class NumberofStepstoReduceaNumbertoZero {

	public static void main(String[] args) {
		int num = 13;
		int count = 0;
		while (num != 0) {
			if (num % 2 == 0) {

				num = num / 2;

				
				count++;
			}

			else if (num % 2 != 0) {

				num = num - 1;
				
				
				count++;
			}

		

		}
		System.out.println(count);

	}
}
