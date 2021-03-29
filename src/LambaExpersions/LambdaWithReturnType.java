package LambaExpersions;

interface cab {

	public String trip(String from, String to);
}

//
//	class ola implements cab {
//		 static int a=1000;
//		public int trip(String from, String to) {
//			return a;
//
//		}
//	}
public class LambdaWithReturnType {

	public static void main(String[] args) {
		cab obj = (from, to) -> {
			System.out.println("trip from" + from + " " + to);
			return ("1000");
		};

		System.out.println(obj.trip("mysore", "hassan"));

	}

}
