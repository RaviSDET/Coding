package Numbers;

public class Fibseries {
	public static void main(String[] args) {
		int a = 0;
		int b = 1;

		int result = 0;
		while (a <= 10) {
			System.out.println(a);
			result = a + b;
			b = a;
			a = result;
		}

	}
}
