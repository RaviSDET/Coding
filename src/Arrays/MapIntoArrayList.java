package Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class MapIntoArrayList {
	public static void main(String[] args) {

		Map<String, Integer> marks = new HashMap<String, Integer>();
		marks.put("A", 100);
		marks.put("B", 100);
		marks.put("C", 100);
		marks.put("D", 100);

		//System.out.println(marks);

//		Iterator it = marks.keySet().iterator();
//
//		while (it.hasNext()) {
//			it.next();
//		}

		List<String> list = new ArrayList<String>(marks.keySet());
		System.out.println(list);

		List<Integer> l = new ArrayList<Integer>(marks.values());
		System.out.println(l);

}
}
