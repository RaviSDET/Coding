package Strings;

import java.util.ArrayList;

public class StartsWith {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("ravi");
		list.add("test");
		list.add("run");
		list.add("rahul");
		int count = 0;
		for (String s : list) {
			if (s.startsWith("r")) {
				count++;
			}
		}
		System.out.println(count);
	//--------------------------------------------------------------------------
	long l= list.stream().filter(r->r.startsWith("t")).count();
	System.out.println(l);
	}

}
