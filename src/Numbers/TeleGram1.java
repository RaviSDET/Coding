package Numbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class TeleGram1 {

	public static void main(String[] args) {
		
//
//		for (int i = 1; i <= 10; i++) {
//			int sum = table * i;
//			System.out.println(sum);
//		}

//		for(int i=10;i<=15;i++) {
//			for(int j=1;j<=10;j++) {
//				int sum=i*j;
//				System.out.println(sum);
//			}
//			System.out.println("-----------------------------------------");
//		}

		String[] arr = { "A", "B", "C", "D", "E" };

		List<String> list = new ArrayList<String>(Arrays.asList(arr));
		list.add(0, "123456");
		System.out.println(list);

		list.subList(3, 6).clear();

		System.out.println(list);
  
		
		Scanner sc = new Scanner(System.in);
		int table = sc.nextInt();
		Random random = new Random();
		int num = random.nextInt(10);
		System.out.println(num);
		if(num<=table) {
			System.out.println("low");
		}else if(num>=table){
			System.out.println("High");
		}else if(num==table) {
			System.out.println("Congrats");
		}

	}

}
