package assignment_inheritance;
import java.util.Scanner;
public class Parent1 {
	public int basicpay;
	public int deduction;
	public int bonus;


	public void display1() {
		
		System.out.println("Enter the basicpay");
		Scanner obj= new Scanner(System.in);
		 basicpay= obj.nextInt();
		System.out.println("Enter the deduction");
		 deduction= obj.nextInt();
		System.out.println("Enter the bonus");
		 bonus= obj.nextInt();

	}

}