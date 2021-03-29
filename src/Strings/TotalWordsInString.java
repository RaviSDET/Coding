package Strings;

public class TotalWordsInString {

	public static void main(String[] args) {
		 String s ="Testing is testing done by ravi";
			String [] s1=  s.split(" ");
			int count=0;
			for(int i=0;i<s1.length;i++) {
				count++;
			}
			System.out.println(s1.length);
			 System.out.println(count);
	}

}
