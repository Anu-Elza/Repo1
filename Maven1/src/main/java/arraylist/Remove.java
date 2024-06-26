package arraylist;

import java.util.ArrayList;

public class Remove{

	public static void main(String[] args) {
        ArrayList <String> obj=new ArrayList <String>();
       obj.add("Red");
       obj.add("Green");
       obj.add("Blue");
       obj.add("Yellow");
       obj.add("Black");
        obj.remove("Red");
        System.out.println(obj);

	}

}