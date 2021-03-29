package Strings;

public class DeleteFirstAndLastChar {

	public static void main(String[] args) {
		String s="ravi";
		StringBuffer b= new StringBuffer(s);
		b.deleteCharAt(0);
		b.deleteCharAt(2);
		System.out.println(b);

	}

}
