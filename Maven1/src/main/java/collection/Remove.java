package collection;

import java.util.ArrayList;
import java.util.List;

public class Remove {

	public static void main(String[] args) {
		List <String> obj= new ArrayList <String>();
		obj.add("Red");
		obj.add("Green");
		obj.add("Blue");
		obj.remove(1);
		System.out.println(obj);
		obj.remove("Red");
		System.out.println(obj);
		

	}

}