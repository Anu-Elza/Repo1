package Mavensample;

public class Accessmodifiers {
	
	public void Display1()
	{
	System.out.println("Public method");
	}
	private void Display2()
	{
		System.out.println("Private method");
	}
	
	protected void Display3()
	{
		System.out.println("Protected method");
	}
	
	void Display4()
	{
		System.out.println("default method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Accessmodifiers obj=new Accessmodifiers();
		obj.Display1();
		obj.Display2();
		obj.Display3();
		obj.Display4();

	}

}
