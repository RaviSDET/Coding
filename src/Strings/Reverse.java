package Strings;

public class Reverse {
public static void main(String[] args) {
	String s="testing";
	int lenth=s.length();
	String rev="";
	for(int i=lenth-1; i>=0;i--) {
		rev=rev+s.charAt(i);
	}
	System.out.println(rev);
}
}
