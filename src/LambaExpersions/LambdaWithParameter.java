package LambaExpersions;

@FunctionalInterface
interface RbiBank {
	public void interest(int a);
}

//class SBI implements RbiBank{
//	public void interest(int b) {
//		System.out.println("the home loan intersest is "+ b);
//	}
//
//	
//}

public class LambdaWithParameter {

	public static void main(String[] args) {
		RbiBank obj =a->System.out.println("the home loan intersest is 10 % p.a"+" "+ a);
		obj.interest(18);

	}

}
