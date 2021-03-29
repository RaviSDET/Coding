package Numbers;

public class PerfectNumber {

	public static void main(String[] args) {
		int num =10;
		int b=num;
		int sum=0;
		for(int i=1;i<num;i++) {
			if(num%i==0) {
				
				System.out.println(i);
				sum=sum+i;
			}
			
		}
		System.out.println(sum);
		if(b==sum) {
	System.out.println(" given number is perfect number");
		}
	}

}
