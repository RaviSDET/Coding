package Strings;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import javax.print.attribute.HashAttributeSet;

public class B {
	static int x;

	public static void main(String[] args) {
		try {
			x = 10 / 0;
		} 
		catch (ArrayIndexOutOfBoundsException e) {
			x=10/1;
			e.printStackTrace();
		} 
		catch (ArithmeticException y) {
			y.printStackTrace();
		}
//			finally {
//			System.out.println("closing the broswer");
//
//		}
		System.out.println("Testing in progress");
	}
}
