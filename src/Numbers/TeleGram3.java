package Numbers;

import java.util.Scanner;

public class TeleGram3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int i = scan.nextInt();
		if (i >= 1 && i <= 100) {
			System.out.println(10 * 100);
		}
			else if (i>=101&&i<=200) {
				System.out.println();
			}else if(i>=201&&i<=300){
				System.out.println(20*i+15*i+10*i);
			}
	}

	

}
