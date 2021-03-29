package Numbers;

public class Multiple {
	
	public static int multiple(int a, int b) {
		if(b==0||a==0) {
			return 0;
		}
		else {
			return (a+ multiple(a,b-1));
		}

	}

	public static void main(String[] args) {
		System.out.println(multiple(10, 6));
	}

}
