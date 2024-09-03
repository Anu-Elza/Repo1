package assignment_polymorphism;

public class Onseason {
	int price;
	public void discount(int price) {
		this.price=price;
		int disct1= (price*40)/100;
		System.out.println("Onseason discounted price is" +" "+ disct1);
		
	}

}