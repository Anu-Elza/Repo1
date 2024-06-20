package abstracthide;

public class Exabstractionchild extends Exabstraction {

	public static void main(String[] args) {
		Exabstractionchild obj=new Exabstractionchild();
		obj.display1();
		obj.display2();
		
		
		

	}

	@Override
	public void display2() {
		System.out.println("Abstract methode");
		System.out.println("e");
		
		
	}

}
