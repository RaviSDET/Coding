package OOPS;

public class OverLoadingMAINMethod {
	
	public static void main() {
		System.out.println("main tested");
	}
	
	public void main(int i) {
		System.out.println("main tested is started with value "+ i);
	}

	public static void main(String[] args) {
		OverLoadingMAINMethod obj = new OverLoadingMAINMethod();
		obj.main();
		obj.main(10);

	}

}
