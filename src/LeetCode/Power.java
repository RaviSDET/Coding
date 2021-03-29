package LeetCode;

public class Power {

	public static void main(String[] args) {
		int n=5;
		int p=3;
		int total=1;
		for(int i=1;i<=p;i++) {
			total=total*n;
		}
		System.out.println(total);
	}

}
