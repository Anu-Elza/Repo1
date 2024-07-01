package assignment_constructor;

public class AvarageOfNumbers 
{
	
	
	public void average(int num1, int num2, int num3)
	{
	int	avg1 = (num1 + num2 + num3)/3;
		System.out.println("Average of integer values is :" +avg1);
		
	}
	public void average(float num4, float num5, float num6)
	{
	float	avg2 = (num4 + num5 + num6)/3;
		System.out.println("Average of float values is :" +avg2);
		
	}

	public static void main(String[] args) 
	{
		AvarageOfNumbers obj1 = new AvarageOfNumbers();
		
		obj1.average(1,10, 1);
		obj1.average(5.5f, 0.25f, 103.342f);
		
		

	}

}
