package Arrays;

import java.util.LinkedList;

public class AddRun {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		int start=1;
		int last=16;
		for(int i=start;i<last;i++) {
			if(i%3==0) 
				list.add("run");
			else {
				list.add(String.valueOf(i));
			}
			
		}
		System.out.println(list);


	}

}
