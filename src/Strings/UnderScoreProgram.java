package Strings;

public class UnderScoreProgram {
	public static void main(String args[]) {
		String str = "HelloHowAreYouWelcome";
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < str.length(); i++) {
			if (Character.isUpperCase(str.charAt(i))) {
				sb.append("_");
				sb.append(str.charAt(i));
			} else {
				sb.append(str.charAt(i));
			}
		}

		System.out.println(sb);
	}
}
