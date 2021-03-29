package LeetCode;
import java.util.*;

public class SmallerThantheCurrentNumber {

	public static void main(String[] args) {
		int[] nums = { 6,5,4,8 };
		int count = 0;
		int [] total= new int[nums.length];
		

		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length; j++) {
				if (nums[j] < nums[i]) {

					//System.out.println(nums[j]);
					count++;
					
				}

			}
			int temp= count;
			total[i]=temp;
			count=0;
		}
		System.out.println(Arrays.toString(total));

	}

}
