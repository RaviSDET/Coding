package OOPS;

public class ThisKeyword {
	int i = 10;
	static int y=30;

	public ThisKeyword() {
		this(10);
		System.out.println(y);
	
	}
	
	public  ThisKeyword(int i) {
		
		System.out.println(y);
	}
	
	static {
		System.out.println("Static block is executed");
	}
	
	{
		System.out.println("non static block is validated ");
	}

	public static void main(String[] args) {
		ThisKeyword obj = new ThisKeyword();
		
	}

}
