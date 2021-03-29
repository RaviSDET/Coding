package LeetCode;

public class GP {

	public static void main(String[] args) {
		double a=2;
		int num=7;
		double r=2;
		
		System.out.println(a);
		for(int i=1;i<=num;i++) {
			double sum=a*Math.pow(r, i);
			System.out.println(sum);
			
		}
	}

}
