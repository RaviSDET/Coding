package Arrays;

public class MinAndMax {

	public static void main(String[] args) {
		int [] arr = {3,4,1,2,1,-1,100,101,5};
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
		if(arr[i]>max) {
			max=arr[i];		
			}
			
		}
		System.out.println(max);
		
		int min =arr[0];
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]<min) {
				min=arr[i];
			}
			
			
		}
		System.out.println(min);
		
		
		
	}

}
