package OOPS;

public class Blocks {

	static {
		System.out.println("Static block is executed");
	}
	{
		System.out.println("non static block is executed ");
	}

	public Blocks() {
		System.out.println("Constructor is executed");
	}

	{
		System.out.println("non static block is validated ");
	}

	public void m1() {
		System.out.println("m1 is started");
	}

	public static void main(String[] args) {
		Blocks obj = new Blocks();
		//obj.m1();
	}

}
