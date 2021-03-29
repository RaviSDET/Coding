package Strings;

public class Munplications {
	public static void main(String[] args) {
		String s = "rtaaiiuyfesfedg!@#$%^&&1123";
		System.out.println(s.replaceAll("[^A-Za-z]", ""));
		System.out.println(s.replaceAll("[aeiou]", ""));
		System.out.println(s.replaceAll("[A-Za-z0-9]", ""));
		System.out.println(s.replaceAll("[0-9]", ""));

	}
}
