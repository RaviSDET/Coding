package LeetCode;

public class OddNumbers {

	public static void main(String[] args) {
		int num=1;
		int flag=0;
		if(num==0||num==1) {
			System.out.println(num +" not prime numbers");
			
		}else {
		for(int i=2;i<=num/2;i++) {
			if(num%2==0) {
				System.out.println(num +"not prime numbers");
			   flag=1;
			   break;
			   
			}
		}
		
		if(flag==0) {
			System.out.println(num +" is prime num");
		}
		}

	}

}
