package Numbers;

public class Amstrong {
	public static void main(String[] args) {
		int num = 153;
		double result = 0;
		int actualnum = num;
		while (num != 0) {
			int n = num % 10;
			result = result + Math.pow(n, 3);
			num = num / 10;
		}
		if (actualnum == result)
			System.out.println("num is armstrong");
	}
}
