package linkedlist;


import java.util.LinkedList;

public class Isempty {

	public static void main(String[] args) {
        LinkedList <String> obj=new LinkedList <String>();
       obj.add("Red");
       obj.add("Green");
       obj.add("Blue");
       obj.add("Yellow");
       obj.add("Black");
        boolean a=obj.isEmpty();
        System.out.println(a);

	}

}