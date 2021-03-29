package LambaExpersions;

@FunctionalInterface
interface Bank {
	public  void interest();
}

//class SBI implements Bank{
//	public void interest() {
//		System.out.println("the home loan intersest is 10 % p.a");
//	}
//}

public class LambdaWithoutReturnType {

	public static void main(String[] args) {
		Bank obj = ()->System.out.println("the home loan intersest is 10 % p.a");
		obj.interest();

	}

}
