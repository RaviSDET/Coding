package Numbers;

public class ReplaceDigits {

	public static void main(String[] args) {
		int num =1234;
		String s= Integer.toString(num);
		String str="";
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='4')
				str =str+"0";
			else
				str=str+s.charAt(i);
		}
		System.out.println(str);
	}

}
