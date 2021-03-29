package LeetCode;

public class DefangingIPAddress {

	public static void main(String[] args) {
		String a = "255.100.50.0";
		String d=a.replaceAll("[.]", "[.]");
		System.out.println(d);
	}

}
