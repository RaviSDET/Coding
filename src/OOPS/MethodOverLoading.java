package OOPS;

public class MethodOverLoading {
	static int i=10;
	static int y=20;
	
	public static void m1() {
		System.out.println("m1 is started");
	}
	
	public  void m1(int i) {
		this.i=i;
		System.out.println("value of i is"+ i);
	}
	public  void m1(int i,int y) {
		this.i=i;
		this.y=y;
	 	System.out.println("the value of i and y is" + i + y);
	}
	
	public static void main(String[] args) {
		m1();
		MethodOverLoading obj = new MethodOverLoading();
		obj.m1(i, y);
		obj.m1(i);
	}

}
