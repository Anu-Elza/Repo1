package assignment_interface;

public class Hdfc implements Rbi {
	int amount;
	int year;
	int interest;

	public static void main(String[] args) {
		Hdfc obj = new Hdfc();
		obj.recurntdepost(250000, 5, 8);

		// TODO Auto-generated method stub

	}

	@Override
	public void recurntdepost(int amount, int year, int rate) {

		interest = (amount * rate * year) / 100;
		System.out.println("Deposited amount -" + " " + amount);
		System.out.println("Year -" + " " + year);
		System.out.println("Rate -" + " " + rate+"%");
		System.out.println("Interest -" + " " + interest);
		

		// TODO Auto-generated method stub

	}
}
