package Numbers;

public class AddNumbersWithoutSymbol {

	public static void main(String[] args) {
		int a = 80;
		int b = 30;
		int c = a - (-b);
		System.out.println(c);

		int sub = a + (~a + b);
		System.out.println(sub);
//---------------------------------------------------------------------------------------
		String s = "1233##%@@@%^&weewewrew";
		String s1 = s.replace("w", "");
		System.out.println(s1);

		String s2 = s.replaceAll("[^0-9A-Z]", "");
		System.out.println(s2);
		String s3 = s.replaceAll("[0-9]", "");
		System.out.println(s3);
		
		
		String s4= "aeiouyz";
		String s5= s4.replaceAll("[aeiou]", "");
		System.out.println(s5);

	}

}
