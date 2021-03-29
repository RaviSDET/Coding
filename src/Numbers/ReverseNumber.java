package Numbers;

public class ReverseNumber {

	public static void main(String[] args) {
		int num=123;
		int result=0;
		while(num!=0) {
			int n=num%10;
			//System.out.println(n);
			result = result *10 +n;
			num=num/10;
			
		}
		System.out.println(result);

	}

}
