package Strings;

public class ReverseAnStringWithPreservingPosition {

	public static void main(String[] args) {

		String s = "is is done Testing";
		
		StringBuffer str = new StringBuffer(s);
		str.reverse();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ') {
				str.insert(i, " ");

			}
		}
		str.append("");
		System.out.println(str);

	}

}
