package collection;

import java.util.ArrayList;
import java.util.List;

public class Occurence {

	public static void main(String[] args) {
		List<Integer>obj= new ArrayList<Integer>();
		{
		obj.add(5);
		obj.add(8);
		obj.add(6);
		obj.add(8);
		
		int firstoccurance=obj.indexOf(8);
		System.out.println(firstoccurance);
		int lastoccurance=obj.lastIndexOf(8);
		System.out.println(lastoccurance);
	}

}
}