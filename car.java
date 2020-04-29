import java.util.*;
class car
{
	private String name;
	private int carno;
	private String color;
	
	public void getval()
	{
		Scanner sc = new Scanner(System.in)
		System.out.println("Enter the car name");
		name=sc.next();
		System.out.println("Enter the car number");
		carno=sc.nextInt();
		System.out.println("Enter the car color");
		color=sc.next();
	}
	
	class engine
	{
		private int engineno;
		private String size;
		
		engine()
		{
			if(name=="BMW")
			{
				size="BIG";
			}
			else if(name=="MARUTI")
			{
				size="MEDIUM";
			}
			else if(name=="NANO")
			{
				size="SMALL";
			}
			else
			{
			}
		}
		
		public void display()
		{
			System.out.println("Name of the car"+ name);
			System.out.println("Number of the car"+ carno);
			System.out.println("Color of the car"+ color);
			System.out.println("Engine of the car"+ engineno);
			//System.out.println("Name of the car"+ name);
		}
	}
}

class innerclass
{
	public static void main(String args[])
	{
		car c1= new car();
		c1.getval();
		c1.display();
	}
}
			
		