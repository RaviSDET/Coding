package Arrays;

public class EVENODDARRAY {

	public static void main(String[] args) {
		int [] arr = {1,2,3,4};
		for(int i=0;i<arr.length/2;i++) {
			
			System.out.println(arr[i]);
			System.out.println(arr[i+arr.length/2]);
			
		}
		
		String s="Testing";
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
			
		}
		System.out.println(rev);
	}

	

}
