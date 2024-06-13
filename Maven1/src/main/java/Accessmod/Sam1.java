package Accessmod;



public class Sam1 {
	
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
		Sam1 obj=new Sam1();
		obj.Display1();
		obj.Display2();
		obj.Display3();
		obj.Display4();

	}

}

