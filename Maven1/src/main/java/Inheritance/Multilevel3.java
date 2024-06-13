package Inheritance;

public class Multilevel3 extends Multilevel2 {
	public void display3()
	{
		System.out.println("World");
	}

	public static void main(String[] args) {
		Multilevel3 obj=new Multilevel3();
		obj.display1();
		obj.display2();
		obj.display3();
		
		

	}

}
