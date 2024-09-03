package collection;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Hashset {

	public static void main(String[] args) {
		Set obj = new HashSet();
		obj.add("ammu");
		obj.add(25);
		obj.add("mini");
		obj.add("aswathi");
		obj.add(65);
	
		System.out.println(obj);
		obj.remove(25);
		System.out.println(obj);
		boolean b = obj.isEmpty();
		System.out.println(b);
		

		// obj.clear(); System.out.println(obj);

		Iterator it = obj.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		it.remove();
		System.out.println(obj);

	}

}