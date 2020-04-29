import.java.util.*;
class GeometricObject
{
	private String color;
	private boolean filled;
	
	GeometricObject()
	{
		color="white";
		filled=false;
	}
	
	GeometricObject( String a, boolean b)
	{
		this.color=a;
		this.filled=b;
	}
		
	
	public String getcolor()
	{
		Scanner sc= new Scanner (System.in)
		System.out.println("Enter the colour");
		color = sc.nextLine();
		return color;
	}
	
	public void setColor( String color)
	{
		color = yellow;
	}
	
	public boolean isFilled()
	{
		Scanner sc = new Scanner (System.in)
		System.out.println("Is the ballon filled?")
		filled= sc.nextBoolean();
		return filled;
	}
	
	public void setFilled(boolean filled)
	{
		filled = false;
	}
	
	public String toString()
	{
		String a = "The ballon is filled";
	}
}

class circle extends GeometricObject
{
	private double radius;
	
	circle()
	{
		super();
		radius =0.00;
		
	}
	
	circle(double r1)
	{
		super();
		radius =r1;
	}
	
	circle( double a,String b, boolean c)
	{
		super(b,c);
		radius =a;
	}
	
	public double getRadius()
	{
		Scanner sc = new Scanner (System.in)
		System.out.println("Enter the radius")
		radius= sc.Double();
		return radius;
	}
	
	public void setRadius(double a)
	{
		a=radius;
	}
	
	public double getArea()
	{
		area= 3.14*radius*radius;
		return area;
	}
	
	public double getPerimeter()
	{
		perimeter = 2*3.14.radius;
		return perimeter;
	}
	
	public double get Diameter()
	{
		diameter= radius+radius;
		return diameter;
	}
	
	public void printCircle()
	{
		System.out.println("