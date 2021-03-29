package LeetCode;

public class GoodPairs {

	public static void main(String[] args) {
		int[] nums = { 1,1,1,1 };
		int count = 0;

		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] == nums[j] && i < j) {
					System.out.println(nums[i]);
					count++;
					
				}
			}
		}
		System.out.println(count);
		
		
		
	
	

	}

}
