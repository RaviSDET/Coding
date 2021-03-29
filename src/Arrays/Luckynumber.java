package Arrays;

public class Luckynumber {

	public static void main(String[] args) {
		int count = 0;
		int[] arr = { 1, 2, 2, 3, 3 };
		int i;
		for ( i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
                   if(arr[i]==arr[j]) {
                	   count++;
                	   System.out.println(arr[i]);
                	   break;
                   }
			}
		
		if(count==2) {
			System.out.println(arr[i]);
		}

	}

}
}
