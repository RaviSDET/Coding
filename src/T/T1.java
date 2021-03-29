package T;

public class T1 {

	public static void main(String[] args) {
		String s ="Acc321LoiTe";
		String s1=s.replaceAll("[a-z0-9]", "");
		System.out.println(s1);
		String s2=s.replaceAll("[A-Z0-9]", "");
		System.out.println(s2);
		String s3=s.replaceAll("[^A-Za-z0-9]", "");
		System.out.println(s3);
		

	}

}
