package T;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class T21 {

	public static void main(String[] args) {
		Integer[] arr = { 1, 21, 3, 4, 5, 88, 5, 77, 97 };
		int num = 881;
		int flag = 0;
		for (int i = 0; i < arr.length; i++) {
			if (num == arr[i]) {
				flag = i;
				break;
			}
		}
		if (flag != 0) {
			System.out.println("Number is  present in given array");
		} else {
			System.out.println("Number is not  present in given array");
		}

		System.out.println("--------------------------------------------");

		List<Integer> list = new LinkedList<Integer>(Arrays.asList(arr));
		
		
		list.add(2, 10);
		arr = list.toArray(arr);
		if (list.contains(4)) {
			System.out.println("number is present ");
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
