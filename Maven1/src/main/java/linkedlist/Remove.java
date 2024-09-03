package linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;

public class Remove{

	public static void main(String[] args) {
        LinkedList <String> obj=new LinkedList <String>();
       obj.add("Red");
       obj.add("Green");
       obj.add("Blue");
       obj.add("Yellow");
       obj.add("Black");
        obj.remove("Red");
        System.out.println(obj);

	}

}
