package exception;

public class Arithmeticexception {

	public static void main(String[] args) {
		
		int a=3;
		int b=0;
		try
		{
		int c=a/b;
		System.out.println(c);
		}
		/*
		catch(ArithmeticException e)
		{
			System.out.println("Exception occured"+ " "+e);
		}
		*/
		finally
		{
			System.out.println("Execute");
		}
		}

	}



