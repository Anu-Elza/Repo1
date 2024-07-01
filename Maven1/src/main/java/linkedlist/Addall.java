package linkedlist;


import java.util.LinkedList;

public class Addall {

	public static void main(String[] args) {
        LinkedList <String> obj=new LinkedList <String>();
        obj.add("Red");
        obj.add("Green");
        obj.add("Blue");
        obj.add("Yellow");
        obj.add("Black");
        LinkedList <String> obj1=new LinkedList <String>();
        obj.add("Java");
        obj.add("Python");
        
        obj.addAll(obj1);
        System.out.println(obj);

	}

}
