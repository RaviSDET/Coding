package LeetCode;

public class SelfNumber {

	public static void main(String[] args) {
		int num=127;
		int actualnum=num;
	
		while(num!=0) {
			int n=num%10;
			num=num/10;
		
			if(actualnum%n==0 ) {
				System.out.println("Given num is self divisible by "+  n);
			}
			
		}
		
	}

}
