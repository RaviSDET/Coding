package Strings;

public class FirstLetterCaptial {

	public static void main(String[] args) {
		String s = "helloworld";

		// First captial
//		String s1 = s.substring(0, 1).toUpperCase() + s.substring(1);
//		System.out.println(s1);
//		// Last captial
//		String s2 = s.substring(0, 9) + s.substring(9).toUpperCase();
//		System.out.println(s2);
//
//		//
//
//		String s3 = s.substring(0, 5);
//		System.out.println(s3);
//
//		String s4 = s.substring(5, 10);
//		System.out.println(s4);
//
//		String s5 = s3.substring(0, 1).toUpperCase() + s3.substring(1);
//		System.out.println(s5);
//
//		String s6 = s4.substring(0, 1).toUpperCase() + s4.substring(1);
//		System.out.println(s5);
//
//		System.out.println(s5 + "" + s6);
//
//		String s7 = "Ravi";
//		String s8 = s7.replaceAll("R", "");
//		System.out.println(s8);
//		
		String s1=s.substring(0, 1).toUpperCase()+s.substring(1);
		System.out.println(s1);
		  
		String s2=s.substring(0, 9)+s.substring(9).toUpperCase();
		System.out.println(s2);
		

	}

}
