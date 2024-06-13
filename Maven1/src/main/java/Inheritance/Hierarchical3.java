package Inheritance;

public class Hierarchical3 extends Hierarchical {
	
	public void display3()
	{
		System.out.println("World");
	}

	public static void main(String[] args) {
		
		Hierarchical3 obj=new Hierarchical3();
		obj.display3();
		obj.display1();
		
		

	}

}

