package assignment_abstraction;

public class Contract extends Employee {

	public static void main(String[] args) {
		Contract obj= new Contract();
		obj.calculateSalary(800, 5);
		obj.FullTimeEmployee();
		// TODO Auto-generated method stub

	}

	@Override
	public void calculateSalary(int payment, int time) {
		this.payment=payment;
		int contrctrSal= payment*time;
		System.out.println("Contractor Salary-"+contrctrSal);
		
		// TODO Auto-generated method stub
		
	}

	

}
