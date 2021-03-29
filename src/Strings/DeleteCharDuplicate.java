package Strings;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class DeleteCharDuplicate {
	public static void main(String args[]){
	     // Scanner sc = new Scanner(System.in);
	    
	      String s = "teassstingt";
	      char[] myArray = s.toCharArray();
	   
	      Set set = new LinkedHashSet();

	      for(char c:myArray){
	       if(!set.add(c)==false) {
	            System.out.println(c);
	         }
	      }
	   }
}
