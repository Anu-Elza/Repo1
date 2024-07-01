package assignment_constructor;

public class AreaOfShapes 
{
	public int area(int length , int width)
	{
		int a1 = length * width;
		return a1;
	}
	public double area(double radius)
	{
		double a2 = Math.PI * radius * radius;
		return a2;
	}
	public int area(int side)
	{
		int a3 = side * side;
		return a3;
	}

	public static void main(String[] args) 
	{
		AreaOfShapes obj = new AreaOfShapes();
		
		System.out.println("Area of rectangle is :" +obj.area(1, 2));
		System.out.println("Area of Circle is :" +obj.area(5));
		System.out.println("Area of Square is :" +obj.area(4));
		

	}

}