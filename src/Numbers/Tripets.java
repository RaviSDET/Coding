package Numbers;

import java.util.Scanner;

public class Tripets {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double i = scan.nextDouble();
		double y = scan.nextDouble();
		double z = scan.nextDouble();

		double a = Math.pow(i, 2);
		double b = Math.pow(y, 2);
		double c = Math.pow(z, 2);
		if (a + b == c)
			System.out.println("given number is triplet");
		else
			System.out.println("not a triplet");
		

	}

}
