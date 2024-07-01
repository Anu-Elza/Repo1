package assignment_aggregation;

public class Address {
	String address;
	Student ref;
	
	public Address(String address,Student ref ) {
		this.address=address;
		this.ref= ref;
	}
	public void display() {
		System.out.println(ref.name);
		System.out.println(ref.rolnum);
		System.out.println(address);
	}

	public static void main(String[] args) {
		Student obj= new Student("Anu",25);
		Address obje= new Address("Plamkoo",obj);
		obje.display();
		
		
		// TODO Auto-generated method stub

	}

}