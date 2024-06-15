package thiskeyword;

public class Child1 extends Parent1 {
	String color="red";
	
	public void display()
	{
		System.out.println(color);
		System.out.println(super.color);
	}

	public static void main(String[] args) {
		Child1 obj=new Child1();
		obj.display();
		

	}

}
