package Numbers;

import java.util.Scanner;

public class TeleGram2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char c = scan.next().charAt(0);
		int y = c;

		if (y >= 97 && y <= 122 || y >= 65 && y <= 90) {
			System.out.println("Character is entered");
		} else {
			System.out.println("Number  is entered");
		}

	}

}
