package assignment_polymorphism;

public class Offseason extends Onseason{
	public void discount() {
		super.discount(1600);
		int disct2= (price*15)/100;
		System.out.println("Offseason discounted price is" +" "+ disct2);
		
	}

	public static void main(String[] args) {
		Offseason obj= new Offseason();
		obj.discount();
		
		// TODO Auto-generated method stub

	}

}