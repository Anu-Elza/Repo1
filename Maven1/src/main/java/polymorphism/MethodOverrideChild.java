package polymorphism;

public class MethodOverrideChild extends MethodoverrideParent {
	public void display()
	{
		System.out.println("Welcome to JAVA");
		super.display();
	}

	public static void main(String[] args) {
		MethodOverrideChild obj=new MethodOverrideChild();
		obj.display();
	
		

	}

}
