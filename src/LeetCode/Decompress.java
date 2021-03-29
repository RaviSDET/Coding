package LeetCode;

public class Decompress {

	public static void main(String[] args) {
		int [] arr = {1,2,3,4};
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					System.out.println(arr[j]);
					break;
				}
			}
		}
	}

}
