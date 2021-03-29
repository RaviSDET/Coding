package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DeleteAnArray {

	public static void main(String[] args) {
	int [] arr = {1,2,3,4,5};
	System.out.println("Original Array : "+Arrays.toString(arr)); 
	int index=4;
	for(int i=index;i<arr.length-1;i++) {
		arr[i]=arr[i+1];
	}
	for(int i=0;i<arr.length-1;i++) 
	System.out.println(arr[i]+" ");
	
	
	List<Integer> l = new ArrayList<Integer>(Arrays.asList(1,3,4,55,24));
	
	l.remove(2);
	
	System.out.println(l);
	
	l.removeAll(l);
	System.out.println(l);
	
	
	
	}

}
