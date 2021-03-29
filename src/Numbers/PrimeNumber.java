package Numbers;

public class PrimeNumber {

	public static void checkPrimeNumber(int num) {
		int flag = 0;
		if (num == 0 || num == 1) {
			System.out.println("Given number is not a prime number");
		} 
		else{
			for (int i = 2; i <= num / 2; i++) 
			{
				if (num % 2 == 0) {
					System.out.println("given number is not prime number");
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				System.out.println("given number is prime number");
			}
		}
	}

	public static void main(String[] args) {

		checkPrimeNumber(9);
	}

}
