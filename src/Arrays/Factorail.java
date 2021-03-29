package Arrays;

public class Factorail {

	public static void main(String[] args) {

		int fact = 1;
		for (int i = 1; i <= 5; i++) {
			fact = fact * i;
		}
		System.out.println(fact);

		int n = 3;
		int p = 4;
		int result = 1;
		for (int i = 1; i <= p; i++) {
			result = result * n;
		}
		System.out.println(result);
	}

}
