package Inheritance;

public class Hierarchical1 extends Hierarchical {
	
	public void display2()
	{
		System.out.println("Hi");
	}

	public static void main(String[] args) {
		
		Hierarchical1 obj=new Hierarchical1();
		obj.display2();
		obj.display1();
		
		

	}

}
