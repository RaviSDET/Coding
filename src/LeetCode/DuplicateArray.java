package LeetCode;

import java.util.HashSet;
import java.util.Set;

import javax.print.attribute.HashAttributeSet;

public class DuplicateArray {

	public static void main(String[] args) {
		int [] arr = {1,2,3,5};
		Set set = new HashSet();
		for(int i:arr) {
			if(!set.add(i)==false) {
				System.out.println(i);
			}
		}

	}

}
