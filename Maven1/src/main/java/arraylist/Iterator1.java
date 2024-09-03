package arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator1 {

	public static void main(String[] args) {
        ArrayList <String> obj=new ArrayList <String>();
        obj.add("Red");
        obj.add("Green");
        obj.add("Blue");
        obj.add("Yellow");
      Iterator<String> it=obj.iterator();
      while(it.hasNext())
      {
    	  System.out.println(it.next());
      }
      it.remove();
      System.out.println(obj);
	}

}
