package arraylist;

import java.util.ArrayList;

public class Isempty {

	public static void main(String[] args) {
        ArrayList <String> obj=new ArrayList <String>();
       obj.add("Red");
       obj.add("Green");
       obj.add("Blue");
       obj.add("Yellow");
       obj.add("Black");
        boolean a=obj.isEmpty();
        System.out.println(a);

	}

}