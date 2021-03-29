package Numbers;

public class Factor {

	public static void main(String[] args) {
		int num = 6;
		int sum = 0;
		int total = num;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0)
				System.out.println(i);
			sum = sum + i;
		}

	}

}
