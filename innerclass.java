import java.util.*;
class car
{
	private String name;
	private int carno;
	private String color;
	
	public void getval()
	{
		Scanner sc = new Scanner(System.in);
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
			System.out.println("NAME::::::"+name);
			if(car.this.name.equals("BMW"))
			{
				size="BIG";
				System.out.println("1");
			}
			else if(car.this.name.equals("MARUTI"))
			{
				size="MEDIUM";
			}
			else if(car.this.name.equals("NANO"))
			{
				size="SMALL";
			}
			else
			{
				size="NOT DEFINED";
				System.out.println("2");
			}
		}
		public void getengineno()
		{
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter the engine number");
			engineno= sc.nextInt();
		}
		public void display()
		{
			System.out.println("Name of the car::"+ name);
			System.out.println("Number of the car::"+ carno);
			System.out.println("Color of the car::"+ color);
			System.out.println("Engine Size of the car::"+ size);
			System.out.println("Engine number of the car"+ engineno);
		}
	}
}

class innerclass
{
	public static void main(String args[])
	{
		car c1= new car();
		c1.getval();
		car.engine e1=c1.new engine();
		e1.getengineno();
		e1.display();
	}
}
			
		