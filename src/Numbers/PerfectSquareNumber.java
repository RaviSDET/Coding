package Numbers;

public class PerfectSquareNumber {

	public static void main(String[] args) {
		double x=16;
		double y=Math.sqrt(x);
		System.out.println(y);
		double z=Math.round(y);
		System.out.println(z);
		if(y-z==0) {
			System.out.println("number is perfect square number");
		}
	}

}
