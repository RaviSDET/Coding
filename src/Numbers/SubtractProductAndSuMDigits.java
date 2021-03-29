package Numbers;

public class SubtractProductAndSuMDigits {

	public static void main(String[] args) {
		int num = 234;

		int n = 0;
		int product = 1;
		int temp = 0;

		int fact = 0;

		while (num != 0) {
			n = num % 10;

			num = num / 10;

			product = product * n;

			temp = temp + n;

		}
		System.out.println(temp);

		System.out.println(product);
		System.out.println(product - temp);

	}

}
