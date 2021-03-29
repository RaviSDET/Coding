package LeetCode;

public class TargetArray {

	public static void main(String[] args) {
		int [] arr = {0,1,2,3,4};
		int [] index= {0,1,2,2,1};
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<index.length;j++) {
				
				if(arr[i]<index[j]) {
					System.out.println(index[j]);
				}
				
				
				
			}
			}
				
		

	}

}
