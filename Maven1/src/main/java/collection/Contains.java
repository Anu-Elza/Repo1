package collection;

import java.util.ArrayList;
import java.util.List;

public class Contains {

	public static void main(String[] args) {
		List <String> obj= new ArrayList <String>();
		obj.add("Red");
		obj.add("Green");
		obj.add("Blue");
	    boolean a=obj.contains("Blue");
		System.out.println(a);
		

	}

}
