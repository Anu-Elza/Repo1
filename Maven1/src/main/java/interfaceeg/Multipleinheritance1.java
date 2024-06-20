package interfaceeg;

public class Multipleinheritance1 implements Multipleinterface1,Multipleinterface2 {
	
	public static void main(String[] args)
	{
		Multipleinheritance1 obj=new Multipleinheritance1();
		obj.display();
		obj.display1();
		obj.display2();
	}

	@Override
	public void display2() {
		System.out.println("Parent2");
		
	}

	@Override
	public void display1() {
		System.out.println("Parent1");
		
	}
	public void display()
	{
		System.out.println("Multiple inheritance using interface");
	}

}
