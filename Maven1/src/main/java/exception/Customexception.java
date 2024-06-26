package exception;

public class Customexception{
	public void calculate(int age) throws InvalidException 
	{
		
		if(age>=18)
		{
		System.out.println("Eligible for voting");
		}
		else
		{
		throw new InvalidException("Invalid age entered");
		}
		}

	public static void main(String[] args) throws InvalidException {
		Customexception obj=new Customexception();
		obj.calculate(10);
		
	}
}
