package Arrays;

import java.util.HashSet;
import java.util.Set;

public class FindNonRepeatingDigit {

	public static void main(String[] args) {

		String str1 = "1232315";
		
		for (int i = 0; i < str1.length(); i++) {
			boolean unique = true;
			for (int j = 0; j < str1.length(); j++) {
				if (i != j && str1.charAt(i) == str1.charAt(j)) {
					unique = false;
					break;
				}
			}
			if (unique) {
				char y = str1.charAt(i);
				String z = Character.toString(y);
				System.out.println(Integer.parseInt(z));
				break;
			}
		}

	}

}
