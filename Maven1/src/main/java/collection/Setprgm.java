package collection;

import java.util.ArrayList;
import java.util.List;

public class Setprgm {

	public static void main(String[] args) {
		List <String> obj= new ArrayList <String>();
		obj.add("Red");
		obj.add("Green");
		obj.add("Blue");
		System.out.println(obj);
		obj.set(1, "Yellow");
		System.out.println(obj);
		

	}

}

