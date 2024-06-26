package arraylist;

import java.util.ArrayList;

public class Addall {

	public static void main(String[] args) {
        ArrayList <String> obj=new ArrayList <String>();
        obj.add("Red");
        obj.add("Green");
        obj.add("Blue");
        obj.add("Yellow");
        obj.add("Black");
        ArrayList <String> obj1=new ArrayList <String>();
        obj.add("Java");
        obj.add("Python");
        
        obj.addAll(obj1);
        System.out.println(obj);

	}

}

