package Strings;

public class UpperChartoLowerAndLowerToUpper {
	public static void main(String[] str) {

		String s = "aBcdz";

		String y = "";

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);

			if (c >= 65 && c <= 90) {
				y = y + Character.toLowerCase(c);
			} else {
				y = y + Character.toUpperCase(c);
			}

		}
		System.out.println(y);

	}

}
