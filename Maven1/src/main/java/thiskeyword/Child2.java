package thiskeyword;

public class Child2 extends Parent2 {
	public void display()
	{
		System.out.println("Sum is");
		super.add(10,55);
	}

	public static void main(String[] args) {
		
		Child2 obj=new Child2();
		obj.display();
		
		
		

	}

}
