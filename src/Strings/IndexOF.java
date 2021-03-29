package Strings;

public class IndexOF {

	public static void main(String[] args) {
		String s = "testing";
		int y=s.indexOf("t");
		System.out.println(y);
		int z=s.indexOf("t",s.indexOf("t")+1);
		System.out.println(z);
	}

}
