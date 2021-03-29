package Strings;

public class DuplicateWordNOSpace {

	public static void main(String[] args) {
		String s = "testing xx code testing";
		int count = 0;
		for (int i = 1; i < s.length()-4; i++) {
			if (s.substring(i - 1, i + 5).equals("testing")) {
				count++;

			}

		}
		System.out.println(count);

	}

}
