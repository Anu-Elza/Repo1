package assignment_constructor;

public class GradeCalculator 
{
	int mark1;
	int mark2;
	int mark3;
	int total;
public  GradeCalculator(int mark1, int mark2 , int mark3)
{
	this.mark1 = mark1;
	this.mark2 = mark2;
	this.mark3 = mark3; 
	
	
}
public void studentGrade()
{
	total = mark1 + mark2 + mark3;
	
	 
	if (total>=100)
	{
		System.out.println("Grade A");
	}
	else if (total>=50 && total<100)
	{
		System.out.println("Grade B");
	}
	else if(total>0 && total<50)
	{
		System.out.println("Grade C");
	}
	else
	{
		System.out.println("Invalid Marks");
	}
	
}
public int totalValue()
{
	return total;
}
	public static void main(String[] args) 
	{
		GradeCalculator std1 = new GradeCalculator(30,40,50);
		GradeCalculator std2 = new GradeCalculator(10,25,30);
		std1.studentGrade();
		std2.studentGrade();
		System.out.println("The total mark for Student 1 is: " +std1.totalValue());
		System.out.println("The total mark for Student 2 is: " +std2.totalValue());

	}

}
